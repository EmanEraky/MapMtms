package com.eman.mapmtms.domain.useCases

import com.eman.trudocapp.data.repo.ApiHelper
import javax.inject.Inject

class PlaceUseCase  @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getPlaces(location: String, key: String) =
        apiHelper.getPlaces(location, key)

}
