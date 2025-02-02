package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formentry.media.AudioHelperFactory;
import org.odk.collect.async.Scheduler;

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
public final class AppDependencyModule_ProvidesAudioHelperFactoryFactory implements Factory<AudioHelperFactory> {
  private final AppDependencyModule module;

  private final Provider<Scheduler> schedulerProvider;

  public AppDependencyModule_ProvidesAudioHelperFactoryFactory(AppDependencyModule module,
      Provider<Scheduler> schedulerProvider) {
    this.module = module;
    this.schedulerProvider = schedulerProvider;
  }

  @Override
  public AudioHelperFactory get() {
    return providesAudioHelperFactory(module, schedulerProvider.get());
  }

  public static AppDependencyModule_ProvidesAudioHelperFactoryFactory create(
      AppDependencyModule module, Provider<Scheduler> schedulerProvider) {
    return new AppDependencyModule_ProvidesAudioHelperFactoryFactory(module, schedulerProvider);
  }

  public static AudioHelperFactory providesAudioHelperFactory(AppDependencyModule instance,
      Scheduler scheduler) {
    return Preconditions.checkNotNullFromProvides(instance.providesAudioHelperFactory(scheduler));
  }
}
