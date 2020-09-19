package com.ttc.finch_station_app.di.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideGsonConverterFactory$app_debugFactory implements Factory<GsonConverterFactory> {
  private final NetworkModule module;

  private final Provider<Gson> gsonProvider;

  public NetworkModule_ProvideGsonConverterFactory$app_debugFactory(NetworkModule module,
      Provider<Gson> gsonProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public GsonConverterFactory get() {
    return provideGsonConverterFactory$app_debug(module, gsonProvider.get());
  }

  public static NetworkModule_ProvideGsonConverterFactory$app_debugFactory create(
      NetworkModule module, Provider<Gson> gsonProvider) {
    return new NetworkModule_ProvideGsonConverterFactory$app_debugFactory(module, gsonProvider);
  }

  public static GsonConverterFactory provideGsonConverterFactory$app_debug(NetworkModule instance,
      Gson gson) {
    return Preconditions.checkNotNull(instance.provideGsonConverterFactory$app_debug(gson), "Cannot return null from a non-@Nullable @Provides method");
  }
}
