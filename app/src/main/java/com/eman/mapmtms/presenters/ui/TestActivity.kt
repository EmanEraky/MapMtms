package com.eman.mapmtms.presenters.ui


import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.View.OnTouchListener
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.eman.mapmtms.R
import com.eman.mapmtms.databinding.ActivityMainBinding
import com.eman.mapmtms.domain.models.Place
import com.eman.mapmtms.presenters.adapter.PlacesAdapter
import com.eman.mapmtms.presenters.listener.Place_Listener
import com.eman.trudocapp.utils.Status
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.net.PlacesClient
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TestActivity : AppCompatActivity(), OnMapReadyCallback, Place_Listener {
    private var map: GoogleMap? = null
    private var cameraPosition: CameraPosition? = null
    private lateinit var placesClient: PlacesClient
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private val defaultLocation = LatLng(-33.8523341, 151.2106085)
    private var locationPermissionGranted = false
    private var lastKnownLocation: Location? = null
    var mapFragment: SupportMapFragment? = null

    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    private var flagType = false

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            lastKnownLocation = savedInstanceState.getParcelable(KEY_LOCATION)
            cameraPosition = savedInstanceState.getParcelable(KEY_CAMERA_POSITION)
        }
        binding = DataBindingUtil.setContentView(this, R.layout.activity_maps)
        Places.initialize(applicationContext, getString(R.string.google_maps_key))
        placesClient = Places.createClient(this)
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)

        checkGpsStatus()

        binding.edtLocation.setOnTouchListener(OnTouchListener { v, event ->
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

        binding.edtDist.setOnTouchListener(OnTouchListener { v, event ->
            binding.edtDist.setFocusable(true)
            binding.edtDist.setFocusableInTouchMode(true)
            binding.recyclePlace.visibility = View.VISIBLE
            var loc = ""
            lastKnownLocation?.let {
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


    override fun onSaveInstanceState(outState: Bundle) {
        map?.let { map ->
            outState.putParcelable(KEY_CAMERA_POSITION, map.cameraPosition)
            outState.putParcelable(KEY_LOCATION, lastKnownLocation)
        }
        super.onSaveInstanceState(outState)
    }

    private fun checkGpsStatus() {
        val locationManager = this.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val gpsStatus = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
        if (!gpsStatus) {
            gpsStatus()
        }
    }

    fun gpsStatus() {
//        startActivity(
//            Intent(
//                Settings.ACTION_LOCATION_SOURCE_SETTINGS
//            ))

        startActivityForResult(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS), 1);
    }


    override fun onMapReady(map: GoogleMap) {
        this.map = map
        getLocationPermission()
        updateLocationUI()

        getDeviceLocation()
    }

    private fun getDeviceLocation() {
        try {
            if (locationPermissionGranted) {
                val locationResult = fusedLocationProviderClient.lastLocation
                locationResult.addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        lastKnownLocation = task.result
                        if (lastKnownLocation != null) {
                            map?.moveCamera(
                                CameraUpdateFactory.newLatLngZoom(
                                    LatLng(
                                        lastKnownLocation!!.latitude,
                                        lastKnownLocation!!.longitude
                                    ), DEFAULT_ZOOM.toFloat()
                                )
                            )
                        }
                    } else {
                        Log.d(TAG, "Current location is null. Using defaults.")
                        Log.e(TAG, "Exception: %s", task.exception)
                        map?.moveCamera(
                            CameraUpdateFactory
                                .newLatLngZoom(defaultLocation, DEFAULT_ZOOM.toFloat())
                        )
                        map?.uiSettings?.isMyLocationButtonEnabled = false
                    }
                }
            }
        } catch (e: SecurityException) {
            Log.e("Exception: %s", e.message, e)
        }
    }


    private fun getLocationPermission() {
        if (ContextCompat.checkSelfPermission(
                this.applicationContext,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
            == PackageManager.PERMISSION_GRANTED
        ) {
            locationPermissionGranted = true
        } else {
            ActivityCompat.requestPermissions(
                this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        locationPermissionGranted = false
        when (requestCode) {
            PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION -> {

                // If request is cancelled, the result arrays are empty.
                if (grantResults.isNotEmpty() &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED
                ) {
                    locationPermissionGranted = true
                }
            }
        }
        updateLocationUI()
    }

//    public override fun onResume() {
//        super.onResume()
//        getLocationPermission()
//        updateLocationUI()
//
//        getDeviceLocation()
//    }
    private fun updateLocationUI() {
        if (map == null) {
            return
        }
        try {
            if (locationPermissionGranted) {
                map?.isMyLocationEnabled = true
                map?.uiSettings?.isMyLocationButtonEnabled = true
            } else {
                map?.isMyLocationEnabled = false
                map?.uiSettings?.isMyLocationButtonEnabled = false
                lastKnownLocation = null
                getLocationPermission()
            }
        } catch (e: SecurityException) {
            Log.e("Exception: %s", e.message, e)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        mapFragment?.getMapAsync(this)

    }

    companion object {
        private val TAG = TestActivity::class.java.simpleName
        private const val DEFAULT_ZOOM = 15
        private const val PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1

        private const val KEY_CAMERA_POSITION = "camera_position"
        private const val KEY_LOCATION = "location"
    }


}