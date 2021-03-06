package com.ttc.finch_station_app.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ttc.finch_station_app.di.Schedulers
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BaseViewModel : ViewModel() {

    @Inject
    lateinit var schedulers: Schedulers
    var compositeDisposable: CompositeDisposable = CompositeDisposable()
    var loading = MutableLiveData(false)
    var error = MutableLiveData<Throwable>()

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
}