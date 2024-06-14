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
import org.odk.collect.android.application.initialization.ExistingSettingsMigrator;
import org.odk.collect.android.application.initialization.FormUpdatesUpgrade;
import org.odk.collect.android.application.initialization.GoogleDriveProjectsDeleter;
import org.odk.collect.android.application.initialization.upgrade.UpgradeInitializer;
import org.odk.collect.android.projects.ProjectDependencyProviderFactory;
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
public final class AppDependencyModule_ProvidesUpgradeInitializerFactory implements Factory<UpgradeInitializer> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ExistingProjectMigrator> existingProjectMigratorProvider;

  private final Provider<ExistingSettingsMigrator> existingSettingsMigratorProvider;

  private final Provider<FormUpdatesUpgrade> formUpdatesUpgradeProvider;

  private final Provider<GoogleDriveProjectsDeleter> googleDriveProjectsDeleterProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider;

  public AppDependencyModule_ProvidesUpgradeInitializerFactory(AppDependencyModule module,
      Provider<Context> contextProvider, Provider<SettingsProvider> settingsProvider,
      Provider<ExistingProjectMigrator> existingProjectMigratorProvider,
      Provider<ExistingSettingsMigrator> existingSettingsMigratorProvider,
      Provider<FormUpdatesUpgrade> formUpdatesUpgradeProvider,
      Provider<GoogleDriveProjectsDeleter> googleDriveProjectsDeleterProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.settingsProvider = settingsProvider;
    this.existingProjectMigratorProvider = existingProjectMigratorProvider;
    this.existingSettingsMigratorProvider = existingSettingsMigratorProvider;
    this.formUpdatesUpgradeProvider = formUpdatesUpgradeProvider;
    this.googleDriveProjectsDeleterProvider = googleDriveProjectsDeleterProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.projectDependencyProviderFactoryProvider = projectDependencyProviderFactoryProvider;
  }

  @Override
  public UpgradeInitializer get() {
    return providesUpgradeInitializer(module, contextProvider.get(), settingsProvider.get(), existingProjectMigratorProvider.get(), existingSettingsMigratorProvider.get(), formUpdatesUpgradeProvider.get(), googleDriveProjectsDeleterProvider.get(), projectsRepositoryProvider.get(), projectDependencyProviderFactoryProvider.get());
  }

  public static AppDependencyModule_ProvidesUpgradeInitializerFactory create(
      AppDependencyModule module, Provider<Context> contextProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ExistingProjectMigrator> existingProjectMigratorProvider,
      Provider<ExistingSettingsMigrator> existingSettingsMigratorProvider,
      Provider<FormUpdatesUpgrade> formUpdatesUpgradeProvider,
      Provider<GoogleDriveProjectsDeleter> googleDriveProjectsDeleterProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider) {
    return new AppDependencyModule_ProvidesUpgradeInitializerFactory(module, contextProvider, settingsProvider, existingProjectMigratorProvider, existingSettingsMigratorProvider, formUpdatesUpgradeProvider, googleDriveProjectsDeleterProvider, projectsRepositoryProvider, projectDependencyProviderFactoryProvider);
  }

  public static UpgradeInitializer providesUpgradeInitializer(AppDependencyModule instance,
      Context context, SettingsProvider settingsProvider,
      ExistingProjectMigrator existingProjectMigrator,
      ExistingSettingsMigrator existingSettingsMigrator, FormUpdatesUpgrade formUpdatesUpgrade,
      GoogleDriveProjectsDeleter googleDriveProjectsDeleter, ProjectsRepository projectsRepository,
      ProjectDependencyProviderFactory projectDependencyProviderFactory) {
    return Preconditions.checkNotNullFromProvides(instance.providesUpgradeInitializer(context, settingsProvider, existingProjectMigrator, existingSettingsMigrator, formUpdatesUpgrade, googleDriveProjectsDeleter, projectsRepository, projectDependencyProviderFactory));
  }
}
