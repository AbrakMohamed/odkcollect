package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.application.initialization.ExistingSettingsMigrator;
import org.odk.collect.projects.ProjectsRepository;
import org.odk.collect.settings.ODKAppSettingsMigrator;
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
public final class AppDependencyModule_ProvidesExistingSettingsMigratorFactory implements Factory<ExistingSettingsMigrator> {
  private final AppDependencyModule module;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ODKAppSettingsMigrator> settingsMigratorProvider;

  public AppDependencyModule_ProvidesExistingSettingsMigratorFactory(AppDependencyModule module,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ODKAppSettingsMigrator> settingsMigratorProvider) {
    this.module = module;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.settingsMigratorProvider = settingsMigratorProvider;
  }

  @Override
  public ExistingSettingsMigrator get() {
    return providesExistingSettingsMigrator(module, projectsRepositoryProvider.get(), settingsProvider.get(), settingsMigratorProvider.get());
  }

  public static AppDependencyModule_ProvidesExistingSettingsMigratorFactory create(
      AppDependencyModule module, Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ODKAppSettingsMigrator> settingsMigratorProvider) {
    return new AppDependencyModule_ProvidesExistingSettingsMigratorFactory(module, projectsRepositoryProvider, settingsProvider, settingsMigratorProvider);
  }

  public static ExistingSettingsMigrator providesExistingSettingsMigrator(
      AppDependencyModule instance, ProjectsRepository projectsRepository,
      SettingsProvider settingsProvider, ODKAppSettingsMigrator settingsMigrator) {
    return Preconditions.checkNotNullFromProvides(instance.providesExistingSettingsMigrator(projectsRepository, settingsProvider, settingsMigrator));
  }
}
