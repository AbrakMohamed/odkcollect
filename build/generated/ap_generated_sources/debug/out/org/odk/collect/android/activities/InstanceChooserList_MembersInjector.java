package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.entities.EntitiesRepositoryProvider;
import org.odk.collect.android.instancemanagement.InstancesDataService;
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
public final class InstanceChooserList_MembersInjector implements MembersInjector<InstanceChooserList> {
  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider2;

  private final Provider<InstancesDataService> instancesDataServiceProvider;

  public InstanceChooserList_MembersInjector(Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<Scheduler> schedulerProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider,
      Provider<SettingsProvider> settingsProvider2,
      Provider<InstancesDataService> instancesDataServiceProvider) {
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.schedulerProvider = schedulerProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.entitiesRepositoryProvider = entitiesRepositoryProvider;
    this.settingsProvider2 = settingsProvider2;
    this.instancesDataServiceProvider = instancesDataServiceProvider;
  }

  public static MembersInjector<InstanceChooserList> create(
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<Scheduler> schedulerProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<EntitiesRepositoryProvider> entitiesRepositoryProvider,
      Provider<SettingsProvider> settingsProvider2,
      Provider<InstancesDataService> instancesDataServiceProvider) {
    return new InstanceChooserList_MembersInjector(settingsProvider, projectsDataServiceProvider, formsRepositoryProvider, schedulerProvider, instancesRepositoryProvider, entitiesRepositoryProvider, settingsProvider2, instancesDataServiceProvider);
  }

  @Override
  public void injectMembers(InstanceChooserList instance) {
    AppListActivity_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectScheduler(instance, schedulerProvider.get());
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectEntitiesRepositoryProvider(instance, entitiesRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider2.get());
    injectInstancesDataService(instance, instancesDataServiceProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.InstanceChooserList.projectsDataService")
  public static void injectProjectsDataService(InstanceChooserList instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.InstanceChooserList.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(InstanceChooserList instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.InstanceChooserList.scheduler")
  public static void injectScheduler(InstanceChooserList instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.InstanceChooserList.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(InstanceChooserList instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.InstanceChooserList.entitiesRepositoryProvider")
  public static void injectEntitiesRepositoryProvider(InstanceChooserList instance,
      EntitiesRepositoryProvider entitiesRepositoryProvider) {
    instance.entitiesRepositoryProvider = entitiesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.InstanceChooserList.settingsProvider")
  public static void injectSettingsProvider(InstanceChooserList instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.InstanceChooserList.instancesDataService")
  public static void injectInstancesDataService(InstanceChooserList instance,
      InstancesDataService instancesDataService) {
    instance.instancesDataService = instancesDataService;
  }
}
