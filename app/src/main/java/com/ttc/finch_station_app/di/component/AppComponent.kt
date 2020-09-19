package com.ttc.finch_station_app.di.component

import com.ttc.finch_station_app.base.BaseApplication
import com.ttc.finch_station_app.di.module.*
import com.ttc.finch_station_app.di.module.ActivityBuilderModule
import com.ttc.finch_station_app.di.module.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class,
        ViewModelModule::class,
        NetworkModule::class,
        DataModule::class,
        UtilsModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<BaseApplication>
}