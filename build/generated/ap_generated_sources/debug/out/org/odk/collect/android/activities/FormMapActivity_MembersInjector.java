package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.async.Scheduler;
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
public final class FormMapActivity_MembersInjector implements MembersInjector<FormMapActivity> {
  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<Scheduler> schedulerProvider;

  public FormMapActivity_MembersInjector(Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<Scheduler> schedulerProvider) {
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.schedulerProvider = schedulerProvider;
  }

  public static MembersInjector<FormMapActivity> create(
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<Scheduler> schedulerProvider) {
    return new FormMapActivity_MembersInjector(formsRepositoryProvider, instancesRepositoryProvider, settingsProvider, projectsDataServiceProvider, schedulerProvider);
  }

  @Override
  public void injectMembers(FormMapActivity instance) {
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectScheduler(instance, schedulerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormMapActivity.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(FormMapActivity instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormMapActivity.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(FormMapActivity instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormMapActivity.settingsProvider")
  public static void injectSettingsProvider(FormMapActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormMapActivity.projectsDataService")
  public static void injectProjectsDataService(FormMapActivity instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormMapActivity.scheduler")
  public static void injectScheduler(FormMapActivity instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }
}
