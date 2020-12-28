package com.example.naproject.data

import android.content.SharedPreferences
import com.example.naproject.Rocket
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class MostSuccessfulRocketsDaoImpl(private val sharedPreferences: SharedPreferences) :
    MostSuccessfulRocketsDao {

    private var rockets: List<Rocket>
        get() {
            return sharedPreferences.getString(TOP_DAO_KEY, null)?.let {
                Json.decodeFromString<List<Rocket>>(it)


            } ?: emptyList()

        }
        set(value) {
            sharedPreferences.edit().putString(
                TOP_DAO_KEY,
                Json.encodeToString(value)
            ).apply()
        }

    override fun sort(rockets: List<Rocket>) {
        rockets.sort()
    }

    override fun getAll(): List<Rocket> {
        return rockets
    }

    override fun isInTop(rocket: Rocket):Boolean {
        return rockets.contains(rocket)
    }

    companion object {
        private const val TOP_DAO_KEY = "TOP_DAO_KEY"

    }


    fun List<Rocket>.sort(): List<Rocket> = this.sortedBy { it.successPct }

}