package com.example.poc.di.module

import com.example.poc.MainActivity
import com.example.poc.di.module.activity.MainActivityModule
import com.example.poc.utils.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityBuilderModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity

}