package com.ttc.finch_station_app.di.module.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/ttc/finch_station_app/di/module/activity/MainActivityModule;", "", "()V", "mainActivity", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ttc/finch_station_app/MainActivity;", "app_debug"})
@dagger.Module(includes = {com.ttc.finch_station_app.di.module.BaseActivityModule.class})
public abstract class MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.ttc.finch_station_app.utils.PerActivity()
    @dagger.Binds()
    public abstract androidx.appcompat.app.AppCompatActivity mainActivity(@org.jetbrains.annotations.NotNull()
    com.ttc.finch_station_app.MainActivity mainActivity);
    
    public MainActivityModule() {
        super();
    }
}