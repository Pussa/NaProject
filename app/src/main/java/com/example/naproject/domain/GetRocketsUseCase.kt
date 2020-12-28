package com.example.naproject.domain

import com.example.naproject.Rocket
import com.example.naproject.di.SpacexApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.DisposableHandle
import kotlinx.coroutines.withContext

class GetRocketsUseCase constructor(private val spacexApi: SpacexApi) {
    suspend operator fun invoke():List<Rocket> = withContext(Dispatchers.IO){
        val rockets = spacexApi.getRockets()

        val product = rockets.map {
            Rocket(
                name = it.rocketName!!,
                successPct = it.successRatePct!!,
                coastPerLaunch = it.costPerLaunch!!,
                description = it.description!!
            )

        }
        product
    }

}