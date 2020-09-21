package com.ttc.finch_station_app.di.usecase

import com.ttc.finch_station_app.di.NetworkRepository
import com.ttc.finch_station_app.di.Schedulers
import com.ttc.finch_station_app.model.local.StationDetails
import io.reactivex.Observable
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetFinchStationDetailsUseCase @Inject constructor(private val schedulers: Schedulers,
                                                        private val networkRepository: NetworkRepository){

    fun execute(): Observable<StationDetails>{
        return networkRepository.getFinchStationDetails()
            .subscribeOn(schedulers.io())
            .observeOn(schedulers.ui())
            .repeatWhen { completed ->
                completed.delay(1, TimeUnit.MINUTES)
            }
    }
}