package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RocketsResponseItem(
    @SerialName("active")
    val active: Boolean?,
    @SerialName("boosters")
    val boosters: Int?,
    @SerialName("company")
    val company: String?,
    @SerialName("cost_per_launch")
    val costPerLaunch: Int?,
    @SerialName("country")
    val country: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("diameter")
    val diameter: Diameter?,
    @SerialName("engines")
    val engines: Engines?,
    @SerialName("first_flight")
    val firstFlight: String?,
    @SerialName("first_stage")
    val firstStage: FirstStage?,
    @SerialName("height")
    val height: Height?,
    @SerialName("id")
    val id: Int?,
    @SerialName("landing_legs")
    val landingLegs: LandingLegs?,
    @SerialName("mass")
    val mass: Mass?,
    @SerialName("payload_weights")
    val payloadWeights: List<PayloadWeight>?,
    @SerialName("rocket_id")
    val rocketId: String?,
    @SerialName("rocket_name")
    val rocketName: String?,
    @SerialName("rocket_type")
    val rocketType: String?,
    @SerialName("second_stage")
    val secondStage: SecondStage?,
    @SerialName("stages")
    val stages: Int?,
    @SerialName("success_rate_pct")
    val successRatePct: Int?,
    @SerialName("wikipedia")
    val wikipedia: String?
)