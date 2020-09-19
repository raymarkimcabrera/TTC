package com.ttc.finch_station_app.di.module;

import com.ttc.finch_station_app.di.module.activity.DashboardActivityModule;
import com.ttc.finch_station_app.presentation.dashboard.DashboardActivity;
import com.ttc.finch_station_app.utils.PerActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(subcomponents = ActivityBuilderModule_DashboardActivity.DashboardActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_DashboardActivity {
  private ActivityBuilderModule_DashboardActivity() {}

  @Binds
  @IntoMap
  @ClassKey(DashboardActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DashboardActivitySubcomponent.Factory builder);

  @Subcomponent(modules = DashboardActivityModule.class)
  @PerActivity
  public interface DashboardActivitySubcomponent extends AndroidInjector<DashboardActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DashboardActivity> {}
  }
}
