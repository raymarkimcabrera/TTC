package com.ttc.finch_station_app.di.module.activity

import androidx.appcompat.app.AppCompatActivity
import com.ttc.finch_station_app.presentation.splash_screen.SplashScreenActivity
import com.ttc.finch_station_app.di.module.BaseActivityModule
import com.ttc.finch_station_app.presentation.dashboard.DashboardActivity
import com.ttc.finch_station_app.utils.PerActivity
import dagger.Binds
import dagger.Module

@Module(includes = [BaseActivityModule::class])
abstract class DashboardActivityModule {
    @Binds
    @PerActivity
    abstract fun dashboardActivity(dashboardActivity: DashboardActivity): AppCompatActivity
}