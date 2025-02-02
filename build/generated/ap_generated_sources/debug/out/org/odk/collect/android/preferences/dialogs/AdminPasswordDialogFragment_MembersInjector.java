package org.odk.collect.android.preferences.dialogs;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.preferences.ProjectPreferencesViewModel;
import org.odk.collect.android.utilities.AdminPasswordProvider;
import org.odk.collect.android.utilities.SoftKeyboardController;

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
public final class AdminPasswordDialogFragment_MembersInjector implements MembersInjector<AdminPasswordDialogFragment> {
  private final Provider<ProjectPreferencesViewModel.Factory> factoryProvider;

  private final Provider<AdminPasswordProvider> adminPasswordProvider;

  private final Provider<SoftKeyboardController> softKeyboardControllerProvider;

  public AdminPasswordDialogFragment_MembersInjector(
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider) {
    this.factoryProvider = factoryProvider;
    this.adminPasswordProvider = adminPasswordProvider;
    this.softKeyboardControllerProvider = softKeyboardControllerProvider;
  }

  public static MembersInjector<AdminPasswordDialogFragment> create(
      Provider<ProjectPreferencesViewModel.Factory> factoryProvider,
      Provider<AdminPasswordProvider> adminPasswordProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider) {
    return new AdminPasswordDialogFragment_MembersInjector(factoryProvider, adminPasswordProvider, softKeyboardControllerProvider);
  }

  @Override
  public void injectMembers(AdminPasswordDialogFragment instance) {
    injectFactory(instance, factoryProvider.get());
    injectAdminPasswordProvider(instance, adminPasswordProvider.get());
    injectSoftKeyboardController(instance, softKeyboardControllerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.dialogs.AdminPasswordDialogFragment.factory")
  public static void injectFactory(AdminPasswordDialogFragment instance,
      ProjectPreferencesViewModel.Factory factory) {
    instance.factory = factory;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.dialogs.AdminPasswordDialogFragment.adminPasswordProvider")
  public static void injectAdminPasswordProvider(AdminPasswordDialogFragment instance,
      AdminPasswordProvider adminPasswordProvider) {
    instance.adminPasswordProvider = adminPasswordProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.dialogs.AdminPasswordDialogFragment.softKeyboardController")
  public static void injectSoftKeyboardController(AdminPasswordDialogFragment instance,
      SoftKeyboardController softKeyboardController) {
    instance.softKeyboardController = softKeyboardController;
  }
}
