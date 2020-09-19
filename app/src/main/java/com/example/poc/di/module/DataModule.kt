package com.example.poc.di.module

import com.example.poc.di.NetworkManager
import com.example.poc.di.NetworkRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DataModule {

    @Binds
    @Singleton
    internal abstract fun networkRepository(networkManager: NetworkManager): NetworkRepository
}