package org.odk.collect.android.external;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formlists.blankformlist.BlankFormListViewModel;
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
public final class AndroidShortcutsActivity_MembersInjector implements MembersInjector<AndroidShortcutsActivity> {
  private final Provider<BlankFormListViewModel.Factory> viewModelFactoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AndroidShortcutsActivity_MembersInjector(
      Provider<BlankFormListViewModel.Factory> viewModelFactoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<AndroidShortcutsActivity> create(
      Provider<BlankFormListViewModel.Factory> viewModelFactoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new AndroidShortcutsActivity_MembersInjector(viewModelFactoryProvider, settingsProvider);
  }

  @Override
  public void injectMembers(AndroidShortcutsActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.external.AndroidShortcutsActivity.viewModelFactory")
  public static void injectViewModelFactory(AndroidShortcutsActivity instance,
      BlankFormListViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.external.AndroidShortcutsActivity.settingsProvider")
  public static void injectSettingsProvider(AndroidShortcutsActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
