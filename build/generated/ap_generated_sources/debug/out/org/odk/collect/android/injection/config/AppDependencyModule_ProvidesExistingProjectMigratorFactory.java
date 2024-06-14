package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.application.initialization.ExistingProjectMigrator;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.storage.StoragePathProvider;
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
public final class AppDependencyModule_ProvidesExistingProjectMigratorFactory implements Factory<ExistingProjectMigrator> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  public AppDependencyModule_ProvidesExistingProjectMigratorFactory(AppDependencyModule module,
      Provider<Context> contextProvider, Provider<StoragePathProvider> storagePathProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.storagePathProvider = storagePathProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
  }

  @Override
  public ExistingProjectMigrator get() {
    return providesExistingProjectMigrator(module, contextProvider.get(), storagePathProvider.get(), projectsRepositoryProvider.get(), settingsProvider.get(), projectsDataServiceProvider.get());
  }

  public static AppDependencyModule_ProvidesExistingProjectMigratorFactory create(
      AppDependencyModule module, Provider<Context> contextProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    return new AppDependencyModule_ProvidesExistingProjectMigratorFactory(module, contextProvider, storagePathProvider, projectsRepositoryProvider, settingsProvider, projectsDataServiceProvider);
  }

  public static ExistingProjectMigrator providesExistingProjectMigrator(
      AppDependencyModule instance, Context context, StoragePathProvider storagePathProvider,
      ProjectsRepository projectsRepository, SettingsProvider settingsProvider,
      ProjectsDataService projectsDataService) {
    return Preconditions.checkNotNullFromProvides(instance.providesExistingProjectMigrator(context, storagePathProvider, projectsRepository, settingsProvider, projectsDataService));
  }
}
