package com.example.naproject.data.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Payloads(
    @SerialName("composite_fairing")
    val compositeFairing: CompositeFairing?,
    @SerialName("option_1")
    val option1: String?,
    //@SerialName("option_2")
   // val option2: String?
)