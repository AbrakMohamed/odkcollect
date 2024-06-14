package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.FormsDataService;
import org.odk.collect.android.notifications.Notifier;
import org.odk.collect.android.projects.ProjectDependencyProviderFactory;

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
public final class AppDependencyModule_ProvidesFormsUpdaterFactory implements Factory<FormsDataService> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<Notifier> notifierProvider;

  private final Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider;

  public AppDependencyModule_ProvidesFormsUpdaterFactory(AppDependencyModule module,
      Provider<Application> applicationProvider, Provider<Notifier> notifierProvider,
      Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.notifierProvider = notifierProvider;
    this.projectDependencyProviderFactoryProvider = projectDependencyProviderFactoryProvider;
  }

  @Override
  public FormsDataService get() {
    return providesFormsUpdater(module, applicationProvider.get(), notifierProvider.get(), projectDependencyProviderFactoryProvider.get());
  }

  public static AppDependencyModule_ProvidesFormsUpdaterFactory create(AppDependencyModule module,
      Provider<Application> applicationProvider, Provider<Notifier> notifierProvider,
      Provider<ProjectDependencyProviderFactory> projectDependencyProviderFactoryProvider) {
    return new AppDependencyModule_ProvidesFormsUpdaterFactory(module, applicationProvider, notifierProvider, projectDependencyProviderFactoryProvider);
  }

  public static FormsDataService providesFormsUpdater(AppDependencyModule instance,
      Application application, Notifier notifier,
      ProjectDependencyProviderFactory projectDependencyProviderFactory) {
    return Preconditions.checkNotNullFromProvides(instance.providesFormsUpdater(application, notifier, projectDependencyProviderFactory));
  }
}
