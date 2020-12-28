package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Engines(
    @SerialName("engine_loss_max")
    val engineLossMax: Int?,
    @SerialName("layout")
    val layout: String?,
    @SerialName("number")
    val number: Int?,
    @SerialName("propellant_1")
    val propellant1: String?,
    @SerialName("propellant_2")
    val propellant2: String?,
    @SerialName("thrust_sea_level")
    val thrustSeaLevel: ThrustSeaLevel?,
    @SerialName("thrust_to_weight")
    val thrustToWeight: Float?,
    @SerialName("thrust_vacuum")
    val thrustVacuum: ThrustVacuum?,
    @SerialName("type")
    val type: String?,
    @SerialName("version")
    val version: String?
)