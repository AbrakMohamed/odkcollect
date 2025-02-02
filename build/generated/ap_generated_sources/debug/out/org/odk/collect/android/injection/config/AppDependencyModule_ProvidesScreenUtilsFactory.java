package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.androidshared.utils.ScreenUtils;

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
public final class AppDependencyModule_ProvidesScreenUtilsFactory implements Factory<ScreenUtils> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  public AppDependencyModule_ProvidesScreenUtilsFactory(AppDependencyModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public ScreenUtils get() {
    return providesScreenUtils(module, contextProvider.get());
  }

  public static AppDependencyModule_ProvidesScreenUtilsFactory create(AppDependencyModule module,
      Provider<Context> contextProvider) {
    return new AppDependencyModule_ProvidesScreenUtilsFactory(module, contextProvider);
  }

  public static ScreenUtils providesScreenUtils(AppDependencyModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.providesScreenUtils(context));
  }
}
