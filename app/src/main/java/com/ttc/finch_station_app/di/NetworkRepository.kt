package com.ttc.finch_station_app.di

import com.ttc.finch_station_app.model.response.FinchStationDetailsResponse
import io.reactivex.Observable

interface NetworkRepository {

    fun getFinchStationDetails(): Observable<FinchStationDetailsResponse>
}