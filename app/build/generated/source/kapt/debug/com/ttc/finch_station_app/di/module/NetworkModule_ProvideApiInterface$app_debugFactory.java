package com.ttc.finch_station_app.di.module;

import com.ttc.finch_station_app.network.ApiInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideApiInterface$app_debugFactory implements Factory<ApiInterface> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideApiInterface$app_debugFactory(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiInterface get() {
    return provideApiInterface$app_debug(module, retrofitProvider.get());
  }

  public static NetworkModule_ProvideApiInterface$app_debugFactory create(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideApiInterface$app_debugFactory(module, retrofitProvider);
  }

  public static ApiInterface provideApiInterface$app_debug(NetworkModule instance,
      Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.provideApiInterface$app_debug(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
