package com.example.poc.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.poc.utils.ActivityContext
import com.example.poc.utils.PerActivity
import dagger.Binds
import dagger.Module

@Module
abstract class BaseActivityModule {

    @Binds
    @PerActivity
    @ActivityContext
    internal abstract fun activityContext(activity: AppCompatActivity): Context
}