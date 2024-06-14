package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.FormsDataService;
import org.odk.collect.android.instancemanagement.InstancesDataService;
import org.odk.collect.android.projects.ProjectDependencyProviderFactory;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.async.Scheduler;

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
public final class DeleteFormsActivity_MembersInjector implements MembersInjector<DeleteFormsActivity> {
  private final Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<FormsDataService> formsDataServiceProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<InstancesDataService> instanceDataServiceProvider;

  public DeleteFormsActivity_MembersInjector(
      Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<FormsDataService> formsDataServiceProvider, Provider<Scheduler> schedulerProvider,
      Provider<InstancesDataService> instanceDataServiceProvider) {
    this.projectDependencyProviderFactoryProvider = projectDependencyProviderFactoryProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.formsDataServiceProvider = formsDataServiceProvider;
    this.schedulerProvider = schedulerProvider;
    this.instanceDataServiceProvider = instanceDataServiceProvider;
  }

  public static MembersInjector<DeleteFormsActivity> create(
      Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<FormsDataService> formsDataServiceProvider, Provider<Scheduler> schedulerProvider,
      Provider<InstancesDataService> instanceDataServiceProvider) {
    return new DeleteFormsActivity_MembersInjector(projectDependencyProviderFactoryProvider, projectsDataServiceProvider, formsDataServiceProvider, schedulerProvider, instanceDataServiceProvider);
  }

  @Override
  public void injectMembers(DeleteFormsActivity instance) {
    injectProjectDependencyProviderFactory(instance, projectDependencyProviderFactoryProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectFormsDataService(instance, formsDataServiceProvider.get());
    injectScheduler(instance, schedulerProvider.get());
    injectInstanceDataService(instance, instanceDataServiceProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.DeleteFormsActivity.projectDependencyProviderFactory")
  public static void injectProjectDependencyProviderFactory(DeleteFormsActivity instance,
      ProjectDependencyProviderFactory projectDependencyProviderFactory) {
    instance.projectDependencyProviderFactory = projectDependencyProviderFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.DeleteFormsActivity.projectsDataService")
  public static void injectProjectsDataService(DeleteFormsActivity instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.DeleteFormsActivity.formsDataService")
  public static void injectFormsDataService(DeleteFormsActivity instance,
      FormsDataService formsDataService) {
    instance.formsDataService = formsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.DeleteFormsActivity.scheduler")
  public static void injectScheduler(DeleteFormsActivity instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.DeleteFormsActivity.instanceDataService")
  public static void injectInstanceDataService(DeleteFormsActivity instance,
      InstancesDataService instanceDataService) {
    instance.instanceDataService = instanceDataService;
  }
}
