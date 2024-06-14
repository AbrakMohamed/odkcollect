package org.odk.collect.android.external;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.android.utilities.SavepointsRepositoryProvider;
import org.odk.collect.async.Scheduler;
import org.odk.collect.projects.ProjectsRepository;
import org.odk.collect.settings.SettingsProvider;

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
public final class FormUriActivity_MembersInjector implements MembersInjector<FormUriActivity> {
  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<InstancesRepositoryProvider> instanceRepositoryProvider;

  private final Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<Scheduler> schedulerProvider;

  public FormUriActivity_MembersInjector(Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instanceRepositoryProvider,
      Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider, Provider<Scheduler> schedulerProvider) {
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.instanceRepositoryProvider = instanceRepositoryProvider;
    this.savepointsRepositoryProvider = savepointsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.schedulerProvider = schedulerProvider;
  }

  public static MembersInjector<FormUriActivity> create(
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instanceRepositoryProvider,
      Provider<SavepointsRepositoryProvider> savepointsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider, Provider<Scheduler> schedulerProvider) {
    return new FormUriActivity_MembersInjector(projectsDataServiceProvider, projectsRepositoryProvider, formsRepositoryProvider, instanceRepositoryProvider, savepointsRepositoryProvider, settingsProvider, schedulerProvider);
  }

  @Override
  public void injectMembers(FormUriActivity instance) {
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectInstanceRepositoryProvider(instance, instanceRepositoryProvider.get());
    injectSavepointsRepositoryProvider(instance, savepointsRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectScheduler(instance, schedulerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormUriActivity.projectsDataService")
  public static void injectProjectsDataService(FormUriActivity instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormUriActivity.projectsRepository")
  public static void injectProjectsRepository(FormUriActivity instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormUriActivity.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(FormUriActivity instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormUriActivity.instanceRepositoryProvider")
  public static void injectInstanceRepositoryProvider(FormUriActivity instance,
      InstancesRepositoryProvider instanceRepositoryProvider) {
    instance.instanceRepositoryProvider = instanceRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormUriActivity.savepointsRepositoryProvider")
  public static void injectSavepointsRepositoryProvider(FormUriActivity instance,
      SavepointsRepositoryProvider savepointsRepositoryProvider) {
    instance.savepointsRepositoryProvider = savepointsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormUriActivity.settingsProvider")
  public static void injectSettingsProvider(FormUriActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.FormUriActivity.scheduler")
  public static void injectScheduler(FormUriActivity instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }
}
