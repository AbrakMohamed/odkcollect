package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.odk.collect.utilities.UserAgentProvider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppDependencyModule_ProvidesUserAgentFactory implements Factory<UserAgentProvider> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesUserAgentFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public UserAgentProvider get() {
    return providesUserAgent(module);
  }

  public static AppDependencyModule_ProvidesUserAgentFactory create(AppDependencyModule module) {
    return new AppDependencyModule_ProvidesUserAgentFactory(module);
  }

  public static UserAgentProvider providesUserAgent(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesUserAgent());
  }
}
