package com.ttc.finch_station_app.di

import com.ttc.finch_station_app.model.response.FinchStationDetailsResponse
import com.ttc.finch_station_app.network.ApiInterface
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkManager
@Inject constructor(private val apiInterface: ApiInterface): NetworkRepository{

    override fun getFinchStationDetails(): Observable<FinchStationDetailsResponse> {
       return apiInterface.getFinchStationDetails()
    }
}