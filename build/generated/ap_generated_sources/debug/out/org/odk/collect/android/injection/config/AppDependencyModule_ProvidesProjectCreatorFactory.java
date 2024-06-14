package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.projects.ProjectCreator;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.projects.ProjectsRepository;
import org.odk.collect.settings.ODKAppSettingsImporter;
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
public final class AppDependencyModule_ProvidesProjectCreatorFactory implements Factory<ProjectCreator> {
  private final AppDependencyModule module;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<ODKAppSettingsImporter> settingsImporterProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesProjectCreatorFactory(AppDependencyModule module,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ODKAppSettingsImporter> settingsImporterProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.settingsImporterProvider = settingsImporterProvider;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public ProjectCreator get() {
    return providesProjectCreator(module, projectsRepositoryProvider.get(), projectsDataServiceProvider.get(), settingsImporterProvider.get(), settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesProjectCreatorFactory create(AppDependencyModule module,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ODKAppSettingsImporter> settingsImporterProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesProjectCreatorFactory(module, projectsRepositoryProvider, projectsDataServiceProvider, settingsImporterProvider, settingsProvider);
  }

  public static ProjectCreator providesProjectCreator(AppDependencyModule instance,
      ProjectsRepository projectsRepository, ProjectsDataService projectsDataService,
      ODKAppSettingsImporter settingsImporter, SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesProjectCreator(projectsRepository, projectsDataService, settingsImporter, settingsProvider));
  }
}
