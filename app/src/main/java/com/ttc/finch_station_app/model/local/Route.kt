package com.ttc.finch_station_app.model.local

import com.google.gson.annotations.SerializedName

data class Route(
    @SerializedName("route_group_id") val routeGroupId: String,
    @SerializedName("stop_times") val stopTimes: List<StopTime>?,
    val name: String,
    val uri: String
)