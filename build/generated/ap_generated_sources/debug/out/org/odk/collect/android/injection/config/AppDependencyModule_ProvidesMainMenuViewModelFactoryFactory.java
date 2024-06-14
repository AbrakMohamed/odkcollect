package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.application.initialization.AnalyticsInitializer;
import org.odk.collect.android.instancemanagement.InstancesDataService;
import org.odk.collect.android.instancemanagement.autosend.AutoSendSettingsProvider;
import org.odk.collect.android.mainmenu.MainMenuViewModelFactory;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.android.version.VersionInformation;
import org.odk.collect.async.Scheduler;
import org.odk.collect.permissions.PermissionsChecker;
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
public final class AppDependencyModule_ProvidesMainMenuViewModelFactoryFactory implements Factory<MainMenuViewModelFactory> {
  private final AppDependencyModule module;

  private final Provider<VersionInformation> versionInformationProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<InstancesDataService> instancesDataServiceProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<AnalyticsInitializer> analyticsInitializerProvider;

  private final Provider<PermissionsChecker> permissionCheckerProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<AutoSendSettingsProvider> autoSendSettingsProvider;

  public AppDependencyModule_ProvidesMainMenuViewModelFactoryFactory(AppDependencyModule module,
      Provider<VersionInformation> versionInformationProvider,
      Provider<Application> applicationProvider, Provider<SettingsProvider> settingsProvider,
      Provider<InstancesDataService> instancesDataServiceProvider,
      Provider<Scheduler> schedulerProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<AnalyticsInitializer> analyticsInitializerProvider,
      Provider<PermissionsChecker> permissionCheckerProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<AutoSendSettingsProvider> autoSendSettingsProvider) {
    this.module = module;
    this.versionInformationProvider = versionInformationProvider;
    this.applicationProvider = applicationProvider;
    this.settingsProvider = settingsProvider;
    this.instancesDataServiceProvider = instancesDataServiceProvider;
    this.schedulerProvider = schedulerProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.analyticsInitializerProvider = analyticsInitializerProvider;
    this.permissionCheckerProvider = permissionCheckerProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.autoSendSettingsProvider = autoSendSettingsProvider;
  }

  @Override
  public MainMenuViewModelFactory get() {
    return providesMainMenuViewModelFactory(module, versionInformationProvider.get(), applicationProvider.get(), settingsProvider.get(), instancesDataServiceProvider.get(), schedulerProvider.get(), projectsDataServiceProvider.get(), analyticsInitializerProvider.get(), permissionCheckerProvider.get(), formsRepositoryProvider.get(), instancesRepositoryProvider.get(), autoSendSettingsProvider.get());
  }

  public static AppDependencyModule_ProvidesMainMenuViewModelFactoryFactory create(
      AppDependencyModule module, Provider<VersionInformation> versionInformationProvider,
      Provider<Application> applicationProvider, Provider<SettingsProvider> settingsProvider,
      Provider<InstancesDataService> instancesDataServiceProvider,
      Provider<Scheduler> schedulerProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<AnalyticsInitializer> analyticsInitializerProvider,
      Provider<PermissionsChecker> permissionCheckerProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<AutoSendSettingsProvider> autoSendSettingsProvider) {
    return new AppDependencyModule_ProvidesMainMenuViewModelFactoryFactory(module, versionInformationProvider, applicationProvider, settingsProvider, instancesDataServiceProvider, schedulerProvider, projectsDataServiceProvider, analyticsInitializerProvider, permissionCheckerProvider, formsRepositoryProvider, instancesRepositoryProvider, autoSendSettingsProvider);
  }

  public static MainMenuViewModelFactory providesMainMenuViewModelFactory(
      AppDependencyModule instance, VersionInformation versionInformation, Application application,
      SettingsProvider settingsProvider, InstancesDataService instancesDataService,
      Scheduler scheduler, ProjectsDataService projectsDataService,
      AnalyticsInitializer analyticsInitializer, PermissionsChecker permissionChecker,
      FormsRepositoryProvider formsRepositoryProvider,
      InstancesRepositoryProvider instancesRepositoryProvider,
      AutoSendSettingsProvider autoSendSettingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesMainMenuViewModelFactory(versionInformation, application, settingsProvider, instancesDataService, scheduler, projectsDataService, analyticsInitializer, permissionChecker, formsRepositoryProvider, instancesRepositoryProvider, autoSendSettingsProvider));
  }
}
