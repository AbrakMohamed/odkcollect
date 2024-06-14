package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.android.projects.ProjectDeleter;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.settings.SettingsProvider;
import org.odk.collect.settings.importing.SettingsChangeHandler;

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
public final class ProjectManagementPreferencesFragment_MembersInjector implements MembersInjector<ProjectManagementPreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<SettingsStore> adminSettingsStoreProvider;

  private final Provider<ProjectDeleter> projectDeleterProvider;

  public ProjectManagementPreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> adminSettingsStoreProvider,
      Provider<ProjectDeleter> projectDeleterProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.adminSettingsStoreProvider = adminSettingsStoreProvider;
    this.projectDeleterProvider = projectDeleterProvider;
  }

  public static MembersInjector<ProjectManagementPreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> adminSettingsStoreProvider,
      Provider<ProjectDeleter> projectDeleterProvider) {
    return new ProjectManagementPreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, projectsDataServiceProvider, adminSettingsStoreProvider, projectDeleterProvider);
  }

  @Override
  public void injectMembers(ProjectManagementPreferencesFragment instance) {
    BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, projectsDataServiceProvider.get());
    BaseAdminPreferencesFragment_MembersInjector.injectAdminSettingsStore(instance, adminSettingsStoreProvider.get());
    injectProjectDeleter(instance, projectDeleterProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.ProjectManagementPreferencesFragment.projectDeleter")
  public static void injectProjectDeleter(ProjectManagementPreferencesFragment instance,
      ProjectDeleter projectDeleter) {
    instance.projectDeleter = projectDeleter;
  }
}
