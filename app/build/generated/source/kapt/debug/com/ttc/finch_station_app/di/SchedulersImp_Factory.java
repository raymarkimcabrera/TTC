package com.ttc.finch_station_app.di;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SchedulersImp_Factory implements Factory<SchedulersImp> {
  private static final SchedulersImp_Factory INSTANCE = new SchedulersImp_Factory();

  @Override
  public SchedulersImp get() {
    return new SchedulersImp();
  }

  public static SchedulersImp_Factory create() {
    return INSTANCE;
  }

  public static SchedulersImp newInstance() {
    return new SchedulersImp();
  }
}
