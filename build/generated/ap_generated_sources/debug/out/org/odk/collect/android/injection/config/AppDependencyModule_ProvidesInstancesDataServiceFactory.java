package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.backgroundwork.InstanceSubmitScheduler;
import org.odk.collect.android.instancemanagement.InstancesDataService;
import org.odk.collect.android.notifications.Notifier;
import org.odk.collect.android.openrosa.OpenRosaHttpInterface;
import org.odk.collect.android.projects.ProjectDependencyProviderFactory;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.metadata.PropertyManager;

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
public final class AppDependencyModule_ProvidesInstancesDataServiceFactory implements Factory<InstancesDataService> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider;

  private final Provider<ProjectDependencyProviderFactory> projectsDependencyProviderFactoryProvider;

  private final Provider<Notifier> notifierProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  private final Provider<OpenRosaHttpInterface> httpInterfaceProvider;

  public AppDependencyModule_ProvidesInstancesDataServiceFactory(AppDependencyModule module,
      Provider<Application> applicationProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<ProjectDependencyProviderFactory> projectsDependencyProviderFactoryProvider,
      Provider<Notifier> notifierProvider, Provider<PropertyManager> propertyManagerProvider,
      Provider<OpenRosaHttpInterface> httpInterfaceProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.instanceSubmitSchedulerProvider = instanceSubmitSchedulerProvider;
    this.projectsDependencyProviderFactoryProvider = projectsDependencyProviderFactoryProvider;
    this.notifierProvider = notifierProvider;
    this.propertyManagerProvider = propertyManagerProvider;
    this.httpInterfaceProvider = httpInterfaceProvider;
  }

  @Override
  public InstancesDataService get() {
    return providesInstancesDataService(module, applicationProvider.get(), projectsDataServiceProvider.get(), instanceSubmitSchedulerProvider.get(), projectsDependencyProviderFactoryProvider.get(), notifierProvider.get(), propertyManagerProvider.get(), httpInterfaceProvider.get());
  }

  public static AppDependencyModule_ProvidesInstancesDataServiceFactory create(
      AppDependencyModule module, Provider<Application> applicationProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<ProjectDependencyProviderFactory> projectsDependencyProviderFactoryProvider,
      Provider<Notifier> notifierProvider, Provider<PropertyManager> propertyManagerProvider,
      Provider<OpenRosaHttpInterface> httpInterfaceProvider) {
    return new AppDependencyModule_ProvidesInstancesDataServiceFactory(module, applicationProvider, projectsDataServiceProvider, instanceSubmitSchedulerProvider, projectsDependencyProviderFactoryProvider, notifierProvider, propertyManagerProvider, httpInterfaceProvider);
  }

  public static InstancesDataService providesInstancesDataService(AppDependencyModule instance,
      Application application, ProjectsDataService projectsDataService,
      InstanceSubmitScheduler instanceSubmitScheduler,
      ProjectDependencyProviderFactory projectsDependencyProviderFactory, Notifier notifier,
      PropertyManager propertyManager, OpenRosaHttpInterface httpInterface) {
    return Preconditions.checkNotNullFromProvides(instance.providesInstancesDataService(application, projectsDataService, instanceSubmitScheduler, projectsDependencyProviderFactory, notifier, propertyManager, httpInterface));
  }
}
