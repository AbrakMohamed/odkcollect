package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.configure.qr.AppConfigurationGenerator;
import org.odk.collect.android.projects.ProjectsDataService;
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
public final class AppDependencyModule_ProvidesJsonPreferencesGeneratorFactory implements Factory<AppConfigurationGenerator> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  public AppDependencyModule_ProvidesJsonPreferencesGeneratorFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
  }

  @Override
  public AppConfigurationGenerator get() {
    return providesJsonPreferencesGenerator(module, settingsProvider.get(), projectsDataServiceProvider.get());
  }

  public static AppDependencyModule_ProvidesJsonPreferencesGeneratorFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    return new AppDependencyModule_ProvidesJsonPreferencesGeneratorFactory(module, settingsProvider, projectsDataServiceProvider);
  }

  public static AppConfigurationGenerator providesJsonPreferencesGenerator(
      AppDependencyModule instance, SettingsProvider settingsProvider,
      ProjectsDataService projectsDataService) {
    return Preconditions.checkNotNullFromProvides(instance.providesJsonPreferencesGenerator(settingsProvider, projectsDataService));
  }
}
