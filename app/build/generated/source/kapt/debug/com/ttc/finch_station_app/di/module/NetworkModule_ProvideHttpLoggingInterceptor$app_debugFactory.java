package com.ttc.finch_station_app.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideHttpLoggingInterceptor$app_debugFactory implements Factory<HttpLoggingInterceptor> {
  private final NetworkModule module;

  public NetworkModule_ProvideHttpLoggingInterceptor$app_debugFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return provideHttpLoggingInterceptor$app_debug(module);
  }

  public static NetworkModule_ProvideHttpLoggingInterceptor$app_debugFactory create(
      NetworkModule module) {
    return new NetworkModule_ProvideHttpLoggingInterceptor$app_debugFactory(module);
  }

  public static HttpLoggingInterceptor provideHttpLoggingInterceptor$app_debug(
      NetworkModule instance) {
    return Preconditions.checkNotNull(instance.provideHttpLoggingInterceptor$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
