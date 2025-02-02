package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.analytics.Analytics;
import org.odk.collect.android.application.initialization.AnalyticsInitializer;
import org.odk.collect.android.version.VersionInformation;
import org.odk.collect.settings.SettingsProvider;

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
public final class AppDependencyModule_ProvidesAnalyticsInitializerFactory implements Factory<AnalyticsInitializer> {
  private final AppDependencyModule module;

  private final Provider<Analytics> analyticsProvider;

  private final Provider<VersionInformation> versionInformationProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesAnalyticsInitializerFactory(AppDependencyModule module,
      Provider<Analytics> analyticsProvider,
      Provider<VersionInformation> versionInformationProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.analyticsProvider = analyticsProvider;
    this.versionInformationProvider = versionInformationProvider;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public AnalyticsInitializer get() {
    return providesAnalyticsInitializer(module, analyticsProvider.get(), versionInformationProvider.get(), settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesAnalyticsInitializerFactory create(
      AppDependencyModule module, Provider<Analytics> analyticsProvider,
      Provider<VersionInformation> versionInformationProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesAnalyticsInitializerFactory(module, analyticsProvider, versionInformationProvider, settingsProvider);
  }

  public static AnalyticsInitializer providesAnalyticsInitializer(AppDependencyModule instance,
      Analytics analytics, VersionInformation versionInformation,
      SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesAnalyticsInitializer(analytics, versionInformation, settingsProvider));
  }
}
