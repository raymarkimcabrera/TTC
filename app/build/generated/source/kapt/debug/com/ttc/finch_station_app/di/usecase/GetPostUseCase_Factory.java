package com.ttc.finch_station_app.di.usecase;

import com.ttc.finch_station_app.di.NetworkRepository;
import com.ttc.finch_station_app.di.Schedulers;
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
public final class GetPostUseCase_Factory implements Factory<GetPostUseCase> {
  private final Provider<Schedulers> schedulersProvider;

  private final Provider<NetworkRepository> networkRepositoryProvider;

  public GetPostUseCase_Factory(Provider<Schedulers> schedulersProvider,
      Provider<NetworkRepository> networkRepositoryProvider) {
    this.schedulersProvider = schedulersProvider;
    this.networkRepositoryProvider = networkRepositoryProvider;
  }

  @Override
  public GetPostUseCase get() {
    return new GetPostUseCase(schedulersProvider.get(), networkRepositoryProvider.get());
  }

  public static GetPostUseCase_Factory create(Provider<Schedulers> schedulersProvider,
      Provider<NetworkRepository> networkRepositoryProvider) {
    return new GetPostUseCase_Factory(schedulersProvider, networkRepositoryProvider);
  }

  public static GetPostUseCase newInstance(Schedulers schedulers,
      NetworkRepository networkRepository) {
    return new GetPostUseCase(schedulers, networkRepository);
  }
}
