package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.entities.EntitiesRepositoryProvider;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.storage.StoragePathProvider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppDependencyModule_ProvideEntitiesRepositoryProviderFactory implements Factory<EntitiesRepositoryProvider> {
  private final AppDependencyModule module;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  public AppDependencyModule_ProvideEntitiesRepositoryProviderFactory(AppDependencyModule module,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    this.module = module;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.storagePathProvider = storagePathProvider;
  }

  @Override
  public EntitiesRepositoryProvider get() {
    return provideEntitiesRepositoryProvider(module, projectsDataServiceProvider.get(), storagePathProvider.get());
  }

  public static AppDependencyModule_ProvideEntitiesRepositoryProviderFactory create(
      AppDependencyModule module, Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    return new AppDependencyModule_ProvideEntitiesRepositoryProviderFactory(module, projectsDataServiceProvider, storagePathProvider);
  }

  public static EntitiesRepositoryProvider provideEntitiesRepositoryProvider(
      AppDependencyModule instance, ProjectsDataService projectsDataService,
      StoragePathProvider storagePathProvider) {
    return Preconditions.checkNotNullFromProvides(instance.provideEntitiesRepositoryProvider(projectsDataService, storagePathProvider));
  }
}
