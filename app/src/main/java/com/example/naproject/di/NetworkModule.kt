package com.example.naproject.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create

val spacexApi:SpacexApi = Retrofit.Builder().baseUrl("https://api.spacexdata.com/v3/")
    .client(OkHttpClient.Builder().addInterceptor{  chain ->
        val request = chain.request().newBuilder().addHeader("CF-RAY","455459c6cd4c9b08-DFW").build()
        chain.proceed(request)


    }.build())
    .addConverterFactory(Json(builderAction = {
        ignoreUnknownKeys = true
    }).asConverterFactory("application/json".toMediaType()))
    .build()
    .create()




