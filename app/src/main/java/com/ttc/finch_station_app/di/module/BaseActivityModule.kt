package com.ttc.finch_station_app.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.ttc.finch_station_app.utils.ActivityContext
import com.ttc.finch_station_app.utils.PerActivity
import dagger.Binds
import dagger.Module

@Module
abstract class BaseActivityModule {

    @Binds
    @PerActivity
    @ActivityContext
    internal abstract fun activityContext(activity: AppCompatActivity): Context
}