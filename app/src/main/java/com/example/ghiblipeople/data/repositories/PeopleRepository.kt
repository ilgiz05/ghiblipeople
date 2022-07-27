package com.example.ghiblipeople.data.repositories

import com.example.ghiblipeople.base.BaseRepository
import com.example.ghiblipeople.data.apiservices.PeopleApiServices
import javax.inject.Inject

class PeopleRepository @Inject constructor(private val apiServices: PeopleApiServices) :
    BaseRepository() {

    fun fetchPeople() = doRequest { apiServices.fetchPeople() }

    fun fetchPeopleId(id: String) = doRequestId { apiServices.fetchPeopleId(id) }
}

