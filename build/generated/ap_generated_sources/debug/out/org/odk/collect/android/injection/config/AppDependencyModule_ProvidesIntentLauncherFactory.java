package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class AppDependencyModule_ProvidesIntentLauncherFactory implements Factory<IntentLauncher> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesIntentLauncherFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public IntentLauncher get() {
    return providesIntentLauncher(module);
  }

  public static AppDependencyModule_ProvidesIntentLauncherFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesIntentLauncherFactory(module);
  }

  public static IntentLauncher providesIntentLauncher(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesIntentLauncher());
  }
}
