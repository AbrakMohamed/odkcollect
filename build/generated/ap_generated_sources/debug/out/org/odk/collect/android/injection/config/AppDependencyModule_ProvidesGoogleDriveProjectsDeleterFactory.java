package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.application.initialization.GoogleDriveProjectsDeleter;
import org.odk.collect.android.projects.ProjectDeleter;
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
public final class AppDependencyModule_ProvidesGoogleDriveProjectsDeleterFactory implements Factory<GoogleDriveProjectsDeleter> {
  private final AppDependencyModule module;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectDeleter> projectDeleterProvider;

  public AppDependencyModule_ProvidesGoogleDriveProjectsDeleterFactory(AppDependencyModule module,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectDeleter> projectDeleterProvider) {
    this.module = module;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.projectDeleterProvider = projectDeleterProvider;
  }

  @Override
  public GoogleDriveProjectsDeleter get() {
    return providesGoogleDriveProjectsDeleter(module, projectsRepositoryProvider.get(), settingsProvider.get(), projectDeleterProvider.get());
  }

  public static AppDependencyModule_ProvidesGoogleDriveProjectsDeleterFactory create(
      AppDependencyModule module, Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectDeleter> projectDeleterProvider) {
    return new AppDependencyModule_ProvidesGoogleDriveProjectsDeleterFactory(module, projectsRepositoryProvider, settingsProvider, projectDeleterProvider);
  }

  public static GoogleDriveProjectsDeleter providesGoogleDriveProjectsDeleter(
      AppDependencyModule instance, ProjectsRepository projectsRepository,
      SettingsProvider settingsProvider, ProjectDeleter projectDeleter) {
    return Preconditions.checkNotNullFromProvides(instance.providesGoogleDriveProjectsDeleter(projectsRepository, settingsProvider, projectDeleter));
  }
}
