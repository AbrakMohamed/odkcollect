package org.odk.collect.android.fragments.dialogs;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formentry.media.AudioHelperFactory;

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
public final class SelectMinimalDialog_MembersInjector implements MembersInjector<SelectMinimalDialog> {
  private final Provider<AudioHelperFactory> audioHelperFactoryProvider;

  public SelectMinimalDialog_MembersInjector(
      Provider<AudioHelperFactory> audioHelperFactoryProvider) {
    this.audioHelperFactoryProvider = audioHelperFactoryProvider;
  }

  public static MembersInjector<SelectMinimalDialog> create(
      Provider<AudioHelperFactory> audioHelperFactoryProvider) {
    return new SelectMinimalDialog_MembersInjector(audioHelperFactoryProvider);
  }

  @Override
  public void injectMembers(SelectMinimalDialog instance) {
    injectAudioHelperFactory(instance, audioHelperFactoryProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.fragments.dialogs.SelectMinimalDialog.audioHelperFactory")
  public static void injectAudioHelperFactory(SelectMinimalDialog instance,
      AudioHelperFactory audioHelperFactory) {
    instance.audioHelperFactory = audioHelperFactory;
  }
}
