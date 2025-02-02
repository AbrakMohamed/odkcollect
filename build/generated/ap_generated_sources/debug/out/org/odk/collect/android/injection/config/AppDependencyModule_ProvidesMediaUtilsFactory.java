package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.MediaUtils;
import org.odk.collect.androidshared.system.IntentLauncher;

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
public final class AppDependencyModule_ProvidesMediaUtilsFactory implements Factory<MediaUtils> {
  private final AppDependencyModule module;

  private final Provider<IntentLauncher> intentLauncherProvider;

  public AppDependencyModule_ProvidesMediaUtilsFactory(AppDependencyModule module,
      Provider<IntentLauncher> intentLauncherProvider) {
    this.module = module;
    this.intentLauncherProvider = intentLauncherProvider;
  }

  @Override
  public MediaUtils get() {
    return providesMediaUtils(module, intentLauncherProvider.get());
  }

  public static AppDependencyModule_ProvidesMediaUtilsFactory create(AppDependencyModule module,
      Provider<IntentLauncher> intentLauncherProvider) {
    return new AppDependencyModule_ProvidesMediaUtilsFactory(module, intentLauncherProvider);
  }

  public static MediaUtils providesMediaUtils(AppDependencyModule instance,
      IntentLauncher intentLauncher) {
    return Preconditions.checkNotNullFromProvides(instance.providesMediaUtils(intentLauncher));
  }
}
