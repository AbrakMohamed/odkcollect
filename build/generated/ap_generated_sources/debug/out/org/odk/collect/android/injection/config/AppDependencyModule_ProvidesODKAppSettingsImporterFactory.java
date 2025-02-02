package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.projects.ProjectsRepository;
import org.odk.collect.settings.ODKAppSettingsImporter;
import org.odk.collect.settings.SettingsProvider;
import org.odk.collect.settings.importing.SettingsChangeHandler;

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
public final class AppDependencyModule_ProvidesODKAppSettingsImporterFactory implements Factory<ODKAppSettingsImporter> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  public AppDependencyModule_ProvidesODKAppSettingsImporterFactory(AppDependencyModule module,
      Provider<Context> contextProvider, Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
  }

  @Override
  public ODKAppSettingsImporter get() {
    return providesODKAppSettingsImporter(module, contextProvider.get(), projectsRepositoryProvider.get(), settingsProvider.get(), settingsChangeHandlerProvider.get());
  }

  public static AppDependencyModule_ProvidesODKAppSettingsImporterFactory create(
      AppDependencyModule module, Provider<Context> contextProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider) {
    return new AppDependencyModule_ProvidesODKAppSettingsImporterFactory(module, contextProvider, projectsRepositoryProvider, settingsProvider, settingsChangeHandlerProvider);
  }

  public static ODKAppSettingsImporter providesODKAppSettingsImporter(AppDependencyModule instance,
      Context context, ProjectsRepository projectsRepository, SettingsProvider settingsProvider,
      SettingsChangeHandler settingsChangeHandler) {
    return Preconditions.checkNotNullFromProvides(instance.providesODKAppSettingsImporter(context, projectsRepository, settingsProvider, settingsChangeHandler));
  }
}
