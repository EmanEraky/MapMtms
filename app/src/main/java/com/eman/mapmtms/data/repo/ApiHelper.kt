package com.eman.trudocapp.data.repo

import com.eman.mapmtms.domain.models.MapPlace
import com.eman.mapmtms.domain.models.ResultMap
import com.eman.trudocapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface ApiHelper {
    suspend fun getPlaces(location: String, key: String): Flow<Resource<ResultMap>>




}