package org.odk.collect.android.injection.config;

import android.app.Application;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppDependencyModule_ContextFactory implements Factory<Context> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  public AppDependencyModule_ContextFactory(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return context(module, applicationProvider.get());
  }

  public static AppDependencyModule_ContextFactory create(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    return new AppDependencyModule_ContextFactory(module, applicationProvider);
  }

  public static Context context(AppDependencyModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.context(application));
  }
}
