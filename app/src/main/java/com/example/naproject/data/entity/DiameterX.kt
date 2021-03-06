package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DiameterX(
    @SerialName("feet")
    val feet: Float?,
    @SerialName("meters")
    val meters: Float?
)