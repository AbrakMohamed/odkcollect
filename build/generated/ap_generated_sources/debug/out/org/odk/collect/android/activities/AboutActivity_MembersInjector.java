package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.androidshared.system.IntentLauncher;

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
public final class AboutActivity_MembersInjector implements MembersInjector<AboutActivity> {
  private final Provider<IntentLauncher> intentLauncherProvider;

  public AboutActivity_MembersInjector(Provider<IntentLauncher> intentLauncherProvider) {
    this.intentLauncherProvider = intentLauncherProvider;
  }

  public static MembersInjector<AboutActivity> create(
      Provider<IntentLauncher> intentLauncherProvider) {
    return new AboutActivity_MembersInjector(intentLauncherProvider);
  }

  @Override
  public void injectMembers(AboutActivity instance) {
    injectIntentLauncher(instance, intentLauncherProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.AboutActivity.intentLauncher")
  public static void injectIntentLauncher(AboutActivity instance, IntentLauncher intentLauncher) {
    instance.intentLauncher = intentLauncher;
  }
}
