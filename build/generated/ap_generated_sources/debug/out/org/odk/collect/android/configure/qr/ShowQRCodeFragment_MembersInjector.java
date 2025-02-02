package org.odk.collect.android.configure.qr;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.async.Scheduler;
import org.odk.collect.settings.SettingsProvider;

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
public final class ShowQRCodeFragment_MembersInjector implements MembersInjector<ShowQRCodeFragment> {
  private final Provider<QRCodeGenerator> qrCodeGeneratorProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<AppConfigurationGenerator> appConfigurationGeneratorProvider;

  public ShowQRCodeFragment_MembersInjector(Provider<QRCodeGenerator> qrCodeGeneratorProvider,
      Provider<SettingsProvider> settingsProvider, Provider<Scheduler> schedulerProvider,
      Provider<AppConfigurationGenerator> appConfigurationGeneratorProvider) {
    this.qrCodeGeneratorProvider = qrCodeGeneratorProvider;
    this.settingsProvider = settingsProvider;
    this.schedulerProvider = schedulerProvider;
    this.appConfigurationGeneratorProvider = appConfigurationGeneratorProvider;
  }

  public static MembersInjector<ShowQRCodeFragment> create(
      Provider<QRCodeGenerator> qrCodeGeneratorProvider,
      Provider<SettingsProvider> settingsProvider, Provider<Scheduler> schedulerProvider,
      Provider<AppConfigurationGenerator> appConfigurationGeneratorProvider) {
    return new ShowQRCodeFragment_MembersInjector(qrCodeGeneratorProvider, settingsProvider, schedulerProvider, appConfigurationGeneratorProvider);
  }

  @Override
  public void injectMembers(ShowQRCodeFragment instance) {
    injectQrCodeGenerator(instance, qrCodeGeneratorProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectScheduler(instance, schedulerProvider.get());
    injectAppConfigurationGenerator(instance, appConfigurationGeneratorProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.ShowQRCodeFragment.qrCodeGenerator")
  public static void injectQrCodeGenerator(ShowQRCodeFragment instance,
      QRCodeGenerator qrCodeGenerator) {
    instance.qrCodeGenerator = qrCodeGenerator;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.ShowQRCodeFragment.settingsProvider")
  public static void injectSettingsProvider(ShowQRCodeFragment instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.ShowQRCodeFragment.scheduler")
  public static void injectScheduler(ShowQRCodeFragment instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }

  @InjectedFieldSignature("org.odk.collect.android.configure.qr.ShowQRCodeFragment.appConfigurationGenerator")
  public static void injectAppConfigurationGenerator(ShowQRCodeFragment instance,
      AppConfigurationGenerator appConfigurationGenerator) {
    instance.appConfigurationGenerator = appConfigurationGenerator;
  }
}
