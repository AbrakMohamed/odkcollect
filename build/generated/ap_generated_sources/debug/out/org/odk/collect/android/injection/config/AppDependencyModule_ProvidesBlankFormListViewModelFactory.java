package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formlists.blankformlist.BlankFormListViewModel;
import org.odk.collect.android.formmanagement.FormsDataService;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.ChangeLockProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.async.Scheduler;
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
public final class AppDependencyModule_ProvidesBlankFormListViewModelFactory implements Factory<BlankFormListViewModel.Factory> {
  private final AppDependencyModule module;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<FormsDataService> formsDataServiceProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ChangeLockProvider> changeLockProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  public AppDependencyModule_ProvidesBlankFormListViewModelFactory(AppDependencyModule module,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<Application> applicationProvider,
      Provider<FormsDataService> formsDataServiceProvider, Provider<Scheduler> schedulerProvider,
      Provider<SettingsProvider> settingsProvider, Provider<ChangeLockProvider> changeLockProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    this.module = module;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.applicationProvider = applicationProvider;
    this.formsDataServiceProvider = formsDataServiceProvider;
    this.schedulerProvider = schedulerProvider;
    this.settingsProvider = settingsProvider;
    this.changeLockProvider = changeLockProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
  }

  @Override
  public BlankFormListViewModel.Factory get() {
    return providesBlankFormListViewModel(module, formsRepositoryProvider.get(), instancesRepositoryProvider.get(), applicationProvider.get(), formsDataServiceProvider.get(), schedulerProvider.get(), settingsProvider.get(), changeLockProvider.get(), projectsDataServiceProvider.get());
  }

  public static AppDependencyModule_ProvidesBlankFormListViewModelFactory create(
      AppDependencyModule module, Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<Application> applicationProvider,
      Provider<FormsDataService> formsDataServiceProvider, Provider<Scheduler> schedulerProvider,
      Provider<SettingsProvider> settingsProvider, Provider<ChangeLockProvider> changeLockProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    return new AppDependencyModule_ProvidesBlankFormListViewModelFactory(module, formsRepositoryProvider, instancesRepositoryProvider, applicationProvider, formsDataServiceProvider, schedulerProvider, settingsProvider, changeLockProvider, projectsDataServiceProvider);
  }

  public static BlankFormListViewModel.Factory providesBlankFormListViewModel(
      AppDependencyModule instance, FormsRepositoryProvider formsRepositoryProvider,
      InstancesRepositoryProvider instancesRepositoryProvider, Application application,
      FormsDataService formsDataService, Scheduler scheduler, SettingsProvider settingsProvider,
      ChangeLockProvider changeLockProvider, ProjectsDataService projectsDataService) {
    return Preconditions.checkNotNullFromProvides(instance.providesBlankFormListViewModel(formsRepositoryProvider, instancesRepositoryProvider, application, formsDataService, scheduler, settingsProvider, changeLockProvider, projectsDataService));
  }
}
