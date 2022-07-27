package com.example.ghiblipeople.models

import com.google.gson.annotations.SerializedName

data class PeopleDetailModel(

    @SerializedName("id")
    val id: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("gender")
    val gender: String
)