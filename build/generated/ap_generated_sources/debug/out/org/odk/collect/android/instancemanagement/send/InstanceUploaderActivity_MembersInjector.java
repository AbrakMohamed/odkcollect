package org.odk.collect.android.instancemanagement.send;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
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
public final class InstanceUploaderActivity_MembersInjector implements MembersInjector<InstanceUploaderActivity> {
  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public InstanceUploaderActivity_MembersInjector(
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<InstanceUploaderActivity> create(
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new InstanceUploaderActivity_MembersInjector(instancesRepositoryProvider, formsRepositoryProvider, settingsProvider);
  }

  @Override
  public void injectMembers(InstanceUploaderActivity instance) {
    injectInstancesRepositoryProvider(instance, instancesRepositoryProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.instancemanagement.send.InstanceUploaderActivity.instancesRepositoryProvider")
  public static void injectInstancesRepositoryProvider(InstanceUploaderActivity instance,
      InstancesRepositoryProvider instancesRepositoryProvider) {
    instance.instancesRepositoryProvider = instancesRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.instancemanagement.send.InstanceUploaderActivity.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(InstanceUploaderActivity instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.instancemanagement.send.InstanceUploaderActivity.settingsProvider")
  public static void injectSettingsProvider(InstanceUploaderActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
