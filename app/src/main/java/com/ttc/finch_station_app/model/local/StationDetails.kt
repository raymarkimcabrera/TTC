package com.ttc.finch_station_app.model.local

class StationDetails(val time: Long,
                     val stops: List<Stop>,
                     val uri: String,
                     val name: String)