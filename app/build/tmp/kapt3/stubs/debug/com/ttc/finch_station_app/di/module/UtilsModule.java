package com.ttc.finch_station_app.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/ttc/finch_station_app/di/module/UtilsModule;", "", "()V", "provideSchedulers", "Lcom/ttc/finch_station_app/di/Schedulers;", "schedulers", "Lcom/ttc/finch_station_app/di/SchedulersImp;", "app_debug"})
@dagger.Module()
public abstract class UtilsModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.ttc.finch_station_app.di.Schedulers provideSchedulers(@org.jetbrains.annotations.NotNull()
    com.ttc.finch_station_app.di.SchedulersImp schedulers);
    
    public UtilsModule() {
        super();
    }
}