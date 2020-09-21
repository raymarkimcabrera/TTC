package com.ttc.finch_station_app.di.module

import com.ttc.finch_station_app.di.module.activity.DashboardActivityModule
import com.ttc.finch_station_app.presentation.dashboard.DashboardActivity
import com.ttc.finch_station_app.presentation.routes.RoutesActivity
import com.ttc.finch_station_app.presentation.splash_screen.SplashScreenActivity
import com.ttc.finch_station_app.utils.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityBuilderModule {

    @PerActivity
    @ContributesAndroidInjector
    abstract fun splashScreenActivity(): SplashScreenActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [DashboardActivityModule::class])
    abstract fun dashboardActivity(): DashboardActivity

    @PerActivity
    @ContributesAndroidInjector
    abstract fun routesActivity(): RoutesActivity
}