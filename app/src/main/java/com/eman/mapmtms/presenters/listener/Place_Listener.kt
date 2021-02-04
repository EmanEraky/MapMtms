package com.eman.mapmtms.presenters.listener

import com.eman.mapmtms.domain.models.Place

interface Place_Listener {
    fun onClickPlace(place : Place)
}