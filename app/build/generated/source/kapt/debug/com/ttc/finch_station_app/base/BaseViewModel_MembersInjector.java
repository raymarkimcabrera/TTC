package com.ttc.finch_station_app.base;

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
public final class BaseViewModel_MembersInjector implements MembersInjector<BaseViewModel> {
  private final Provider<Schedulers> schedulersProvider;

  public BaseViewModel_MembersInjector(Provider<Schedulers> schedulersProvider) {
    this.schedulersProvider = schedulersProvider;
  }

  public static MembersInjector<BaseViewModel> create(Provider<Schedulers> schedulersProvider) {
    return new BaseViewModel_MembersInjector(schedulersProvider);}

  @Override
  public void injectMembers(BaseViewModel instance) {
    injectSchedulers(instance, schedulersProvider.get());
  }

  public static void injectSchedulers(BaseViewModel instance, Schedulers schedulers) {
    instance.schedulers = schedulers;
  }
}
