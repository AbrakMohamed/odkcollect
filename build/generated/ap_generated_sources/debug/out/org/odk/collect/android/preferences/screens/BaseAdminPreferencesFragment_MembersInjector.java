package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import javax.inject.Provider;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.settings.SettingsProvider;
import org.odk.collect.settings.importing.SettingsChangeHandler;

@QualifierMetadata("javax.inject.Named")
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
public final class BaseAdminPreferencesFragment_MembersInjector implements MembersInjector<BaseAdminPreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<SettingsStore> adminSettingsStoreProvider;

  public BaseAdminPreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> adminSettingsStoreProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.adminSettingsStoreProvider = adminSettingsStoreProvider;
  }

  public static MembersInjector<BaseAdminPreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> adminSettingsStoreProvider) {
    return new BaseAdminPreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, projectsDataServiceProvider, adminSettingsStoreProvider);
  }

  @Override
  public void injectMembers(BaseAdminPreferencesFragment instance) {
    BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectAdminSettingsStore(instance, adminSettingsStoreProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BaseAdminPreferencesFragment.adminSettingsStore")
  @Named("ADMIN_SETTINGS_STORE")
  public static void injectAdminSettingsStore(BaseAdminPreferencesFragment instance,
      SettingsStore adminSettingsStore) {
    instance.adminSettingsStore = adminSettingsStore;
  }
}
