package com.ttc.finch_station_app.network

import com.ttc.finch_station_app.model.response.FinchStationDetailsResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiInterface {

    @GET("/finch_station.json")
    fun getFinchStationDetails(): Observable<FinchStationDetailsResponse>
}