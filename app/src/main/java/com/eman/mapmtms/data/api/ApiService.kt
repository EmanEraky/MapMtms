package com.eman.mapmtms.data.api

import com.eman.mapmtms.domain.models.MapPlace
import com.eman.mapmtms.domain.models.ResultMap
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {
    @GET("json?radius=500")
    suspend fun getPlaces(@Query("location") location :String,
                            @Query("key") key :String): ResultMap



//    https://maps.googleapis.com/maps/api/place/nearbysearch/json?
//    // location=30.4962302,31.0046322&radius=500&key=AIzaSyCafU3zidMWHcnjBMmP9zr3AjjHf5-KiiA
}