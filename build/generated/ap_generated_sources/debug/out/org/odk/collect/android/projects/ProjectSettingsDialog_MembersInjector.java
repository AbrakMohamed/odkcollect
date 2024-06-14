package org.odk.collect.android.projects;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.projects.ProjectsRepository;
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
public final class ProjectSettingsDialog_MembersInjector implements MembersInjector<ProjectSettingsDialog> {
  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public ProjectSettingsDialog_MembersInjector(
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<ProjectSettingsDialog> create(
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new ProjectSettingsDialog_MembersInjector(projectsRepositoryProvider, settingsProvider);
  }

  @Override
  public void injectMembers(ProjectSettingsDialog instance) {
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ProjectSettingsDialog.projectsRepository")
  public static void injectProjectsRepository(ProjectSettingsDialog instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ProjectSettingsDialog.settingsProvider")
  public static void injectSettingsProvider(ProjectSettingsDialog instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}
