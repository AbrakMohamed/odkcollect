package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.preferences.PreferenceVisibilityHandler;
import org.odk.collect.android.version.VersionInformation;
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
public final class AppDependencyModule_ProvidesDisabledPreferencesRemoverFactory implements Factory<PreferenceVisibilityHandler> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<VersionInformation> versionInformationProvider;

  public AppDependencyModule_ProvidesDisabledPreferencesRemoverFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider,
      Provider<VersionInformation> versionInformationProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
    this.versionInformationProvider = versionInformationProvider;
  }

  @Override
  public PreferenceVisibilityHandler get() {
    return providesDisabledPreferencesRemover(module, settingsProvider.get(), versionInformationProvider.get());
  }

  public static AppDependencyModule_ProvidesDisabledPreferencesRemoverFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider,
      Provider<VersionInformation> versionInformationProvider) {
    return new AppDependencyModule_ProvidesDisabledPreferencesRemoverFactory(module, settingsProvider, versionInformationProvider);
  }

  public static PreferenceVisibilityHandler providesDisabledPreferencesRemover(
      AppDependencyModule instance, SettingsProvider settingsProvider,
      VersionInformation versionInformation) {
    return Preconditions.checkNotNullFromProvides(instance.providesDisabledPreferencesRemover(settingsProvider, versionInformation));
  }
}
