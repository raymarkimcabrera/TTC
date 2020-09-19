package com.ttc.finch_station_app.di.module

import com.ttc.finch_station_app.MainActivity
import com.ttc.finch_station_app.di.module.activity.MainActivityModule
import com.ttc.finch_station_app.utils.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityBuilderModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity

}