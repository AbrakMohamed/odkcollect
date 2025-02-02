package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.audiorecorder.recording.AudioRecorder;

@ScopeMetadata
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
public final class AppDependencyModule_ProvidesAudioRecorderFactory implements Factory<AudioRecorder> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  public AppDependencyModule_ProvidesAudioRecorderFactory(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AudioRecorder get() {
    return providesAudioRecorder(module, applicationProvider.get());
  }

  public static AppDependencyModule_ProvidesAudioRecorderFactory create(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    return new AppDependencyModule_ProvidesAudioRecorderFactory(module, applicationProvider);
  }

  public static AudioRecorder providesAudioRecorder(AppDependencyModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesAudioRecorder(application));
  }
}
