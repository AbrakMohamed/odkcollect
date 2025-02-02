package org.odk.collect.android.widgets;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.javarosa.core.reference.ReferenceManager;
import org.odk.collect.android.formentry.media.AudioHelperFactory;
import org.odk.collect.android.utilities.MediaUtils;
import org.odk.collect.android.utilities.SoftKeyboardController;
import org.odk.collect.androidshared.utils.ScreenUtils;
import org.odk.collect.imageloader.ImageLoader;
import org.odk.collect.permissions.PermissionsProvider;
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
public final class QuestionWidget_MembersInjector implements MembersInjector<QuestionWidget> {
  private final Provider<ReferenceManager> referenceManagerProvider;

  private final Provider<AudioHelperFactory> audioHelperFactoryProvider;

  private final Provider<ScreenUtils> screenUtilsProvider;

  private final Provider<SoftKeyboardController> softKeyboardControllerProvider;

  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<MediaUtils> mediaUtilsProvider;

  private final Provider<ImageLoader> imageLoaderProvider;

  public QuestionWidget_MembersInjector(Provider<ReferenceManager> referenceManagerProvider,
      Provider<AudioHelperFactory> audioHelperFactoryProvider,
      Provider<ScreenUtils> screenUtilsProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider, Provider<MediaUtils> mediaUtilsProvider,
      Provider<ImageLoader> imageLoaderProvider) {
    this.referenceManagerProvider = referenceManagerProvider;
    this.audioHelperFactoryProvider = audioHelperFactoryProvider;
    this.screenUtilsProvider = screenUtilsProvider;
    this.softKeyboardControllerProvider = softKeyboardControllerProvider;
    this.permissionsProvider = permissionsProvider;
    this.settingsProvider = settingsProvider;
    this.mediaUtilsProvider = mediaUtilsProvider;
    this.imageLoaderProvider = imageLoaderProvider;
  }

  public static MembersInjector<QuestionWidget> create(
      Provider<ReferenceManager> referenceManagerProvider,
      Provider<AudioHelperFactory> audioHelperFactoryProvider,
      Provider<ScreenUtils> screenUtilsProvider,
      Provider<SoftKeyboardController> softKeyboardControllerProvider,
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider, Provider<MediaUtils> mediaUtilsProvider,
      Provider<ImageLoader> imageLoaderProvider) {
    return new QuestionWidget_MembersInjector(referenceManagerProvider, audioHelperFactoryProvider, screenUtilsProvider, softKeyboardControllerProvider, permissionsProvider, settingsProvider, mediaUtilsProvider, imageLoaderProvider);
  }

  @Override
  public void injectMembers(QuestionWidget instance) {
    injectReferenceManager(instance, referenceManagerProvider.get());
    injectAudioHelperFactory(instance, audioHelperFactoryProvider.get());
    injectScreenUtils(instance, screenUtilsProvider.get());
    injectSoftKeyboardController(instance, softKeyboardControllerProvider.get());
    injectPermissionsProvider(instance, permissionsProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectMediaUtils(instance, mediaUtilsProvider.get());
    injectImageLoader(instance, imageLoaderProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.widgets.QuestionWidget.referenceManager")
  public static void injectReferenceManager(QuestionWidget instance,
      ReferenceManager referenceManager) {
    instance.referenceManager = referenceManager;
  }

  @InjectedFieldSignature("org.odk.collect.android.widgets.QuestionWidget.audioHelperFactory")
  public static void injectAudioHelperFactory(QuestionWidget instance,
      AudioHelperFactory audioHelperFactory) {
    instance.audioHelperFactory = audioHelperFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.widgets.QuestionWidget.screenUtils")
  public static void injectScreenUtils(QuestionWidget instance, ScreenUtils screenUtils) {
    instance.screenUtils = screenUtils;
  }

  @InjectedFieldSignature("org.odk.collect.android.widgets.QuestionWidget.softKeyboardController")
  public static void injectSoftKeyboardController(QuestionWidget instance,
      SoftKeyboardController softKeyboardController) {
    instance.softKeyboardController = softKeyboardController;
  }

  @InjectedFieldSignature("org.odk.collect.android.widgets.QuestionWidget.permissionsProvider")
  public static void injectPermissionsProvider(QuestionWidget instance,
      PermissionsProvider permissionsProvider) {
    instance.permissionsProvider = permissionsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.widgets.QuestionWidget.settingsProvider")
  public static void injectSettingsProvider(QuestionWidget instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.widgets.QuestionWidget.mediaUtils")
  public static void injectMediaUtils(QuestionWidget instance, MediaUtils mediaUtils) {
    instance.mediaUtils = mediaUtils;
  }

  @InjectedFieldSignature("org.odk.collect.android.widgets.QuestionWidget.imageLoader")
  public static void injectImageLoader(QuestionWidget instance, ImageLoader imageLoader) {
    instance.imageLoader = imageLoader;
  }
}
