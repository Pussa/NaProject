package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FirstStage(
    @SerialName("burn_time_sec")
    val burnTimeSec: Int?,
    @SerialName("engines")
    val engines: Int?,
    @SerialName("fuel_amount_tons")
    val fuelAmountTons: Float?,
    @SerialName("reusable")
    val reusable: Boolean?,
    @SerialName("thrust_sea_level")
    val thrustSeaLevel: ThrustSeaLevelX?,
    @SerialName("thrust_vacuum")
    val thrustVacuum: ThrustVacuumX?
)