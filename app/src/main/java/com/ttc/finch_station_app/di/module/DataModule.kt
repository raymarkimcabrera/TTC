package com.ttc.finch_station_app.di.module

import com.ttc.finch_station_app.di.NetworkManager
import com.ttc.finch_station_app.di.NetworkRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DataModule {

    @Binds
    @Singleton
    internal abstract fun networkRepository(networkManager: NetworkManager): NetworkRepository
}