package com.ttc.finch_station_app.di

import com.ttc.finch_station_app.model.local.StationDetails
import com.ttc.finch_station_app.network.ApiInterface
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkManager
@Inject constructor(private val apiInterface: ApiInterface): NetworkRepository{

    override fun getFinchStationDetails(): Observable<StationDetails> {
       return apiInterface.getFinchStationDetails()
    }
}