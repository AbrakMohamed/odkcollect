package org.odk.collect.android.injection.config;

import android.app.Application;
import android.webkit.MimeTypeMap;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.openrosa.OpenRosaHttpInterface;
import org.odk.collect.android.version.VersionInformation;
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
public final class AppDependencyModule_ProvideHttpInterfaceFactory implements Factory<OpenRosaHttpInterface> {
  private final AppDependencyModule module;

  private final Provider<MimeTypeMap> mimeTypeMapProvider;

  private final Provider<UserAgentProvider> userAgentProvider;

  private final Provider<Application> applicationProvider;

  private final Provider<VersionInformation> versionInformationProvider;

  public AppDependencyModule_ProvideHttpInterfaceFactory(AppDependencyModule module,
      Provider<MimeTypeMap> mimeTypeMapProvider, Provider<UserAgentProvider> userAgentProvider,
      Provider<Application> applicationProvider,
      Provider<VersionInformation> versionInformationProvider) {
    this.module = module;
    this.mimeTypeMapProvider = mimeTypeMapProvider;
    this.userAgentProvider = userAgentProvider;
    this.applicationProvider = applicationProvider;
    this.versionInformationProvider = versionInformationProvider;
  }

  @Override
  public OpenRosaHttpInterface get() {
    return provideHttpInterface(module, mimeTypeMapProvider.get(), userAgentProvider.get(), applicationProvider.get(), versionInformationProvider.get());
  }

  public static AppDependencyModule_ProvideHttpInterfaceFactory create(AppDependencyModule module,
      Provider<MimeTypeMap> mimeTypeMapProvider, Provider<UserAgentProvider> userAgentProvider,
      Provider<Application> applicationProvider,
      Provider<VersionInformation> versionInformationProvider) {
    return new AppDependencyModule_ProvideHttpInterfaceFactory(module, mimeTypeMapProvider, userAgentProvider, applicationProvider, versionInformationProvider);
  }

  public static OpenRosaHttpInterface provideHttpInterface(AppDependencyModule instance,
      MimeTypeMap mimeTypeMap, UserAgentProvider userAgentProvider, Application application,
      VersionInformation versionInformation) {
    return Preconditions.checkNotNullFromProvides(instance.provideHttpInterface(mimeTypeMap, userAgentProvider, application, versionInformation));
  }
}
