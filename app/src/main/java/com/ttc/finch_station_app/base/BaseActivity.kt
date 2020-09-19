package com.ttc.finch_station_app.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BaseActivity: DaggerAppCompatActivity() {


    protected var subscriptionsWhileInMemory: CompositeDisposable = CompositeDisposable()
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun initializeViews()
    open fun initializeObservers() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initializeObservers()
        initializeViews()
    }


    override fun onDestroy() {
        super.onDestroy()
        subscriptionsWhileInMemory.clear()
    }


}