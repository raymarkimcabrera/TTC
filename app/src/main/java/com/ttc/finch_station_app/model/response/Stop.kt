package com.ttc.finch_station_app.model.response

data class Stop(
    val name: String,
    val routes: List<Route>?,
    val uri: String,
    val agency: String
)