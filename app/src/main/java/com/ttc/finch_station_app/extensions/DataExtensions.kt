package com.ttc.finch_station_app.extensions

import java.text.SimpleDateFormat
import java.util.*

const val UTC_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
const val TIME_FORMAT = "hh:mma"

fun Long.parseToTimeString() : String{
    return this.parseToDate().format()
}

fun Long.parseToDate(): Date{
   return Date(this * 1000L)
}
fun Date?.format(format: String = TIME_FORMAT, locate: Locale = Locale.ENGLISH): String {
    return try {
        val dateFormat = SimpleDateFormat(format, locate)
        dateFormat.timeZone = TimeZone.getTimeZone("Canada/Eastern")
        dateFormat.format(this)
    } catch (e: Exception) {
        ""
    }
}
