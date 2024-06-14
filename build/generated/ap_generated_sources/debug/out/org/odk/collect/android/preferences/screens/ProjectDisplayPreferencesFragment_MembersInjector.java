package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.projects.ProjectsRepository;
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
public final class ProjectDisplayPreferencesFragment_MembersInjector implements MembersInjector<ProjectDisplayPreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<SettingsStore> adminSettingsStoreProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  public ProjectDisplayPreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> adminSettingsStoreProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.adminSettingsStoreProvider = adminSettingsStoreProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.storagePathProvider = storagePathProvider;
  }

  public static MembersInjector<ProjectDisplayPreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> adminSettingsStoreProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider) {
    return new ProjectDisplayPreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, projectsDataServiceProvider, adminSettingsStoreProvider, projectsRepositoryProvider, storagePathProvider);
  }

  @Override
  public void injectMembers(ProjectDisplayPreferencesFragment instance) {
    BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, projectsDataServiceProvider.get());
    BaseAdminPreferencesFragment_MembersInjector.injectAdminSettingsStore(instance, adminSettingsStoreProvider.get());
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
    injectStoragePathProvider(instance, storagePathProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.ProjectDisplayPreferencesFragment.projectsRepository")
  public static void injectProjectsRepository(ProjectDisplayPreferencesFragment instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.ProjectDisplayPreferencesFragment.storagePathProvider")
  public static void injectStoragePathProvider(ProjectDisplayPreferencesFragment instance,
      StoragePathProvider storagePathProvider) {
    instance.storagePathProvider = storagePathProvider;
  }
}
