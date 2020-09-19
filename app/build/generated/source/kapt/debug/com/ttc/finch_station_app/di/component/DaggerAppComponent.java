package com.ttc.finch_station_app.di.component;

import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import com.ttc.finch_station_app.base.BaseActivity_MembersInjector;
import com.ttc.finch_station_app.base.BaseApplication;
import com.ttc.finch_station_app.di.NetworkManager;
import com.ttc.finch_station_app.di.NetworkManager_Factory;
import com.ttc.finch_station_app.di.SchedulersImp;
import com.ttc.finch_station_app.di.SchedulersImp_Factory;
import com.ttc.finch_station_app.di.module.ActivityBuilderModule_DashboardActivity;
import com.ttc.finch_station_app.di.module.ActivityBuilderModule_SplashScreenActivity;
import com.ttc.finch_station_app.di.module.NetworkModule;
import com.ttc.finch_station_app.di.module.NetworkModule_ProvideApiInterface$app_debugFactory;
import com.ttc.finch_station_app.di.module.NetworkModule_ProvideGson$app_debugFactory;
import com.ttc.finch_station_app.di.module.NetworkModule_ProvideGsonConverterFactory$app_debugFactory;
import com.ttc.finch_station_app.di.module.NetworkModule_ProvideHttpLoggingInterceptor$app_debugFactory;
import com.ttc.finch_station_app.di.module.NetworkModule_ProvideOkHttpClientRestAPI$app_debugFactory;
import com.ttc.finch_station_app.di.module.NetworkModule_ProvideRetrofitInterface$app_debugFactory;
import com.ttc.finch_station_app.di.usecase.GetPostUseCase;
import com.ttc.finch_station_app.di.usecase.GetPostUseCase_Factory;
import com.ttc.finch_station_app.network.ApiInterface;
import com.ttc.finch_station_app.presentation.dashboard.DashboardActivity;
import com.ttc.finch_station_app.presentation.splash_screen.SplashScreenActivity;
import com.ttc.finch_station_app.utils.ViewModelFactory;
import com.ttc.finch_station_app.utils.ViewModelFactory_Factory;
import com.ttc.finch_station_app.viewmodel.MainViewModel;
import com.ttc.finch_station_app.viewmodel.MainViewModel_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuilderModule_SplashScreenActivity.SplashScreenActivitySubcomponent.Factory> splashScreenActivitySubcomponentFactoryProvider;

  private Provider<ActivityBuilderModule_DashboardActivity.DashboardActivitySubcomponent.Factory> dashboardActivitySubcomponentFactoryProvider;

  private Provider<SchedulersImp> schedulersImpProvider;

  private Provider<HttpLoggingInterceptor> provideHttpLoggingInterceptor$app_debugProvider;

  private Provider<OkHttpClient> provideOkHttpClientRestAPI$app_debugProvider;

  private Provider<Gson> provideGson$app_debugProvider;

  private Provider<GsonConverterFactory> provideGsonConverterFactory$app_debugProvider;

  private Provider<Retrofit> provideRetrofitInterface$app_debugProvider;

  private Provider<ApiInterface> provideApiInterface$app_debugProvider;

  private Provider<NetworkManager> networkManagerProvider;

  private Provider<GetPostUseCase> getPostUseCaseProvider;

  private Provider<MainViewModel> mainViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<ViewModelFactory> viewModelFactoryProvider;

  private DaggerAppComponent(NetworkModule networkModuleParam, BaseApplication arg0) {

    initialize(networkModuleParam, arg0);
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(2).put(SplashScreenActivity.class, (Provider) splashScreenActivitySubcomponentFactoryProvider).put(DashboardActivity.class, (Provider) dashboardActivitySubcomponentFactoryProvider).build();}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize(final NetworkModule networkModuleParam, final BaseApplication arg0) {
    this.splashScreenActivitySubcomponentFactoryProvider = new Provider<ActivityBuilderModule_SplashScreenActivity.SplashScreenActivitySubcomponent.Factory>() {
      @Override
      public ActivityBuilderModule_SplashScreenActivity.SplashScreenActivitySubcomponent.Factory get(
          ) {
        return new SplashScreenActivitySubcomponentFactory();}
    };
    this.dashboardActivitySubcomponentFactoryProvider = new Provider<ActivityBuilderModule_DashboardActivity.DashboardActivitySubcomponent.Factory>() {
      @Override
      public ActivityBuilderModule_DashboardActivity.DashboardActivitySubcomponent.Factory get() {
        return new DashboardActivitySubcomponentFactory();}
    };
    this.schedulersImpProvider = DoubleCheck.provider(SchedulersImp_Factory.create());
    this.provideHttpLoggingInterceptor$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideHttpLoggingInterceptor$app_debugFactory.create(networkModuleParam));
    this.provideOkHttpClientRestAPI$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideOkHttpClientRestAPI$app_debugFactory.create(networkModuleParam, provideHttpLoggingInterceptor$app_debugProvider));
    this.provideGson$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideGson$app_debugFactory.create(networkModuleParam));
    this.provideGsonConverterFactory$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideGsonConverterFactory$app_debugFactory.create(networkModuleParam, provideGson$app_debugProvider));
    this.provideRetrofitInterface$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitInterface$app_debugFactory.create(networkModuleParam, provideOkHttpClientRestAPI$app_debugProvider, provideGsonConverterFactory$app_debugProvider));
    this.provideApiInterface$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideApiInterface$app_debugFactory.create(networkModuleParam, provideRetrofitInterface$app_debugProvider));
    this.networkManagerProvider = DoubleCheck.provider(NetworkManager_Factory.create(provideApiInterface$app_debugProvider));
    this.getPostUseCaseProvider = DoubleCheck.provider(GetPostUseCase_Factory.create((Provider) schedulersImpProvider, (Provider) networkManagerProvider));
    this.mainViewModelProvider = MainViewModel_Factory.create(getPostUseCaseProvider, (Provider) schedulersImpProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider = MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(1).put(MainViewModel.class, (Provider) mainViewModelProvider).build();
    this.viewModelFactoryProvider = DoubleCheck.provider(ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
  }

  @Override
  public void inject(BaseApplication arg0) {
    injectBaseApplication(arg0);}

  private BaseApplication injectBaseApplication(BaseApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Factory extends AppComponent.Factory {
    @Override
    public AppComponent create(BaseApplication arg0) {
      Preconditions.checkNotNull(arg0);
      return new DaggerAppComponent(new NetworkModule(), arg0);
    }
  }

  private final class SplashScreenActivitySubcomponentFactory implements ActivityBuilderModule_SplashScreenActivity.SplashScreenActivitySubcomponent.Factory {
    @Override
    public ActivityBuilderModule_SplashScreenActivity.SplashScreenActivitySubcomponent create(
        SplashScreenActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new SplashScreenActivitySubcomponentImpl(arg0);
    }
  }

  private final class SplashScreenActivitySubcomponentImpl implements ActivityBuilderModule_SplashScreenActivity.SplashScreenActivitySubcomponent {
    private SplashScreenActivitySubcomponentImpl(SplashScreenActivity arg0) {

    }

    @Override
    public void inject(SplashScreenActivity arg0) {
      injectSplashScreenActivity(arg0);}

    private SplashScreenActivity injectSplashScreenActivity(SplashScreenActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseActivity_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
      return instance;
    }
  }

  private final class DashboardActivitySubcomponentFactory implements ActivityBuilderModule_DashboardActivity.DashboardActivitySubcomponent.Factory {
    @Override
    public ActivityBuilderModule_DashboardActivity.DashboardActivitySubcomponent create(
        DashboardActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new DashboardActivitySubcomponentImpl(arg0);
    }
  }

  private final class DashboardActivitySubcomponentImpl implements ActivityBuilderModule_DashboardActivity.DashboardActivitySubcomponent {
    private DashboardActivitySubcomponentImpl(DashboardActivity arg0) {

    }

    @Override
    public void inject(DashboardActivity arg0) {
      injectDashboardActivity(arg0);}

    private DashboardActivity injectDashboardActivity(DashboardActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      BaseActivity_MembersInjector.injectViewModelFactory(instance, DaggerAppComponent.this.viewModelFactoryProvider.get());
      return instance;
    }
  }
}
