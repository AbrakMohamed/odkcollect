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
public final class AudioRecordingErrorDialogFragment_MembersInjector implements MembersInjector<AudioRecordingErrorDialogFragment> {
  private final Provider<AudioRecorder> audioRecorderProvider;

  public AudioRecordingErrorDialogFragment_MembersInjector(
      Provider<AudioRecorder> audioRecorderProvider) {
    this.audioRecorderProvider = audioRecorderProvider;
  }

  public static MembersInjector<AudioRecordingErrorDialogFragment> create(
      Provider<AudioRecorder> audioRecorderProvider) {
    return new AudioRecordingErrorDialogFragment_MembersInjector(audioRecorderProvider);
  }

  @Override
  public void injectMembers(AudioRecordingErrorDialogFragment instance) {
    injectAudioRecorder(instance, audioRecorderProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.audio.AudioRecordingErrorDialogFragment.audioRecorder")
  public static void injectAudioRecorder(AudioRecordingErrorDialogFragment instance,
      AudioRecorder audioRecorder) {
    instance.audioRecorder = audioRecorder;
  }
}
