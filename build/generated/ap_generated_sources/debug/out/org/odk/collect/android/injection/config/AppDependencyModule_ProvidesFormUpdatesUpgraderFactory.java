package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.application.initialization.FormUpdatesUpgrade;
import org.odk.collect.android.backgroundwork.FormUpdateScheduler;
import org.odk.collect.async.Scheduler;
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
public final class AppDependencyModule_ProvidesFormUpdatesUpgraderFactory implements Factory<FormUpdatesUpgrade> {
  private final AppDependencyModule module;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<FormUpdateScheduler> formUpdateSchedulerProvider;

  public AppDependencyModule_ProvidesFormUpdatesUpgraderFactory(AppDependencyModule module,
      Provider<Scheduler> schedulerProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<FormUpdateScheduler> formUpdateSchedulerProvider) {
    this.module = module;
    this.schedulerProvider = schedulerProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.formUpdateSchedulerProvider = formUpdateSchedulerProvider;
  }

  @Override
  public FormUpdatesUpgrade get() {
    return providesFormUpdatesUpgrader(module, schedulerProvider.get(), projectsRepositoryProvider.get(), formUpdateSchedulerProvider.get());
  }

  public static AppDependencyModule_ProvidesFormUpdatesUpgraderFactory create(
      AppDependencyModule module, Provider<Scheduler> schedulerProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<FormUpdateScheduler> formUpdateSchedulerProvider) {
    return new AppDependencyModule_ProvidesFormUpdatesUpgraderFactory(module, schedulerProvider, projectsRepositoryProvider, formUpdateSchedulerProvider);
  }

  public static FormUpdatesUpgrade providesFormUpdatesUpgrader(AppDependencyModule instance,
      Scheduler scheduler, ProjectsRepository projectsRepository,
      FormUpdateScheduler formUpdateScheduler) {
    return Preconditions.checkNotNullFromProvides(instance.providesFormUpdatesUpgrader(scheduler, projectsRepository, formUpdateScheduler));
  }
}
