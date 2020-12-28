package com.example.naproject

import android.os.ParcelFileDescriptor
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable


@Parcelize
@Serializable
data class Rocket( val name: String, val successPct: Int,val coastPerLaunch : Int,
val description: String) : Parcelable{
}