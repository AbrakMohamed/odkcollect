package org.odk.collect.android.injection.config;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppDependencyModule_ProvidesGsonFactory implements Factory<Gson> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvidesGsonFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return providesGson(module);
  }

  public static AppDependencyModule_ProvidesGsonFactory create(AppDependencyModule module) {
    return new AppDependencyModule_ProvidesGsonFactory(module);
  }

  public static Gson providesGson(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesGson());
  }
}
