package org.odk.collect.android.utilities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class ThemeUtils_MembersInjector implements MembersInjector<ThemeUtils> {
  private final Provider<SettingsProvider> settingsProvider;

  public ThemeUtils_MembersInjector(Provider<SettingsProvider> settingsProvider) {
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<ThemeUtils> create(Provider<SettingsProvider> settingsProvider) {
    return new ThemeUtils_MembersInjector(settingsProvider);
  }

  @Override
  public void injectMembers(ThemeUtils instance) {
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.utilities.ThemeUtils.settingsProvider")
  public static void injectSettingsProvider(ThemeUtils instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
