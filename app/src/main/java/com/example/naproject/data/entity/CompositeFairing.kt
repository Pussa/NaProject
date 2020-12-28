package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CompositeFairing(
    @SerialName("diameter")
    val diameter: DiameterX?,
    @SerialName("height")
    val height: HeightX?
)