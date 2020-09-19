package com.ttc.finch_station_app.viewmodel

import androidx.lifecycle.MutableLiveData
import com.ttc.finch_station_app.base.BaseViewModel
import com.ttc.finch_station_app.di.usecase.GetFinchStationDetailsUseCase
import com.ttc.finch_station_app.model.response.Stop
import timber.log.Timber
import javax.inject.Inject

class DashboardViewModel
@Inject constructor(private val getFinchStationDetailsUseCase: GetFinchStationDetailsUseCase) :
    BaseViewModel() {

    val stopList = MutableLiveData<MutableList<Stop>>()
    val stationName = MutableLiveData<String>()
    val currentTime = MutableLiveData<String>()

    fun getFinchStationDetails() {
        compositeDisposable.add(
            getFinchStationDetailsUseCase.execute()
                .doOnSubscribe {
                    loading.postValue(true)
                }
                .doOnComplete {
                    loading.postValue(false)
                }
                .subscribe({
                    Timber.e("stopList ${it.stops}")
                    stopList.postValue(it.stops.toMutableList())
                    stationName.postValue(it.name)
                    loading.postValue(false)
                }, {

                })
        )
    }
}