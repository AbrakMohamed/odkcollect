package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.analytics.Analytics;
import org.odk.collect.android.preferences.PreferenceVisibilityHandler;
import org.odk.collect.android.preferences.ProjectPreferencesViewModel;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.AdminPasswordProvider;
import org.odk.collect.android.version.VersionInformation;
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
public final class IdentityPreferencesFragment_MembersInjector implements MembersInjector<IdentityPreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<SettingsStore> generalSettingsStoreProvider;

  private final Provider<AdminPasswordProvider> adminPasswordProvider;

  private final Provider<ProjectPreferencesViewModel.Factory> factoryProvider;

  private final Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider;

  private final Provider<Analytics> analyticsProvider;

  private final Provider<VersionInformation> versionInformationProvider;

  public IdentityPreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> generalSettingsStoreProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider,
      Provider<Analytics> analyticsProvider,
      Provider<VersionInformation> versionInformationProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.generalSettingsStoreProvider = generalSettingsStoreProvider;
    this.adminPasswordProvider = adminPasswordProvider;
    this.factoryProvider = factoryProvider;
    this.preferenceVisibilityHandlerProvider = preferenceVisibilityHandlerProvider;
    this.analyticsProvider = analyticsProvider;
    this.versionInformationProvider = versionInformationProvider;
  }

  public static MembersInjector<IdentityPreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<SettingsStore> generalSettingsStoreProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<PreferenceVisibilityHandler> preferenceVisibilityHandlerProvider,
      Provider<Analytics> analyticsProvider,
      Provider<VersionInformation> versionInformationProvider) {
    return new IdentityPreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, projectsDataServiceProvider, generalSettingsStoreProvider, adminPasswordProvider, factoryProvider, preferenceVisibilityHandlerProvider, analyticsProvider, versionInformationProvider);
  }

  @Override
  public void injectMembers(IdentityPreferencesFragment instance) {
    BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    BasePreferencesFragment_MembersInjector.injectProjectsDataService(instance, projectsDataServiceProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectGeneralSettingsStore(instance, generalSettingsStoreProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectAdminPasswordProvider(instance, adminPasswordProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectFactory(instance, factoryProvider.get());
    BaseProjectPreferencesFragment_MembersInjector.injectPreferenceVisibilityHandler(instance, preferenceVisibilityHandlerProvider.get());
    injectAnalytics(instance, analyticsProvider.get());
    injectVersionInformation(instance, versionInformationProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.IdentityPreferencesFragment.analytics")
  public static void injectAnalytics(IdentityPreferencesFragment instance, Analytics analytics) {
    instance.analytics = analytics;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.IdentityPreferencesFragment.versionInformation")
  public static void injectVersionInformation(IdentityPreferencesFragment instance,
      VersionInformation versionInformation) {
    instance.versionInformation = versionInformation;
  }
}
