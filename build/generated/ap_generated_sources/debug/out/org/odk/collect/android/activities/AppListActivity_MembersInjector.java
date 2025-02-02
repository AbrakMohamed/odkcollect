package org.odk.collect.android.activities;

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
public final class AppListActivity_MembersInjector implements MembersInjector<AppListActivity> {
  private final Provider<SettingsProvider> settingsProvider;

  public AppListActivity_MembersInjector(Provider<SettingsProvider> settingsProvider) {
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<AppListActivity> create(
      Provider<SettingsProvider> settingsProvider) {
    return new AppListActivity_MembersInjector(settingsProvider);
  }

  @Override
  public void injectMembers(AppListActivity instance) {
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.AppListActivity.settingsProvider")
  public static void injectSettingsProvider(AppListActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
