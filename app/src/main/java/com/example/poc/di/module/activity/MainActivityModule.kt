package com.example.poc.di.module.activity

import androidx.appcompat.app.AppCompatActivity
import com.example.poc.MainActivity
import com.example.poc.di.module.BaseActivityModule
import com.example.poc.utils.PerActivity
import dagger.Binds
import dagger.Module

@Module(includes = [BaseActivityModule::class])
abstract class MainActivityModule {
    @Binds
    @PerActivity
    abstract fun mainActivity(mainActivity: MainActivity): AppCompatActivity
}