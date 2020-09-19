package com.ttc.finch_station_app.di.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideGson$app_debugFactory implements Factory<Gson> {
  private final NetworkModule module;

  public NetworkModule_ProvideGson$app_debugFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return provideGson$app_debug(module);
  }

  public static NetworkModule_ProvideGson$app_debugFactory create(NetworkModule module) {
    return new NetworkModule_ProvideGson$app_debugFactory(module);
  }

  public static Gson provideGson$app_debug(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.provideGson$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
