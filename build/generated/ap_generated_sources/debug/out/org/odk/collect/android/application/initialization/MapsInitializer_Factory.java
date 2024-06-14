package org.odk.collect.android.application.initialization;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.settings.SettingsProvider;
import org.odk.collect.utilities.UserAgentProvider;

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
public final class MapsInitializer_Factory implements Factory<MapsInitializer> {
  private final Provider<Context> contextProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<UserAgentProvider> userAgentProvider;

  public MapsInitializer_Factory(Provider<Context> contextProvider,
      Provider<SettingsProvider> settingsProvider, Provider<UserAgentProvider> userAgentProvider) {
    this.contextProvider = contextProvider;
    this.settingsProvider = settingsProvider;
    this.userAgentProvider = userAgentProvider;
  }

  @Override
  public MapsInitializer get() {
    return newInstance(contextProvider.get(), settingsProvider.get(), userAgentProvider.get());
  }

  public static MapsInitializer_Factory create(Provider<Context> contextProvider,
      Provider<SettingsProvider> settingsProvider, Provider<UserAgentProvider> userAgentProvider) {
    return new MapsInitializer_Factory(contextProvider, settingsProvider, userAgentProvider);
  }

  public static MapsInitializer newInstance(Context context, SettingsProvider settingsProvider,
      UserAgentProvider userAgentProvider) {
    return new MapsInitializer(context, settingsProvider, userAgentProvider);
  }
}
