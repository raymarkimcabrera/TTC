package com.ttc.finch_station_app.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ttc.finch_station_app.utils.ViewModelFactory
import com.ttc.finch_station_app.utils.ViewModelKey
import com.ttc.finch_station_app.viewmodel.DashboardViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun bindMainViewModel(viewModel: DashboardViewModel): ViewModel
}