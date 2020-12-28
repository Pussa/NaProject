package com.example.naproject.di

import com.example.naproject.data.entity.RocketsResponse
import com.example.naproject.data.entity.RocketsResponseItem
import retrofit2.http.GET
import retrofit2.http.Query

interface SpacexApi{

    @GET("rockets")
    suspend fun getRockets(
        @Query("id") id:Boolean = false,
        @Query("limit") limit:Int =0,
        @Query("offset") offset:Int =0
    ):ArrayList<RocketsResponseItem>


}