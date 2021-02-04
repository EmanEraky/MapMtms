package com.eman.trudocapp.data.repo

import com.eman.mapmtms.data.api.ApiService
import com.eman.mapmtms.domain.models.MapPlace
import com.eman.mapmtms.domain.models.ResultMap
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiPlaceRepo @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getPlaces(location: String, key: String): Flow<Resource<ResultMap>> {
        return flow {
            emit(Resource.loading(null))
            val resource = try {
                val place = apiService.getPlaces(location, key)
                Resource.success(place)
            } catch (e: Throwable) {
                Resource.error(e.toString(), null)
            }
            emit(resource)
        }
    }
}