package org.odk.collect.android.instancemanagement.send;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.backgroundwork.InstanceSubmitScheduler;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.androidshared.network.NetworkStateProvider;
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
public final class InstanceUploaderListActivity_MembersInjector implements MembersInjector<InstanceUploaderListActivity> {
  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  private final Provider<NetworkStateProvider> connectivityProvider;

  private final Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ReadyToSendViewModel.Factory> factoryProvider;

  public InstanceUploaderListActivity_MembersInjector(
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<NetworkStateProvider> connectivityProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ReadyToSendViewModel.Factory> factoryProvider) {
    this.projectsDataServiceProvider = projectsDataServiceProvider;
    this.connectivityProvider = connectivityProvider;
    this.instanceSubmitSchedulerProvider = instanceSubmitSchedulerProvider;
    this.settingsProvider = settingsProvider;
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<InstanceUploaderListActivity> create(
      Provider<ProjectsDataService> projectsDataServiceProvider,
      Provider<NetworkStateProvider> connectivityProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ReadyToSendViewModel.Factory> factoryProvider) {
    return new InstanceUploaderListActivity_MembersInjector(projectsDataServiceProvider, connectivityProvider, instanceSubmitSchedulerProvider, settingsProvider, factoryProvider);
  }

  @Override
  public void injectMembers(InstanceUploaderListActivity instance) {
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
    injectConnectivityProvider(instance, connectivityProvider.get());
    injectInstanceSubmitScheduler(instance, instanceSubmitSchedulerProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectFactory(instance, factoryProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.instancemanagement.send.InstanceUploaderListActivity.projectsDataService")
  public static void injectProjectsDataService(InstanceUploaderListActivity instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.instancemanagement.send.InstanceUploaderListActivity.connectivityProvider")
  public static void injectConnectivityProvider(InstanceUploaderListActivity instance,
      NetworkStateProvider connectivityProvider) {
    instance.connectivityProvider = connectivityProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.instancemanagement.send.InstanceUploaderListActivity.instanceSubmitScheduler")
  public static void injectInstanceSubmitScheduler(InstanceUploaderListActivity instance,
      InstanceSubmitScheduler instanceSubmitScheduler) {
    instance.instanceSubmitScheduler = instanceSubmitScheduler;
  }

  @InjectedFieldSignature("org.odk.collect.android.instancemanagement.send.InstanceUploaderListActivity.settingsProvider")
  public static void injectSettingsProvider(InstanceUploaderListActivity instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.instancemanagement.send.InstanceUploaderListActivity.factory")
  public static void injectFactory(InstanceUploaderListActivity instance,
      ReadyToSendViewModel.Factory factory) {
    instance.factory = factory;
  }
}
