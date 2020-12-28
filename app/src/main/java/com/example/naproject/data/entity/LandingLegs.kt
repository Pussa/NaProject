package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LandingLegs(
    @SerialName("material")
    val material: String?,
    @SerialName("number")
    val number: Int?
)