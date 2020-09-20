package com.ttc.finch_station_app.model.local

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Route(
    @SerializedName("route_group_id") val routeGroupId: String,
    @SerializedName("stop_times") val stopTimes: List<StopTime>?,
    val name: String,
    val uri: String
) : Parcelable