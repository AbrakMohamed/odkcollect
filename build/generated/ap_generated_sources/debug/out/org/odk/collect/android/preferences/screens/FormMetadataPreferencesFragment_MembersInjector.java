package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.preferences.PreferenceVisibilityHandler;
import org.odk.collect.android.preferences.ProjectPreferencesViewModel;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.AdminPasswordProvider;
import org.odk.collect.metadata.PropertyManager;
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
public final class FormMetadataPreferencesFragment_MembersInjector implements MembersInjector<FormMetadataPreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<SettingsStore> generalSettingsStoreProvider;

  private final Provider<AdminPasswordProvider> adminPasswordProvider;

  private final Provider<ProjectPreferencesViewModel.Factory> factoryProvider;

  private final Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider;

  private final Provider<PropertyManager> propertyManagerProvider;

  public FormMetadataPreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> generalSettingsStoreProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider,
      Provider<PropertyManager> propertyManagerProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.generalSettingsStoreProvider = generalSettingsStoreProvider;
    this.adminPasswordProvider = adminPasswordProvider;
    this.factoryProvider = factoryProvider;
    this.preferenceVisibilityHandlerProvider = preferenceVisibilityHandlerProvider;
    this.propertyManagerProvider = propertyManagerProvider;
  }

  public static MembersInjector<FormMetadataPreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> generalSettingsStoreProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider,
      Provider<PropertyManager> propertyManagerProvider) {
    return new FormMetadataPreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, projectsDataServiceProvider, generalSettingsStoreProvider, adminPasswordProvider, factoryProvider, preferenceVisibilityHandlerProvider, propertyManagerProvider);
  }

  @Override
  public void injectMembers(FormMetadataPreferencesFragment instance) {
    BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, projectsDataServiceProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, generalSettingsStoreProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, factoryProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandlerProvider.get());
    injectPropertyManager(instance, propertyManagerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.FormMetadataPreferencesFragment.propertyManager")
  public static void injectPropertyManager(FormMetadataPreferencesFragment instance,
      PropertyManager propertyManager) {
    instance.propertyManager = propertyManager;
  }
}
