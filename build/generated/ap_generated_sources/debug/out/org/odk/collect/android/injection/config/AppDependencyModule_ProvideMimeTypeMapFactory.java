package org.odk.collect.android.injection.config;

import android.webkit.MimeTypeMap;
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
public final class AppDependencyModule_ProvideMimeTypeMapFactory implements Factory<MimeTypeMap> {
  private final AppDependencyModule module;

  public AppDependencyModule_ProvideMimeTypeMapFactory(AppDependencyModule module) {
    this.module = module;
  }

  @Override
  public MimeTypeMap get() {
    return provideMimeTypeMap(module);
  }

  public static AppDependencyModule_ProvideMimeTypeMapFactory create(AppDependencyModule module) {
    return new AppDependencyModule_ProvideMimeTypeMapFactory(module);
  }

  public static MimeTypeMap provideMimeTypeMap(AppDependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMimeTypeMap());
  }
}
