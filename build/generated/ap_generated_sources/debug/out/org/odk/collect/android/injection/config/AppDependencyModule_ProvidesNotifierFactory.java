package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.notifications.Notifier;
import org.odk.collect.projects.ProjectsRepository;
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
public final class AppDependencyModule_ProvidesNotifierFactory implements Factory<Notifier> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  public AppDependencyModule_ProvidesNotifierFactory(AppDependencyModule module,
      Provider<Application> applicationProvider, Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.settingsProvider = settingsProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
  }

  @Override
  public Notifier get() {
    return providesNotifier(module, applicationProvider.get(), settingsProvider.get(), projectsRepositoryProvider.get());
  }

  public static AppDependencyModule_ProvidesNotifierFactory create(AppDependencyModule module,
      Provider<Application> applicationProvider, Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider) {
    return new AppDependencyModule_ProvidesNotifierFactory(module, applicationProvider, settingsProvider, projectsRepositoryProvider);
  }

  public static Notifier providesNotifier(AppDependencyModule instance, Application application,
      SettingsProvider settingsProvider, ProjectsRepository projectsRepository) {
    return Preconditions.checkNotNullFromProvides(instance.providesNotifier(application, settingsProvider, projectsRepository));
  }
}
