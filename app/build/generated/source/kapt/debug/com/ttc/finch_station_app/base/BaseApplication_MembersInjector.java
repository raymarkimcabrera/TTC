package com.ttc.finch_station_app.base;

import dagger.MembersInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
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
public final class BaseApplication_MembersInjector implements MembersInjector<BaseApplication> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public BaseApplication_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector<BaseApplication> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new BaseApplication_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(BaseApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
  }
}
