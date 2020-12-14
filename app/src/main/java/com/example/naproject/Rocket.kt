package com.example.naproject

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Rocket( val name: String, val launches: String) : Parcelable{
}