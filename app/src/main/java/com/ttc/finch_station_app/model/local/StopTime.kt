package com.ttc.finch_station_app.model.local

import com.google.gson.annotations.SerializedName
import java.util.*

data class StopTime(
    @SerializedName("departure_time") val departureTime: String,
    val shape: String,
    @SerializedName("departure_timestamp") val departureTimeStamp: Long,
    @SerializedName("service_id") val serviceId: String
)