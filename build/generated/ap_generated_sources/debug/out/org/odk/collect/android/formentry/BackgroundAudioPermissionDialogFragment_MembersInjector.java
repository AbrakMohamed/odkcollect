package org.odk.collect.android.formentry;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.permissions.PermissionsProvider;

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
public final class BackgroundAudioPermissionDialogFragment_MembersInjector implements MembersInjector<BackgroundAudioPermissionDialogFragment> {
  private final Provider<PermissionsProvider> permissionsProvider;

  public BackgroundAudioPermissionDialogFragment_MembersInjector(
      Provider<PermissionsProvider> permissionsProvider) {
    this.permissionsProvider = permissionsProvider;
  }

  public static MembersInjector<BackgroundAudioPermissionDialogFragment> create(
      Provider<PermissionsProvider> permissionsProvider) {
    return new BackgroundAudioPermissionDialogFragment_MembersInjector(permissionsProvider);
  }

  @Override
  public void injectMembers(BackgroundAudioPermissionDialogFragment instance) {
    injectPermissionsProvider(instance, permissionsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.formentry.BackgroundAudioPermissionDialogFragment.permissionsProvider")
  public static void injectPermissionsProvider(BackgroundAudioPermissionDialogFragment instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }
}
