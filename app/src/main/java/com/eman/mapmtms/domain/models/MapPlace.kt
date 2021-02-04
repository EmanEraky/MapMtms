package com.eman.mapmtms.domain.models

data class MapPlace(
    val name: String = "",
    val geometry: Geometry = Geometry()
)