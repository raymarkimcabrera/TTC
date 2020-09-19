package com.ttc.finch_station_app.di.module.activity

import androidx.appcompat.app.AppCompatActivity
import com.ttc.finch_station_app.MainActivity
import com.ttc.finch_station_app.di.module.BaseActivityModule
import com.ttc.finch_station_app.utils.PerActivity
import dagger.Binds
import dagger.Module

@Module(includes = [BaseActivityModule::class])
abstract class MainActivityModule {
    @Binds
    @PerActivity
    abstract fun mainActivity(mainActivity: MainActivity): AppCompatActivity
}