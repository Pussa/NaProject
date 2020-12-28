package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SecondStage(
    @SerialName("burn_time_sec")
    val burnTimeSec: Int?,
    @SerialName("engines")
    val engines: Int?,
    @SerialName("fuel_amount_tons")
    val fuelAmountTons: Float?,
    @SerialName("payloads")
    val payloads: Payloads?,
    @SerialName("thrust")
    val thrust: Thrust?
)