package org.odk.collect.android.preferences.dialogs;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.preferences.ProjectPreferencesViewModel;
import org.odk.collect.android.utilities.SoftKeyboardController;
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
public final class ChangeAdminPasswordDialog_MembersInjector implements MembersInjector<ChangeAdminPasswordDialog> {
  private final Provider<ProjectPreferencesViewModel.Factory> factoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<SoftKeyboardController> softKeyboardControllerProvider;

  public ChangeAdminPasswordDialog_MembersInjector(
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider) {
    this.factoryProvider = factoryProvider;
    this.settingsProvider = settingsProvider;
    this.softKeyboardControllerProvider = softKeyboardControllerProvider;
  }

  public static MembersInjector<ChangeAdminPasswordDialog> create(
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider) {
    return new ChangeAdminPasswordDialog_MembersInjector(factoryProvider, settingsProvider, softKeyboardControllerProvider);
  }

  @Override
  public void injectMembers(ChangeAdminPasswordDialog instance) {
    injectFactory(instance, factoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectSoftKeyboardController(instance, softKeyboardControllerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.dialogs.ChangeAdminPasswordDialog.factory")
  public static void injectFactory(ChangeAdminPasswordDialog instance,
      ProjectPreferencesViewModel.Factory factory) {
    instance.factory = factory;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.dialogs.ChangeAdminPasswordDialog.settingsProvider")
  public static void injectSettingsProvider(ChangeAdminPasswordDialog instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.dialogs.ChangeAdminPasswordDialog.softKeyboardController")
  public static void injectSoftKeyboardController(ChangeAdminPasswordDialog instance,
      SoftKeyboardController softKeyboardController) {
    instance.softKeyboardController = softKeyboardController;
  }
}
