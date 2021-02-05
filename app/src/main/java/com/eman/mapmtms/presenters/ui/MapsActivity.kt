package com.eman.mapmtms.presenters.ui

import android.os.Bundle
import android.annotation.SuppressLint
import android.view.Gravity
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import com.eman.mapmtms.R
import com.eman.mapmtms.databinding.ActivityMapsBinding
import com.eman.mapmtms.domain.models.Place
import com.eman.mapmtms.presenters.adapter.PlacesAdapter
import com.eman.mapmtms.presenters.listener.Place_Listener
import com.eman.trudocapp.utils.Status
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MapsActivity : FragmentActivity(),  Place_Listener {

    companion object {
          var lastLocation = ""
    }

    lateinit var binding: ActivityMapsBinding
    private val mainViewModel: MainViewModel by viewModels()

    private var flagType = false


    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil.setContentView(this,R.layout.activity_maps)


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
            binding.recyclePlace.visibility = View.GONE
            flagType = true
            mainViewModel.getPlacesResponse(lastLocation, getString(R.string.google_maps_key))
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
}
