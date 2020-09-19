package com.example.poc.di.module

import com.example.poc.di.Schedulers
import com.example.poc.di.SchedulersImp
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UtilsModule {

    @Binds
    @Singleton
    abstract fun provideSchedulers(schedulers: SchedulersImp): Schedulers

}