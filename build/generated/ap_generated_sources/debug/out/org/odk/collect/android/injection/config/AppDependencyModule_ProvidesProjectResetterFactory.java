package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.instancemanagement.InstancesDataService;
import org.odk.collect.android.projects.ProjectResetter;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.SavepointsRepositoryProvider;
import org.odk.collect.metadata.PropertyManager;
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
public final class AppDependencyModule_ProvidesProjectResetterFactory implements Factory<ProjectResetter> {
  private final AppDependencyModule module;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider;

  private final Provider<InstancesDataService> instancesDataServiceProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  public AppDependencyModule_ProvidesProjectResetterFactory(AppDependencyModule module,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<PropertyManager> propertyManagerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider,
      Provider<InstancesDataService> instancesDataServiceProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    this.module = module;
    this.storagePathProvider = storagePathProvider;
    this.propertyManagerProvider = propertyManagerProvider;
    this.settingsProvider = settingsProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.savepointsRepositoryProvider = savepointsRepositoryProvider;
    this.instancesDataServiceProvider = instancesDataServiceProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
  }

  @Override
  public ProjectResetter get() {
    return providesProjectResetter(module, storagePathProvider.get(), propertyManagerProvider.get(), settingsProvider.get(), formsRepositoryProvider.get(), savepointsRepositoryProvider.get(), instancesDataServiceProvider.get(), projectsDataServiceProvider.get());
  }

  public static AppDependencyModule_ProvidesProjectResetterFactory create(
      AppDependencyModule module, Provider<StoragePathProvider> storagePathProvider,
      Provider<PropertyManager> propertyManagerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider,
      Provider<InstancesDataService> instancesDataServiceProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    return new AppDependencyModule_ProvidesProjectResetterFactory(module, storagePathProvider, propertyManagerProvider, settingsProvider, formsRepositoryProvider, savepointsRepositoryProvider, instancesDataServiceProvider, projectsDataServiceProvider);
  }

  public static ProjectResetter providesProjectResetter(AppDependencyModule instance,
      StoragePathProvider storagePathProvider, PropertyManager propertyManager,
      SettingsProvider settingsProvider, FormsRepositoryProvider formsRepositoryProvider,
      SavepointsRepositoryProvider savepointsRepositoryProvider,
      InstancesDataService instancesDataService, ProjectsDataService projectsDataService) {
    return Preconditions.checkNotNullFromProvides(instance.providesProjectResetter(storagePathProvider, propertyManager, settingsProvider, formsRepositoryProvider, savepointsRepositoryProvider, instancesDataService, projectsDataService));
  }
}
