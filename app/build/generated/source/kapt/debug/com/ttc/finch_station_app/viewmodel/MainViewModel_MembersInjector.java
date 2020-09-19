package com.ttc.finch_station_app.viewmodel;

import com.ttc.finch_station_app.base.BaseViewModel_MembersInjector;
import com.ttc.finch_station_app.di.Schedulers;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_MembersInjector implements MembersInjector<MainViewModel> {
  private final Provider<Schedulers> schedulersProvider;

  public MainViewModel_MembersInjector(Provider<Schedulers> schedulersProvider) {
    this.schedulersProvider = schedulersProvider;
  }

  public static MembersInjector<MainViewModel> create(Provider<Schedulers> schedulersProvider) {
    return new MainViewModel_MembersInjector(schedulersProvider);}

  @Override
  public void injectMembers(MainViewModel instance) {
    BaseViewModel_MembersInjector.injectSchedulers(instance, schedulersProvider.get());
  }
}
