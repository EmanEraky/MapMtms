package com.eman.mapmtms.presenters.ui

import android.content.pm.PackageManager
import android.location.Location
import android.os.Build
import android.os.Bundle
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import android.Manifest
import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.location.LocationManager
import android.provider.Settings
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import com.google.android.gms.location.*
import com.eman.mapmtms.R
import com.eman.mapmtms.databinding.ActivityMapsBinding
import com.eman.mapmtms.domain.models.Place
import com.eman.mapmtms.presenters.adapter.PlacesAdapter
import com.eman.mapmtms.presenters.listener.Place_Listener
import com.eman.trudocapp.utils.Status
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MapsActivity : FragmentActivity(), OnMapReadyCallback, Place_Listener , GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener {
    private var service: LocationManager? = null
    private var enabled: Boolean? = null
    private var mLocationRequest: LocationRequest? = null
    private var mGoogleApiClient: GoogleApiClient? = null
    private var mLastLocation: Location? = null
    private var mCurrLocationMarker: Marker? = null
    private lateinit var mMap: GoogleMap
    private var REQUEST_LOCATION_CODE = 101


    lateinit var binding: ActivityMapsBinding
    private val mainViewModel: MainViewModel by viewModels()

    private var flagType = false

    override fun onLocationChanged(location: Location?) {
        mLastLocation = location
        if (mCurrLocationMarker != null) {
            mCurrLocationMarker!!.remove()
        }

        //Place current location marker
        val latLng = LatLng(location!!.latitude, location.longitude)
        val markerOptions = MarkerOptions()
        markerOptions.position(latLng)
        markerOptions.title("Current Position")
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        mCurrLocationMarker = mMap.addMarker(markerOptions)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15f))

    }

    override fun onConnected(p0: Bundle?) {
        mLocationRequest = LocationRequest()
        mLocationRequest!!.interval = 1000
        mLocationRequest!!.fastestInterval = 1000
        mLocationRequest!!.priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY

        // Check if enabled and if not send user to the GPS settings
        if (!enabled!!) {
            val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(intent);
        }
        // Check if permission is granted or not
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this)
        }
    }

    override fun onConnectionSuspended(p0: Int) {
    }

    override fun onConnectionFailed(p0: ConnectionResult) {
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil.setContentView(this,R.layout.activity_maps)
        service = this.getSystemService(LOCATION_SERVICE) as LocationManager
        enabled = service!!.isProviderEnabled(LocationManager.GPS_PROVIDER)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


        binding.edtLocation.setOnTouchListener(View.OnTouchListener { v, event ->
            binding.edtLocation.setFocusable(true)
            binding.edtLocation.setFocusableInTouchMode(true)
            flagType = false
            mainViewModel.getSourceLocation()
            false
        })

        binding.imgMenu.setOnClickListener{
            binding.layDrawer.setGravity(Gravity.LEFT)
            binding.drawerLayout.openDrawer(Gravity.LEFT)
        }

        binding.edtDist.setOnTouchListener(View.OnTouchListener { v, event ->
            binding.edtDist.setFocusable(true)
            binding.edtDist.setFocusableInTouchMode(true)
            binding.recyclePlace.visibility = View.VISIBLE
            var loc = ""
            mLastLocation?.let {
                val x = it.latitude
                val y = it.longitude
                loc = "$x,$y"
            }
            binding.recyclePlace.visibility = View.GONE
            flagType = true
            mainViewModel.getPlacesResponse(loc, getString(R.string.google_maps_key))
            false
        })
        setObservePlaces()
        getObserveSource()
    }


    private fun getObserveSource() {
        mainViewModel.sourceLocation.observe(this, Observer {
            if (it.size > 0) {
                binding.recyclePlace.visibility = View.VISIBLE
                val mAdapter = PlacesAdapter(it, this)
                binding.recyclePlace.adapter = mAdapter
            }
        })
    }

    private fun setObservePlaces() {
        mainViewModel.places.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    val allSource = mutableListOf<Place>()
                    it.data?.let { it ->
                        for (p in it.results) {
                            allSource.add(
                                Place(
                                    p.name,
                                    p.geometry.location.lat,
                                    p.geometry.location.lng
                                )
                            )
                        }
                        binding.recyclePlace.visibility = View.VISIBLE
                        val mAdapter = PlacesAdapter(allSource, this)
                        binding.recyclePlace.adapter = mAdapter
                    }
                }
                Status.ERROR -> {
                }
                Status.LOADING -> {

                }
            }
        })
    }

    override fun onClickPlace(place: Place) {
        if (flagType) {
            binding.edtDist.setText(place.name)
            binding.recyclePlace.visibility = View.GONE

            mainViewModel.insertLocation("destinationLocation", place)

        } else {
            binding.edtLocation.setText(place.name)
            binding.recyclePlace.visibility = View.GONE

            mainViewModel.insertLocation("sourceLocation", place)

        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                buildGoogleApiClient()
                mMap.isMyLocationEnabled = true
            } else {
                checkLocationPermission()
            }
        } else {
            buildGoogleApiClient()
            mMap.isMyLocationEnabled = true
        }
    }

    @Synchronized
    fun buildGoogleApiClient() {
        mGoogleApiClient = GoogleApiClient.Builder(this)
            .addConnectionCallbacks(this)
            .addOnConnectionFailedListener(this)
            .addApi(LocationServices.API)
            .build()

        mGoogleApiClient!!.connect()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            REQUEST_LOCATION_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                        if (mGoogleApiClient == null) {
                            buildGoogleApiClient()
                        }
                        mMap.isMyLocationEnabled = true
                    }
                } else {
                    Toast.makeText(this, "permission denied", Toast.LENGTH_LONG).show()
                }
                return
            }
        }
    }

    private fun checkLocationPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {
                AlertDialog.Builder(this)
                    .setTitle("Location Permission Needed")
                    .setMessage("This app needs the Location permission, please accept to use location functionality")
                    .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
                        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_LOCATION_CODE)
                    })
                    .create()
                    .show()

            } else ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_LOCATION_CODE)
        }
    }
}
