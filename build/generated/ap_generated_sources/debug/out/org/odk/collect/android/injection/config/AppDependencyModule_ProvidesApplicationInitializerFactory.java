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
import org.odk.collect.android.application.initialization.AnalyticsInitializer;
import org.odk.collect.android.application.initialization.ApplicationInitializer;
import org.odk.collect.android.application.initialization.MapsInitializer;
import org.odk.collect.android.application.initialization.upgrade.UpgradeInitializer;
import org.odk.collect.android.entities.EntitiesRepositoryProvider;
import org.odk.collect.metadata.PropertyManager;
import org.odk.collect.projects.ProjectsRepository;
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
public final class AppDependencyModule_ProvidesApplicationInitializerFactory implements Factory<ApplicationInitializer> {
  private final AppDependencyModule module;

  private final Provider<Application> contextProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  private final Provider<Analytics> analyticsProvider;

  private final Provider<UpgradeInitializer> upgradeInitializerProvider;

  private final Provider<AnalyticsInitializer> analyticsInitializerProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<MapsInitializer> mapsInitializerProvider;

  private final Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider;

  public AppDependencyModule_ProvidesApplicationInitializerFactory(AppDependencyModule module,
      Provider<Application> contextProvider, Provider<PropertyManager> propertyManagerProvider,
      Provider<Analytics> analyticsProvider,
      Provider<UpgradeInitializer> upgradeInitializerProvider,
      Provider<AnalyticsInitializer> analyticsInitializerProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<MapsInitializer> mapsInitializerProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.propertyManagerProvider = propertyManagerProvider;
    this.analyticsProvider = analyticsProvider;
    this.upgradeInitializerProvider = upgradeInitializerProvider;
    this.analyticsInitializerProvider = analyticsInitializerProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.mapsInitializerProvider = mapsInitializerProvider;
    this.entitiesRepositoryProvider = entitiesRepositoryProvider;
  }

  @Override
  public ApplicationInitializer get() {
    return providesApplicationInitializer(module, contextProvider.get(), propertyManagerProvider.get(), analyticsProvider.get(), upgradeInitializerProvider.get(), analyticsInitializerProvider.get(), projectsRepositoryProvider.get(), settingsProvider.get(), mapsInitializerProvider.get(), entitiesRepositoryProvider.get());
  }

  public static AppDependencyModule_ProvidesApplicationInitializerFactory create(
      AppDependencyModule module, Provider<Application> contextProvider,
      Provider<PropertyManager> propertyManagerProvider, Provider<Analytics> analyticsProvider,
      Provider<UpgradeInitializer> upgradeInitializerProvider,
      Provider<AnalyticsInitializer> analyticsInitializerProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<MapsInitializer> mapsInitializerProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider) {
    return new AppDependencyModule_ProvidesApplicationInitializerFactory(module, contextProvider, propertyManagerProvider, analyticsProvider, upgradeInitializerProvider, analyticsInitializerProvider, projectsRepositoryProvider, settingsProvider, mapsInitializerProvider, entitiesRepositoryProvider);
  }

  public static ApplicationInitializer providesApplicationInitializer(AppDependencyModule instance,
      Application context, PropertyManager propertyManager, Analytics analytics,
      UpgradeInitializer upgradeInitializer, AnalyticsInitializer analyticsInitializer,
      ProjectsRepository projectsRepository, SettingsProvider settingsProvider,
      MapsInitializer mapsInitializer, EntitiesRepositoryProvider entitiesRepositoryProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesApplicationInitializer(context, propertyManager, analytics, upgradeInitializer, analyticsInitializer, projectsRepository, settingsProvider, mapsInitializer, entitiesRepositoryProvider));
  }
}
