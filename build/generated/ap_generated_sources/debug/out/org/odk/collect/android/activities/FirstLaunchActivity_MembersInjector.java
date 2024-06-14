package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.version.VersionInformation;
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
public final class FirstLaunchActivity_MembersInjector implements MembersInjector<FirstLaunchActivity> {
  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<VersionInformation> versionInformationProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<Scheduler> schedulerProvider;

  public FirstLaunchActivity_MembersInjector(
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<VersionInformation> versionInformationProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsProvider> settingsProvider, Provider<Scheduler> schedulerProvider) {
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.versionInformationProvider = versionInformationProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.settingsProvider = settingsProvider;
    this.schedulerProvider = schedulerProvider;
  }

  public static MembersInjector<FirstLaunchActivity> create(
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<VersionInformation> versionInformationProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsProvider> settingsProvider, Provider<Scheduler> schedulerProvider) {
    return new FirstLaunchActivity_MembersInjector(projectsRepositoryProvider, versionInformationProvider, projectsDataServiceProvider, settingsProvider, schedulerProvider);
  }

  @Override
  public void injectMembers(FirstLaunchActivity instance) {
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
    injectVersionInformation(instance, versionInformationProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectScheduler(instance, schedulerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FirstLaunchActivity.projectsRepository")
  public static void injectProjectsRepository(FirstLaunchActivity instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FirstLaunchActivity.versionInformation")
  public static void injectVersionInformation(FirstLaunchActivity instance,
      VersionInformation versionInformation) {
    instance.versionInformation = versionInformation;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FirstLaunchActivity.projectsDataService")
  public static void injectProjectsDataService(FirstLaunchActivity instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FirstLaunchActivity.settingsProvider")
  public static void injectSettingsProvider(FirstLaunchActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FirstLaunchActivity.scheduler")
  public static void injectScheduler(FirstLaunchActivity instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }
}
