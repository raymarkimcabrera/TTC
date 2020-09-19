package com.ttc.finch_station_app.viewmodel;

import com.ttc.finch_station_app.base.BaseViewModel_MembersInjector;
import com.ttc.finch_station_app.di.Schedulers;
import com.ttc.finch_station_app.di.usecase.GetPostUseCase;
import dagger.internal.Factory;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<GetPostUseCase> getPostUseCaseProvider;

  private final Provider<Schedulers> schedulersProvider;

  public MainViewModel_Factory(Provider<GetPostUseCase> getPostUseCaseProvider,
      Provider<Schedulers> schedulersProvider) {
    this.getPostUseCaseProvider = getPostUseCaseProvider;
    this.schedulersProvider = schedulersProvider;
  }

  @Override
  public MainViewModel get() {
    MainViewModel instance = new MainViewModel(getPostUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSchedulers(instance, schedulersProvider.get());
    return instance;
  }

  public static MainViewModel_Factory create(Provider<GetPostUseCase> getPostUseCaseProvider,
      Provider<Schedulers> schedulersProvider) {
    return new MainViewModel_Factory(getPostUseCaseProvider, schedulersProvider);
  }

  public static MainViewModel newInstance(GetPostUseCase getPostUseCase) {
    return new MainViewModel(getPostUseCase);
  }
}
