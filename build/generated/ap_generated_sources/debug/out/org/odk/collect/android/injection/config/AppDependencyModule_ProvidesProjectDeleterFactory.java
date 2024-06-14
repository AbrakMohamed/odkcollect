package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.backgroundwork.FormUpdateScheduler;
import org.odk.collect.android.backgroundwork.InstanceSubmitScheduler;
import org.odk.collect.android.projects.ProjectDeleter;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.ChangeLockProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
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
public final class AppDependencyModule_ProvidesProjectDeleterFactory implements Factory<ProjectDeleter> {
  private final AppDependencyModule module;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<FormUpdateScheduler> formUpdateSchedulerProvider;

  private final Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<ChangeLockProvider> changeLockProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesProjectDeleterFactory(AppDependencyModule module,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<FormUpdateScheduler> formUpdateSchedulerProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ChangeLockProvider> changeLockProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.formUpdateSchedulerProvider = formUpdateSchedulerProvider;
    this.instanceSubmitSchedulerProvider = instanceSubmitSchedulerProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.storagePathProvider = storagePathProvider;
    this.changeLockProvider = changeLockProvider;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public ProjectDeleter get() {
    return providesProjectDeleter(module, projectsRepositoryProvider.get(), projectsDataServiceProvider.get(), formUpdateSchedulerProvider.get(), instanceSubmitSchedulerProvider.get(), instancesRepositoryProvider.get(), storagePathProvider.get(), changeLockProvider.get(), settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesProjectDeleterFactory create(AppDependencyModule module,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<FormUpdateScheduler> formUpdateSchedulerProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ChangeLockProvider> changeLockProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesProjectDeleterFactory(module, projectsRepositoryProvider, projectsDataServiceProvider, formUpdateSchedulerProvider, instanceSubmitSchedulerProvider, instancesRepositoryProvider, storagePathProvider, changeLockProvider, settingsProvider);
  }

  public static ProjectDeleter providesProjectDeleter(AppDependencyModule instance,
      ProjectsRepository projectsRepository, ProjectsDataService projectsDataService,
      FormUpdateScheduler formUpdateScheduler, InstanceSubmitScheduler instanceSubmitScheduler,
      InstancesRepositoryProvider instancesRepositoryProvider,
      StoragePathProvider storagePathProvider, ChangeLockProvider changeLockProvider,
      SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesProjectDeleter(projectsRepository, projectsDataService, formUpdateScheduler, instanceSubmitScheduler, instancesRepositoryProvider, storagePathProvider, changeLockProvider, settingsProvider));
  }
}
