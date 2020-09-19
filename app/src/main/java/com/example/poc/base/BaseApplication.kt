package com.example.poc.base

import com.example.poc.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

class BaseApplication : DaggerApplication()  {

    override fun onCreate() {
        super.onCreate()
        val timberTree = Timber.DebugTree()
        Timber.plant(timberTree)
    }
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.factory().create(this)
}