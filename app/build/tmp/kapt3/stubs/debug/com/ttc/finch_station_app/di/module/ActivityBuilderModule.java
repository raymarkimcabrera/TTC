package com.ttc.finch_station_app.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/ttc/finch_station_app/di/module/ActivityBuilderModule;", "", "()V", "dashboardActivity", "Lcom/ttc/finch_station_app/presentation/dashboard/DashboardActivity;", "splashScreenActivity", "Lcom/ttc/finch_station_app/presentation/splash_screen/SplashScreenActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBuilderModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.ttc.finch_station_app.utils.PerActivity()
    public abstract com.ttc.finch_station_app.presentation.splash_screen.SplashScreenActivity splashScreenActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.ttc.finch_station_app.di.module.activity.DashboardActivityModule.class})
    @com.ttc.finch_station_app.utils.PerActivity()
    public abstract com.ttc.finch_station_app.presentation.dashboard.DashboardActivity dashboardActivity();
    
    public ActivityBuilderModule() {
        super();
    }
}