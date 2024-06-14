package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.instancemanagement.autosend.AutoSendSettingsProvider;
import org.odk.collect.androidshared.network.NetworkStateProvider;
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
public final class AppDependencyModule_ProvidesAutoSendSettingsProviderFactory implements Factory<AutoSendSettingsProvider> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<NetworkStateProvider> networkStateProvider;

  public AppDependencyModule_ProvidesAutoSendSettingsProviderFactory(AppDependencyModule module,
      Provider<Application> applicationProvider, Provider<SettingsProvider> settingsProvider,
      Provider<NetworkStateProvider> networkStateProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.settingsProvider = settingsProvider;
    this.networkStateProvider = networkStateProvider;
  }

  @Override
  public AutoSendSettingsProvider get() {
    return providesAutoSendSettingsProvider(module, applicationProvider.get(), settingsProvider.get(), networkStateProvider.get());
  }

  public static AppDependencyModule_ProvidesAutoSendSettingsProviderFactory create(
      AppDependencyModule module, Provider<Application> applicationProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<NetworkStateProvider> networkStateProvider) {
    return new AppDependencyModule_ProvidesAutoSendSettingsProviderFactory(module, applicationProvider, settingsProvider, networkStateProvider);
  }

  public static AutoSendSettingsProvider providesAutoSendSettingsProvider(
      AppDependencyModule instance, Application application, SettingsProvider settingsProvider,
      NetworkStateProvider networkStateProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesAutoSendSettingsProvider(application, settingsProvider, networkStateProvider));
  }
}
