package com.ttc.finch_station_app.model.local

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Stop(
    val name: String,
    val routes: List<Route>?,
    val uri: String,
    val agency: String
) : Parcelable