package com.ttc.finch_station_app.model.response

data class FinchStationDetailsResponse(
    val time: Long,
    val stops: List<Stop>,
    val uri: String,
    val name: String
)