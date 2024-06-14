package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class BasePreferencesFragment_MembersInjector implements MembersInjector<BasePreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  public BasePreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
  }

  public static MembersInjector<BasePreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    return new BasePreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, projectsDataServiceProvider);
  }

  @Override
  public void injectMembers(BasePreferencesFragment instance) {
    injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BasePreferencesFragment.settingsChangeHandler")
  public static void injectSettingsChangeHandler(BasePreferencesFragment instance,
      SettingsChangeHandler settingsChangeHandler) {
    instance.settingsChangeHandler = settingsChangeHandler;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BasePreferencesFragment.settingsProvider")
  public static void injectSettingsProvider(BasePreferencesFragment instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.BasePreferencesFragment.projectsDataService")
  public static void injectProjectsDataService(BasePreferencesFragment instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }
}
