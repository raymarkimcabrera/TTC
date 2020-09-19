package com.ttc.finch_station_app.di

import com.ttc.finch_station_app.model.local.StationDetails
import io.reactivex.Observable

interface NetworkRepository {

    fun getFinchStationDetails(): Observable<StationDetails>
}