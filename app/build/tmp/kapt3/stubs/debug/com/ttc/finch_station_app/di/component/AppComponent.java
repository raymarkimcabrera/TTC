package com.ttc.finch_station_app.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ttc/finch_station_app/di/component/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/ttc/finch_station_app/base/BaseApplication;", "Factory", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.ttc.finch_station_app.di.module.ActivityBuilderModule.class, com.ttc.finch_station_app.di.module.ViewModelModule.class, com.ttc.finch_station_app.di.module.NetworkModule.class, com.ttc.finch_station_app.di.module.DataModule.class, com.ttc.finch_station_app.di.module.UtilsModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.ttc.finch_station_app.base.BaseApplication> {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ttc/finch_station_app/di/component/AppComponent$Factory;", "Ldagger/android/AndroidInjector$Factory;", "Lcom/ttc/finch_station_app/base/BaseApplication;", "()V", "app_debug"})
    @dagger.Component.Factory()
    public static abstract class Factory implements dagger.android.AndroidInjector.Factory<com.ttc.finch_station_app.base.BaseApplication> {
        
        public Factory() {
            super();
        }
    }
}