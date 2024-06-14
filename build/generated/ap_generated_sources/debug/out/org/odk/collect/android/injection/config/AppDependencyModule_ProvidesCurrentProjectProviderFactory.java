package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.application.initialization.AnalyticsInitializer;
import org.odk.collect.android.application.initialization.MapsInitializer;
import org.odk.collect.android.projects.ProjectsDataService;
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
public final class AppDependencyModule_ProvidesCurrentProjectProviderFactory implements Factory<ProjectsDataService> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<AnalyticsInitializer> analyticsInitializerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<MapsInitializer> mapsInitializerProvider;

  public AppDependencyModule_ProvidesCurrentProjectProviderFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<AnalyticsInitializer> analyticsInitializerProvider,
      Provider<Context> contextProvider, Provider<MapsInitializer> mapsInitializerProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.analyticsInitializerProvider = analyticsInitializerProvider;
    this.contextProvider = contextProvider;
    this.mapsInitializerProvider = mapsInitializerProvider;
  }

  @Override
  public ProjectsDataService get() {
    return providesCurrentProjectProvider(module, settingsProvider.get(), projectsRepositoryProvider.get(), analyticsInitializerProvider.get(), contextProvider.get(), mapsInitializerProvider.get());
  }

  public static AppDependencyModule_ProvidesCurrentProjectProviderFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<AnalyticsInitializer> analyticsInitializerProvider,
      Provider<Context> contextProvider, Provider<MapsInitializer> mapsInitializerProvider) {
    return new AppDependencyModule_ProvidesCurrentProjectProviderFactory(module, settingsProvider, projectsRepositoryProvider, analyticsInitializerProvider, contextProvider, mapsInitializerProvider);
  }

  public static ProjectsDataService providesCurrentProjectProvider(AppDependencyModule instance,
      SettingsProvider settingsProvider, ProjectsRepository projectsRepository,
      AnalyticsInitializer analyticsInitializer, Context context, MapsInitializer mapsInitializer) {
    return Preconditions.checkNotNullFromProvides(instance.providesCurrentProjectProvider(settingsProvider, projectsRepository, analyticsInitializer, context, mapsInitializer));
  }
}
