package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.location.LocationClient;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppDependencyModule_ProvidesLocationClientFactory implements Factory<LocationClient> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  public AppDependencyModule_ProvidesLocationClientFactory(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public LocationClient get() {
    return providesLocationClient(module, applicationProvider.get());
  }

  public static AppDependencyModule_ProvidesLocationClientFactory create(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    return new AppDependencyModule_ProvidesLocationClientFactory(module, applicationProvider);
  }

  public static LocationClient providesLocationClient(AppDependencyModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesLocationClient(application));
  }
}
