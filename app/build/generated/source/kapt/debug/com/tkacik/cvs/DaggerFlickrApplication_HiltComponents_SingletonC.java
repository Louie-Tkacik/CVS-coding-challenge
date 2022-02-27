// Generated by Dagger (https://dagger.dev).
package com.tkacik.cvs;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.squareup.moshi.Moshi;
import com.tkacik.cvs.data.local.database.FlickrDao;
import com.tkacik.cvs.data.local.database.FlickrDataBase;
import com.tkacik.cvs.data.local.datasource.FlickrSearchLocalDataSource;
import com.tkacik.cvs.data.remote.datasource.FlickrSearchRemoteDataSource;
import com.tkacik.cvs.data.remote.service.FlickrService;
import com.tkacik.cvs.data.repository.FlickrRepository;
import com.tkacik.cvs.di.DataSourceModule;
import com.tkacik.cvs.di.DataSourceModule_ProvidesFlickrSearchLocalDataSourceFactory;
import com.tkacik.cvs.di.DataSourceModule_ProvidesFlickrSearchRemoteDataSourceFactory;
import com.tkacik.cvs.di.DatabaseModule;
import com.tkacik.cvs.di.DatabaseModule_ProvidesCommentDaoFactory;
import com.tkacik.cvs.di.DatabaseModule_ProvidesCommentDatabaseFactory;
import com.tkacik.cvs.di.NetworkModule;
import com.tkacik.cvs.di.NetworkModule_ProvidesFlickrServiceFactory;
import com.tkacik.cvs.di.NetworkModule_ProvidesMoshiFactory;
import com.tkacik.cvs.di.NetworkModule_ProvidesOkHttpClientFactory;
import com.tkacik.cvs.di.NetworkModule_ProvidesRetrofitFactory;
import com.tkacik.cvs.di.RepositoryModule;
import com.tkacik.cvs.di.RepositoryModule_ProvidesFlickRepositoryFactory;
import com.tkacik.cvs.presentation.FlickrMainActivity;
import com.tkacik.cvs.presentation.viewmodel.FlickrViewModel;
import com.tkacik.cvs.presentation.viewmodel.FlickrViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerFlickrApplication_HiltComponents_SingletonC extends FlickrApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC = this;

  private Provider<FlickrDataBase> providesCommentDatabaseProvider;

  private Provider<FlickrSearchLocalDataSource> providesFlickrSearchLocalDataSourceProvider;

  private Provider<Moshi> providesMoshiProvider;

  private Provider<OkHttpClient> providesOkHttpClientProvider;

  private Provider<Retrofit> providesRetrofitProvider;

  private Provider<FlickrService> providesFlickrServiceProvider;

  private Provider<FlickrSearchRemoteDataSource> providesFlickrSearchRemoteDataSourceProvider;

  private Provider<FlickrRepository> providesFlickRepositoryProvider;

  private DaggerFlickrApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    initialize(applicationContextModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private FlickrDataBase flickrDataBase() {
    return DatabaseModule_ProvidesCommentDatabaseFactory.providesCommentDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private FlickrDao flickrDao() {
    return DatabaseModule_ProvidesCommentDaoFactory.providesCommentDao(providesCommentDatabaseProvider.get());
  }

  private FlickrSearchLocalDataSource flickrSearchLocalDataSource() {
    return DataSourceModule_ProvidesFlickrSearchLocalDataSourceFactory.providesFlickrSearchLocalDataSource(flickrDao());
  }

  private Retrofit retrofit() {
    return NetworkModule_ProvidesRetrofitFactory.providesRetrofit(providesMoshiProvider.get(), providesOkHttpClientProvider.get());
  }

  private FlickrService flickrService() {
    return NetworkModule_ProvidesFlickrServiceFactory.providesFlickrService(providesRetrofitProvider.get());
  }

  private FlickrSearchRemoteDataSource flickrSearchRemoteDataSource() {
    return DataSourceModule_ProvidesFlickrSearchRemoteDataSourceFactory.providesFlickrSearchRemoteDataSource(providesFlickrServiceProvider.get());
  }

  private FlickrRepository flickrRepository() {
    return RepositoryModule_ProvidesFlickRepositoryFactory.providesFlickRepository(providesFlickrSearchLocalDataSourceProvider.get(), providesFlickrSearchRemoteDataSourceProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam) {
    this.providesCommentDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<FlickrDataBase>(singletonC, 2));
    this.providesFlickrSearchLocalDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<FlickrSearchLocalDataSource>(singletonC, 1));
    this.providesMoshiProvider = DoubleCheck.provider(new SwitchingProvider<Moshi>(singletonC, 6));
    this.providesOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonC, 7));
    this.providesRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonC, 5));
    this.providesFlickrServiceProvider = DoubleCheck.provider(new SwitchingProvider<FlickrService>(singletonC, 4));
    this.providesFlickrSearchRemoteDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<FlickrSearchRemoteDataSource>(singletonC, 3));
    this.providesFlickRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<FlickrRepository>(singletonC, 0));
  }

  @Override
  public void injectFlickrApplication(FlickrApplication flickrApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder dataSourceModule(DataSourceModule dataSourceModule) {
      Preconditions.checkNotNull(dataSourceModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    public FlickrApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerFlickrApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements FlickrApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerFlickrApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public FlickrApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements FlickrApplication_HiltComponents.ActivityC.Builder {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public FlickrApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements FlickrApplication_HiltComponents.FragmentC.Builder {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public FlickrApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements FlickrApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public FlickrApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements FlickrApplication_HiltComponents.ViewC.Builder {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public FlickrApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements FlickrApplication_HiltComponents.ViewModelC.Builder {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public FlickrApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements FlickrApplication_HiltComponents.ServiceC.Builder {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerFlickrApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public FlickrApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends FlickrApplication_HiltComponents.ViewWithFragmentC {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends FlickrApplication_HiltComponents.FragmentC {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends FlickrApplication_HiltComponents.ViewC {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends FlickrApplication_HiltComponents.ActivityC {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectFlickrMainActivity(FlickrMainActivity flickrMainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return Collections.<String>singleton(FlickrViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends FlickrApplication_HiltComponents.ViewModelC {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<FlickrViewModel> flickrViewModelProvider;

    private ViewModelCImpl(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private FlickrViewModel flickrViewModel() {
      return new FlickrViewModel(singletonC.providesFlickRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.flickrViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return Collections.<String, Provider<ViewModel>>singletonMap("com.tkacik.cvs.presentation.viewmodel.FlickrViewModel", (Provider) flickrViewModelProvider);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.tkacik.cvs.presentation.viewmodel.FlickrViewModel 
          return (T) viewModelCImpl.flickrViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends FlickrApplication_HiltComponents.ActivityRetainedC {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerFlickrApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends FlickrApplication_HiltComponents.ServiceC {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerFlickrApplication_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerFlickrApplication_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerFlickrApplication_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.tkacik.cvs.data.repository.FlickrRepository 
        return (T) singletonC.flickrRepository();

        case 1: // com.tkacik.cvs.data.local.datasource.FlickrSearchLocalDataSource 
        return (T) singletonC.flickrSearchLocalDataSource();

        case 2: // com.tkacik.cvs.data.local.database.FlickrDataBase 
        return (T) singletonC.flickrDataBase();

        case 3: // com.tkacik.cvs.data.remote.datasource.FlickrSearchRemoteDataSource 
        return (T) singletonC.flickrSearchRemoteDataSource();

        case 4: // com.tkacik.cvs.data.remote.service.FlickrService 
        return (T) singletonC.flickrService();

        case 5: // retrofit2.Retrofit 
        return (T) singletonC.retrofit();

        case 6: // com.squareup.moshi.Moshi 
        return (T) NetworkModule_ProvidesMoshiFactory.providesMoshi();

        case 7: // okhttp3.OkHttpClient 
        return (T) NetworkModule_ProvidesOkHttpClientFactory.providesOkHttpClient();

        default: throw new AssertionError(id);
      }
    }
  }
}