package com.eman.mapmtms.presenters.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eman.mapmtms.domain.models.Place
import com.eman.mapmtms.domain.models.ResultMap
import com.eman.mapmtms.domain.useCases.PlaceUseCase
import com.eman.trudocapp.utils.Resource
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(val mainRepositoryUseCase: PlaceUseCase) :
    ViewModel() {
    private val _places = MutableLiveData<Resource<ResultMap>>()
    val places: MutableLiveData<Resource<ResultMap>>
        get() = _places

    var myDB : FirebaseFirestore = FirebaseFirestore.getInstance()
    private val _sourceLocation = MutableLiveData<List<Place>>()
    val sourceLocation: MutableLiveData<List<Place>>
        get() = _sourceLocation

    fun getPlacesResponse(location: String, key: String) {
        viewModelScope.launch {
            _places.postValue(Resource.loading(null))
            mainRepositoryUseCase.getPlaces(location, key).collect {
                _places.postValue(it)
            }
        }
    }

    fun getSourceLocation() {
        myDB.collection("Source").get().addOnCompleteListener { task ->
            if (task.isSuccessful()) {
                val driversArrayList = mutableListOf<Place>()
                for (dc in task.getResult()) {
                    val sourceLocation: Place = dc.toObject(Place::class.java)
                    driversArrayList.add(sourceLocation)
                }
                _sourceLocation.setValue(driversArrayList)
            }
        }
    }

    fun insertLocation(path: String, place: Place) {
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