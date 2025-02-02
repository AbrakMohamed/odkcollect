package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.utilities.WebCredentialsUtils;
import org.odk.collect.settings.SettingsProvider;

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
public final class AppDependencyModule_ProvideWebCredentialsFactory implements Factory<WebCredentialsUtils> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvideWebCredentialsFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public WebCredentialsUtils get() {
    return provideWebCredentials(module, settingsProvider.get());
  }

  public static AppDependencyModule_ProvideWebCredentialsFactory create(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvideWebCredentialsFactory(module, settingsProvider);
  }

  public static WebCredentialsUtils provideWebCredentials(AppDependencyModule instance,
      SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.provideWebCredentials(settingsProvider));
  }
}
