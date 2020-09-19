package com.ttc.finch_station_app.model.local

data class Stop(
    val name: String,
    val routes: List<Route>?,
    val uri: String,
    val agency: String
)