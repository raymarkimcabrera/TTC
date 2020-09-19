package com.example.poc.viewmodel

import com.example.poc.base.BaseViewModel
import com.example.poc.di.usecase.GetPostUseCase
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