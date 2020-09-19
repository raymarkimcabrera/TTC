package com.ttc.finch_station_app.di.module;

import com.ttc.finch_station_app.presentation.splash_screen.SplashScreenActivity;
import com.ttc.finch_station_app.utils.PerActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.Generated;

@Module(
  subcomponents = ActivityBuilderModule_SplashScreenActivity.SplashScreenActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBuilderModule_SplashScreenActivity {
  private ActivityBuilderModule_SplashScreenActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SplashScreenActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashScreenActivitySubcomponent.Factory builder);

  @Subcomponent
  @PerActivity
  public interface SplashScreenActivitySubcomponent extends AndroidInjector<SplashScreenActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SplashScreenActivity> {}
  }
}
