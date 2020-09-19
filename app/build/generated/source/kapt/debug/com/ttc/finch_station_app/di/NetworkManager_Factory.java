package com.ttc.finch_station_app.di;

import com.ttc.finch_station_app.network.ApiInterface;
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
public final class NetworkManager_Factory implements Factory<NetworkManager> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  public NetworkManager_Factory(Provider<ApiInterface> apiInterfaceProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
  }

  @Override
  public NetworkManager get() {
    return new NetworkManager(apiInterfaceProvider.get());
  }

  public static NetworkManager_Factory create(Provider<ApiInterface> apiInterfaceProvider) {
    return new NetworkManager_Factory(apiInterfaceProvider);
  }

  public static NetworkManager newInstance(ApiInterface apiInterface) {
    return new NetworkManager(apiInterface);
  }
}
