package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.FormsDataService;
import org.odk.collect.android.formmanagement.ServerFormsDetailsFetcher;
import org.odk.collect.android.projects.ProjectsDataService;
import org.odk.collect.android.utilities.WebCredentialsUtils;
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
public final class FormDownloadListActivity_MembersInjector implements MembersInjector<FormDownloadListActivity> {
  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<WebCredentialsUtils> webCredentialsUtilsProvider;

  private final Provider<ServerFormsDetailsFetcher> serverFormsDetailsFetcherProvider;

  private final Provider<NetworkStateProvider> connectivityProvider;

  private final Provider<FormsDataService> formsDataServiceProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  public FormDownloadListActivity_MembersInjector(Provider<SettingsProvider> settingsProvider,
      Provider<WebCredentialsUtils> webCredentialsUtilsProvider,
      Provider<ServerFormsDetailsFetcher> serverFormsDetailsFetcherProvider,
      Provider<NetworkStateProvider> connectivityProvider,
      Provider<FormsDataService> formsDataServiceProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    this.settingsProvider = settingsProvider;
    this.webCredentialsUtilsProvider = webCredentialsUtilsProvider;
    this.serverFormsDetailsFetcherProvider = serverFormsDetailsFetcherProvider;
    this.connectivityProvider = connectivityProvider;
    this.formsDataServiceProvider = formsDataServiceProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
  }

  public static MembersInjector<FormDownloadListActivity> create(
      Provider<SettingsProvider> settingsProvider,
      Provider<WebCredentialsUtils> webCredentialsUtilsProvider,
      Provider<ServerFormsDetailsFetcher> serverFormsDetailsFetcherProvider,
      Provider<NetworkStateProvider> connectivityProvider,
      Provider<FormsDataService> formsDataServiceProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    return new FormDownloadListActivity_MembersInjector(settingsProvider, webCredentialsUtilsProvider, serverFormsDetailsFetcherProvider, connectivityProvider, formsDataServiceProvider, projectsDataServiceProvider);
  }

  @Override
  public void injectMembers(FormDownloadListActivity instance) {
    AppListActivity_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    injectWebCredentialsUtils(instance, webCredentialsUtilsProvider.get());
    injectServerFormsDetailsFetcher(instance, serverFormsDetailsFetcherProvider.get());
    injectConnectivityProvider(instance, connectivityProvider.get());
    injectFormsDataService(instance, formsDataServiceProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormDownloadListActivity.webCredentialsUtils")
  public static void injectWebCredentialsUtils(FormDownloadListActivity instance,
      WebCredentialsUtils webCredentialsUtils) {
    instance.webCredentialsUtils = webCredentialsUtils;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormDownloadListActivity.serverFormsDetailsFetcher")
  public static void injectServerFormsDetailsFetcher(FormDownloadListActivity instance,
      ServerFormsDetailsFetcher serverFormsDetailsFetcher) {
    instance.serverFormsDetailsFetcher = serverFormsDetailsFetcher;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormDownloadListActivity.connectivityProvider")
  public static void injectConnectivityProvider(FormDownloadListActivity instance,
      NetworkStateProvider connectivityProvider) {
    instance.connectivityProvider = connectivityProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormDownloadListActivity.formsDataService")
  public static void injectFormsDataService(FormDownloadListActivity instance,
      FormsDataService formsDataService) {
    instance.formsDataService = formsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FormDownloadListActivity.projectsDataService")
  public static void injectProjectsDataService(FormDownloadListActivity instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }
}
