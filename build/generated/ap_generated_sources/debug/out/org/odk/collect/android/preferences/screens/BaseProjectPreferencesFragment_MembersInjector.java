package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import javax.inject.Provider;
import org.odk.collect.android.preferences.PreferenceVisibilityHandler;
import org.odk.collect.android.preferences.ProjectPreferencesViewModel;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.AdminPasswordProvider;
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
public final class BaseProjectPreferencesFragment_MembersInjector implements MembersInjector<BaseProjectPreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<SettingsStore> generalSettingsStoreProvider;

  private final Provider<AdminPasswordProvider> adminPasswordProvider;

  private final Provider<ProjectPreferencesViewModel.Factory> factoryProvider;

  private final Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider;

  public BaseProjectPreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> generalSettingsStoreProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.generalSettingsStoreProvider = generalSettingsStoreProvider;
    this.adminPasswordProvider = adminPasswordProvider;
    this.factoryProvider = factoryProvider;
    this.preferenceVisibilityHandlerProvider = preferenceVisibilityHandlerProvider;
  }

  public static MembersInjector<BaseProjectPreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> generalSettingsStoreProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider) {
    return new BaseProjectPreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, projectsDataServiceProvider, generalSettingsStoreProvider, adminPasswordProvider, factoryProvider, preferenceVisibilityHandlerProvider);
  }

  @Override
  public void injectMembers(BaseProjectPreferencesFragment instance) {
    BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectGeneralSettingsStore(instance, generalSettingsStoreProvider.get());
    injectAdminPasswordProvider(instance, adminPasswordProvider.get());
    injectFactory(instance, factoryProvider.get());
    injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandlerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BaseProjectPreferencesFragment.generalSettingsStore")
  @Named("GENERAL_SETTINGS_STORE")
  public static void injectGeneralSettingsStore(BaseProjectPreferencesFragment instance,
      SettingsStore generalSettingsStore) {
    instance.generalSettingsStore = generalSettingsStore;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BaseProjectPreferencesFragment.adminPasswordProvider")
  public static void injectAdminPasswordProvider(BaseProjectPreferencesFragment instance,
      AdminPasswordProvider adminPasswordProvider) {
    instance.adminPasswordProvider = adminPasswordProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BaseProjectPreferencesFragment.factory")
  public static void injectFactory(BaseProjectPreferencesFragment instance,
      ProjectPreferencesViewModel.Factory factory) {
    instance.factory = factory;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BaseProjectPreferencesFragment.preferenceVisibilityHandler")
  public static void injectPreferenceVisibilityHandler(BaseProjectPreferencesFragment instance,
      PreferenceVisibilityHandler preferenceVisibilityHandler) {
    instance.preferenceVisibilityHandler = preferenceVisibilityHandler;
  }
}
