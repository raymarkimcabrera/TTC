package com.ttc.finch_station_app.viewmodel

import androidx.lifecycle.MutableLiveData
import com.ttc.finch_station_app.base.BaseViewModel
import com.ttc.finch_station_app.di.usecase.GetFinchStationDetailsUseCase
import com.ttc.finch_station_app.model.local.Stop
import io.reactivex.disposables.Disposable
import timber.log.Timber
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class DashboardViewModel
@Inject constructor(private val getFinchStationDetailsUseCase: GetFinchStationDetailsUseCase) :
    BaseViewModel() {

    val stopList = MutableLiveData<MutableList<Stop>>()
    val stationName = MutableLiveData<String>()
    private var getStationDetailsDisposable: Disposable? = null

    fun getFinchStationDetails() {
        Timber.e("getFinchStationDetails")
        if (getStationDetailsDisposable != null)
            getStationDetailsDisposable?.dispose()
        getStationDetailsDisposable = getFinchStationDetailsUseCase.execute()
            .subscribe({
                stopList.postValue(it.stops.toMutableList())
                stationName.postValue(it.name)
                loading.postValue(false)
            }, {
                error.postValue(it)
            })
        getStationDetailsDisposable?.let {
            compositeDisposable.add(it)
        }
    }

    fun stopDisposables() {
        Timber.e("stopDisposables")
        getStationDetailsDisposable?.dispose()
    }
}