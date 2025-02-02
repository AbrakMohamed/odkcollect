package org.odk.collect.android.formentry;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.ExternalAppIntentProvider;
import org.odk.collect.androidshared.system.IntentLauncher;
import org.odk.collect.permissions.PermissionsProvider;
import org.odk.collect.settings.SettingsProvider;

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
public final class ODKView_MembersInjector implements MembersInjector<ODKView> {
  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ExternalAppIntentProvider> externalAppIntentProvider;

  private final Provider<IntentLauncher> intentLauncherProvider;

  public ODKView_MembersInjector(Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ExternalAppIntentProvider> externalAppIntentProvider,
      Provider<IntentLauncher> intentLauncherProvider) {
    this.permissionsProvider = permissionsProvider;
    this.settingsProvider = settingsProvider;
    this.externalAppIntentProvider = externalAppIntentProvider;
    this.intentLauncherProvider = intentLauncherProvider;
  }

  public static MembersInjector<ODKView> create(Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ExternalAppIntentProvider> externalAppIntentProvider,
      Provider<IntentLauncher> intentLauncherProvider) {
    return new ODKView_MembersInjector(permissionsProvider, settingsProvider, externalAppIntentProvider, intentLauncherProvider);
  }

  @Override
  public void injectMembers(ODKView instance) {
    injectPermissionsProvider(instance, permissionsProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectExternalAppIntentProvider(instance, externalAppIntentProvider.get());
    injectIntentLauncher(instance, intentLauncherProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.ODKView.permissionsProvider")
  public static void injectPermissionsProvider(ODKView instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.ODKView.settingsProvider")
  public static void injectSettingsProvider(ODKView instance, SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.ODKView.externalAppIntentProvider")
  public static void injectExternalAppIntentProvider(ODKView instance,
      ExternalAppIntentProvider externalAppIntentProvider) {
    instance.externalAppIntentProvider = externalAppIntentProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.ODKView.intentLauncher")
  public static void injectIntentLauncher(ODKView instance, IntentLauncher intentLauncher) {
    instance.intentLauncher = intentLauncher;
  }
}
