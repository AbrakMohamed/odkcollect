package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.FileProvider;

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
public final class AppDependencyModule_ProvidesFileProviderFactory implements Factory<FileProvider> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  public AppDependencyModule_ProvidesFileProviderFactory(AppDependencyModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public FileProvider get() {
    return providesFileProvider(module, contextProvider.get());
  }

  public static AppDependencyModule_ProvidesFileProviderFactory create(AppDependencyModule module,
      Provider<Context> contextProvider) {
    return new AppDependencyModule_ProvidesFileProviderFactory(module, contextProvider);
  }

  public static FileProvider providesFileProvider(AppDependencyModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providesFileProvider(context));
  }
}
