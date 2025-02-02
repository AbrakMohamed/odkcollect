package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.analytics.Analytics;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppDependencyModule_ProvidesAnalyticsFactory implements Factory<Analytics> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  public AppDependencyModule_ProvidesAnalyticsFactory(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Analytics get() {
    return providesAnalytics(module, applicationProvider.get());
  }

  public static AppDependencyModule_ProvidesAnalyticsFactory create(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    return new AppDependencyModule_ProvidesAnalyticsFactory(module, applicationProvider);
  }

  public static Analytics providesAnalytics(AppDependencyModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesAnalytics(application));
  }
}
