package org.odk.collect.android.tasks;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.ImageCompressionController;
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
public final class MediaLoadingTask_MembersInjector implements MembersInjector<MediaLoadingTask> {
  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ImageCompressionController> imageCompressionControllerProvider;

  public MediaLoadingTask_MembersInjector(Provider<SettingsProvider> settingsProvider,
      Provider<ImageCompressionController> imageCompressionControllerProvider) {
    this.settingsProvider = settingsProvider;
    this.imageCompressionControllerProvider = imageCompressionControllerProvider;
  }

  public static MembersInjector<MediaLoadingTask> create(
      Provider<SettingsProvider> settingsProvider,
      Provider<ImageCompressionController> imageCompressionControllerProvider) {
    return new MediaLoadingTask_MembersInjector(settingsProvider, imageCompressionControllerProvider);
  }

  @Override
  public void injectMembers(MediaLoadingTask instance) {
    injectSettingsProvider(instance, settingsProvider.get());
    injectImageCompressionController(instance, imageCompressionControllerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.tasks.MediaLoadingTask.settingsProvider")
  public static void injectSettingsProvider(MediaLoadingTask instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.tasks.MediaLoadingTask.imageCompressionController")
  public static void injectImageCompressionController(MediaLoadingTask instance,
      ImageCompressionController imageCompressionController) {
    instance.imageCompressionController = imageCompressionController;
  }
}
