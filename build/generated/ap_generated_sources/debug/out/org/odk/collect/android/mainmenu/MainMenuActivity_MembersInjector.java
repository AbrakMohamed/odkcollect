package org.odk.collect.android.mainmenu;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class MainMenuActivity_MembersInjector implements MembersInjector<MainMenuActivity> {
  private final Provider<MainMenuViewModelFactory> viewModelFactoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  public MainMenuActivity_MembersInjector(
      Provider<MainMenuViewModelFactory> viewModelFactoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<PermissionsProvider> permissionsProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.settingsProvider = settingsProvider;
    this.permissionsProvider = permissionsProvider;
  }

  public static MembersInjector<MainMenuActivity> create(
      Provider<MainMenuViewModelFactory> viewModelFactoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<PermissionsProvider> permissionsProvider) {
    return new MainMenuActivity_MembersInjector(viewModelFactoryProvider, settingsProvider, permissionsProvider);
  }

  @Override
  public void injectMembers(MainMenuActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectPermissionsProvider(instance, permissionsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.mainmenu.MainMenuActivity.viewModelFactory")
  public static void injectViewModelFactory(MainMenuActivity instance,
      MainMenuViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.mainmenu.MainMenuActivity.settingsProvider")
  public static void injectSettingsProvider(MainMenuActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.mainmenu.MainMenuActivity.permissionsProvider")
  public static void injectPermissionsProvider(MainMenuActivity instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }
}
