package com.ttc.finch_station_app.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientRestAPI$app_debugFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  public NetworkModule_ProvideOkHttpClientRestAPI$app_debugFactory(NetworkModule module,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    this.module = module;
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClientRestAPI$app_debug(module, httpLoggingInterceptorProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientRestAPI$app_debugFactory create(
      NetworkModule module, Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    return new NetworkModule_ProvideOkHttpClientRestAPI$app_debugFactory(module, httpLoggingInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClientRestAPI$app_debug(NetworkModule instance,
      HttpLoggingInterceptor httpLoggingInterceptor) {
    return Preconditions.checkNotNull(instance.provideOkHttpClientRestAPI$app_debug(httpLoggingInterceptor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
