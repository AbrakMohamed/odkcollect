package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.javarosa.core.reference.ReferenceManager;

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
public final class AppDependencyModule_ProvidesReferenceManagerFactory implements Factory<ReferenceManager> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesReferenceManagerFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public ReferenceManager get() {
    return providesReferenceManager(module);
  }

  public static AppDependencyModule_ProvidesReferenceManagerFactory create(
      AppDependencyModule module) {
    return new AppDependencyModule_ProvidesReferenceManagerFactory(module);
  }

  public static ReferenceManager providesReferenceManager(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesReferenceManager());
  }
}
