package org.odk.collect.android.preferences;

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
public final class CaptionedListPreference_MembersInjector implements MembersInjector<CaptionedListPreference> {
  private final Provider<SettingsProvider> settingsProvider;

  public CaptionedListPreference_MembersInjector(Provider<SettingsProvider> settingsProvider) {
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<CaptionedListPreference> create(
      Provider<SettingsProvider> settingsProvider) {
    return new CaptionedListPreference_MembersInjector(settingsProvider);
  }

  @Override
  public void injectMembers(CaptionedListPreference instance) {
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.CaptionedListPreference.settingsProvider")
  public static void injectSettingsProvider(CaptionedListPreference instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
