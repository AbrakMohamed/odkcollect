package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.projects.ProjectsRepository;

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
public final class AppDependencyModule_ProvidesStoragePathProviderFactory implements Factory<StoragePathProvider> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  public AppDependencyModule_ProvidesStoragePathProviderFactory(AppDependencyModule module,
      Provider<Context> contextProvider, Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
  }

  @Override
  public StoragePathProvider get() {
    return providesStoragePathProvider(module, contextProvider.get(), projectsDataServiceProvider.get(), projectsRepositoryProvider.get());
  }

  public static AppDependencyModule_ProvidesStoragePathProviderFactory create(
      AppDependencyModule module, Provider<Context> contextProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider) {
    return new AppDependencyModule_ProvidesStoragePathProviderFactory(module, contextProvider, projectsDataServiceProvider, projectsRepositoryProvider);
  }

  public static StoragePathProvider providesStoragePathProvider(AppDependencyModule instance,
      Context context, ProjectsDataService projectsDataService,
      ProjectsRepository projectsRepository) {
    return Preconditions.checkNotNullFromProvides(instance.providesStoragePathProvider(context, projectsDataService, projectsRepository));
  }
}
