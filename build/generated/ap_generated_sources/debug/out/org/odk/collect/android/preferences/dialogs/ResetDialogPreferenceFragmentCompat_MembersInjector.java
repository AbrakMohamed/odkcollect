package org.odk.collect.android.preferences.dialogs;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.projects.ProjectResetter;

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
public final class ResetDialogPreferenceFragmentCompat_MembersInjector implements MembersInjector<ResetDialogPreferenceFragmentCompat> {
  private final Provider<ProjectResetter> projectResetterProvider;

  public ResetDialogPreferenceFragmentCompat_MembersInjector(
      Provider<ProjectResetter> projectResetterProvider) {
    this.projectResetterProvider = projectResetterProvider;
  }

  public static MembersInjector<ResetDialogPreferenceFragmentCompat> create(
      Provider<ProjectResetter> projectResetterProvider) {
    return new ResetDialogPreferenceFragmentCompat_MembersInjector(projectResetterProvider);
  }

  @Override
  public void injectMembers(ResetDialogPreferenceFragmentCompat instance) {
    injectProjectResetter(instance, projectResetterProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.dialogs.ResetDialogPreferenceFragmentCompat.projectResetter")
  public static void injectProjectResetter(ResetDialogPreferenceFragmentCompat instance,
      ProjectResetter projectResetter) {
    instance.projectResetter = projectResetter;
  }
}
