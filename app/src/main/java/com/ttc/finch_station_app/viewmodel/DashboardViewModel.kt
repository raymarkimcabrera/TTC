package com.ttc.finch_station_app.viewmodel

import com.ttc.finch_station_app.base.BaseViewModel
import com.ttc.finch_station_app.di.usecase.GetFinchStationDetailsUseCase
import timber.log.Timber
import javax.inject.Inject

class DashboardViewModel
@Inject constructor(private val getFinchStationDetailsUseCase: GetFinchStationDetailsUseCase) : BaseViewModel() {

    fun getFinchStationDetails() {
        compositeDisposable.add(
            getFinchStationDetailsUseCase.execute()
                .subscribe({
                    Timber.e("Success")
                }, {
                    it.printStackTrace()
                })
        )
    }
}