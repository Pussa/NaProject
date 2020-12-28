package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HeightX(
    @SerialName("feet")
    val feet: Float?,
    @SerialName("meters")
    val meters: Float?
)