package com.ttc.finch_station_app.extensions

import java.text.SimpleDateFormat
import java.util.*

fun Long.parseToDate() : Date{
    return Date(this * 1000L)
}
