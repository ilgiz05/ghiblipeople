package com.example.ghiblipeople.data.apiservices

import com.example.ghiblipeople.models.PeopleDetailModel
import com.example.ghiblipeople.models.PeopleModel
import retrofit2.http.GET
import retrofit2.http.Path

interface PeopleApiServices {

    @GET("people")
    suspend fun fetchPeople(): List<PeopleModel>

    @GET("people/{id}")
    suspend fun fetchPeopleId(
        @Path("id") id: String
    ): PeopleDetailModel
}
