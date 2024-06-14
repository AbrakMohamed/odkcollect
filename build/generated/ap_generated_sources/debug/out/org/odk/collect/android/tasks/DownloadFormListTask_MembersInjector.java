package org.odk.collect.android.tasks;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.FormsDataService;
import org.odk.collect.android.projects.ProjectsDataService;

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
public final class DownloadFormListTask_MembersInjector implements MembersInjector<DownloadFormListTask> {
  private final Provider<FormsDataService> formsDataServiceProvider;

  private final Provider<ProjectsDataService> projectsDataServiceProvider;

  public DownloadFormListTask_MembersInjector(Provider<FormsDataService> formsDataServiceProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    this.formsDataServiceProvider = formsDataServiceProvider;
    this.projectsDataServiceProvider = projectsDataServiceProvider;
  }

  public static MembersInjector<DownloadFormListTask> create(
      Provider<FormsDataService> formsDataServiceProvider,
      Provider<ProjectsDataService> projectsDataServiceProvider) {
    return new DownloadFormListTask_MembersInjector(formsDataServiceProvider, projectsDataServiceProvider);
  }

  @Override
  public void injectMembers(DownloadFormListTask instance) {
    injectFormsDataService(instance, formsDataServiceProvider.get());
    injectProjectsDataService(instance, projectsDataServiceProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.tasks.DownloadFormListTask.formsDataService")
  public static void injectFormsDataService(DownloadFormListTask instance,
      FormsDataService formsDataService) {
    instance.formsDataService = formsDataService;
  }

  @InjectedFieldSignature("org.odk.collect.android.tasks.DownloadFormListTask.projectsDataService")
  public static void injectProjectsDataService(DownloadFormListTask instance,
      ProjectsDataService projectsDataService) {
    instance.projectsDataService = projectsDataService;
  }
}
