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
@QualifierMetadata("javax.inject.Named")
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
public final class AppDependencyModule_ProvidesFusedLocationClientFactory implements Factory<LocationClient> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  public AppDependencyModule_ProvidesFusedLocationClientFactory(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public LocationClient get() {
    return providesFusedLocationClient(module, applicationProvider.get());
  }

  public static AppDependencyModule_ProvidesFusedLocationClientFactory create(
      AppDependencyModule module, Provider<Application> applicationProvider) {
    return new AppDependencyModule_ProvidesFusedLocationClientFactory(module, applicationProvider);
  }

  public static LocationClient providesFusedLocationClient(AppDependencyModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesFusedLocationClient(application));
  }
}
