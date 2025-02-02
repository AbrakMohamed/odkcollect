package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formentry.FormSessionRepository;

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
public final class AppDependencyModule_ProvidesFormSessionStoreFactory implements Factory<FormSessionRepository> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  public AppDependencyModule_ProvidesFormSessionStoreFactory(AppDependencyModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public FormSessionRepository get() {
    return providesFormSessionStore(module, applicationProvider.get());
  }

  public static AppDependencyModule_ProvidesFormSessionStoreFactory create(
      AppDependencyModule module, Provider<Application> applicationProvider) {
    return new AppDependencyModule_ProvidesFormSessionStoreFactory(module, applicationProvider);
  }

  public static FormSessionRepository providesFormSessionStore(AppDependencyModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.providesFormSessionStore(application));
  }
}
