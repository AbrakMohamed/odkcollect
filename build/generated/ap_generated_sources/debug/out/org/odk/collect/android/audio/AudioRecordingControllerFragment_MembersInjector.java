package org.odk.collect.android.audio;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.audiorecorder.recording.AudioRecorder;

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
public final class AudioRecordingControllerFragment_MembersInjector implements MembersInjector<AudioRecordingControllerFragment> {
  private final Provider<AudioRecorder> audioRecorderProvider;

  public AudioRecordingControllerFragment_MembersInjector(
      Provider<AudioRecorder> audioRecorderProvider) {
    this.audioRecorderProvider = audioRecorderProvider;
  }

  public static MembersInjector<AudioRecordingControllerFragment> create(
      Provider<AudioRecorder> audioRecorderProvider) {
    return new AudioRecordingControllerFragment_MembersInjector(audioRecorderProvider);
  }

  @Override
  public void injectMembers(AudioRecordingControllerFragment instance) {
    injectAudioRecorder(instance, audioRecorderProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.audio.AudioRecordingControllerFragment.audioRecorder")
  public static void injectAudioRecorder(AudioRecordingControllerFragment instance,
      AudioRecorder audioRecorder) {
    instance.audioRecorder = audioRecorder;
  }
}
