package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.android.utilities.SoftKeyboardController;

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
public final class AppDependencyModule_ProvideSoftKeyboardControllerFactory implements Factory<SoftKeyboardController> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvideSoftKeyboardControllerFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public SoftKeyboardController get() {
    return provideSoftKeyboardController(module);
  }

  public static AppDependencyModule_ProvideSoftKeyboardControllerFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvideSoftKeyboardControllerFactory(module);
  }

  public static SoftKeyboardController provideSoftKeyboardController(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSoftKeyboardController());
  }
}
