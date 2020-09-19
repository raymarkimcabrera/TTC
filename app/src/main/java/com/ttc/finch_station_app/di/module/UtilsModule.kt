package com.ttc.finch_station_app.di.module

import com.ttc.finch_station_app.di.Schedulers
import com.ttc.finch_station_app.di.SchedulersImp
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UtilsModule {

    @Binds
    @Singleton
    abstract fun provideSchedulers(schedulers: SchedulersImp): Schedulers

}