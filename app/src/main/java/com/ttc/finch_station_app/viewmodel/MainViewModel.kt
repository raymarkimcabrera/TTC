package com.ttc.finch_station_app.viewmodel

import com.ttc.finch_station_app.base.BaseViewModel
import com.ttc.finch_station_app.di.usecase.GetPostUseCase
import timber.log.Timber
import javax.inject.Inject

class MainViewModel
@Inject constructor(private val getPostUseCase: GetPostUseCase) : BaseViewModel() {

    fun getPost() {
        compositeDisposable.add(
            getPostUseCase.execute()
                .subscribe({
                    Timber.e("Success")
                }, {
                    it.printStackTrace()
                })
        )
    }
}