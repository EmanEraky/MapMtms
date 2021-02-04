package com.eman.mapmtms.presenters.ui

import android.view.View
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eman.mapmtms.domain.models.MapPlace
import com.eman.mapmtms.domain.models.Place
import com.eman.mapmtms.domain.models.ResultMap
import com.eman.mapmtms.domain.useCases.PlaceUseCase
import com.eman.mapmtms.presenters.adapter.PlacesAdapter
import com.eman.trudocapp.utils.Resource
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor
    (val mainRepositoryUseCase: PlaceUseCase) :
    ViewModel() {
    private val _places = MutableLiveData<Resource<ResultMap>>()
    val places: MutableLiveData<Resource<ResultMap>>
        get() = _places

    val myDB = FirebaseFirestore.getInstance()
    private val _sourceLocation = MutableLiveData<List<Place>>()
    val sourceLocation: MutableLiveData<List<Place>>
        get() = _sourceLocation

    fun getPlacesResponse(location: String, key: String) {
        viewModelScope.launch {
            _places.postValue(Resource.loading(null))
                mainRepositoryUseCase.getPlaces(location,key).collect {
                    _places.postValue(it)
                }
        }
    }

    fun getSourceLocation(){
        val allSource = mutableListOf<Place>()
        myDB.collection("Source")
            .get().addOnSuccessListener {
                it.forEach {
                    println(it.get("name"))
                    val p = Place(
                        name = it.get("name").toString(),
                        latitude = it.get("latitude").toString().toFloat(),
                        longtude = it.get("longitude").toString().toFloat()
                    )
                    allSource.add(p)
                    _sourceLocation.postValue(allSource)

                }
            }
    }

    fun insertLocation(path:String , place:Place){
        val docRef = myDB.collection(path).document(place.name)
        docRef.addSnapshotListener(object : EventListener<DocumentSnapshot?> {
            override fun onEvent(value: DocumentSnapshot?, error: FirebaseFirestoreException?) {
                if (!value!!.exists()) {
                    //Insert
                    myDB.collection(path).document(place.name).set(place)
                } else {
                    //update
                }
            }
        })
    }

}