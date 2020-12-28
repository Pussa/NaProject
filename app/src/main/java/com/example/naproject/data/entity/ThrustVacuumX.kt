package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ThrustVacuumX(
    @SerialName("kN")
    val kN: Int?,
    @SerialName("lbf")
    val lbf: Int?
)