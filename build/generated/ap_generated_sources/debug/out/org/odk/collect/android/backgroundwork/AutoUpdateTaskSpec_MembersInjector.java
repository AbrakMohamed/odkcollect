package org.odk.collect.android.backgroundwork;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.FormsDataService;

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
public final class AutoUpdateTaskSpec_MembersInjector implements MembersInjector<AutoUpdateTaskSpec> {
  private final Provider<FormsDataService> formsDataServiceProvider;

  public AutoUpdateTaskSpec_MembersInjector(Provider<FormsDataService> formsDataServiceProvider) {
    this.formsDataServiceProvider = formsDataServiceProvider;
  }

  public static MembersInjector<AutoUpdateTaskSpec> create(
      Provider<FormsDataService> formsDataServiceProvider) {
    return new AutoUpdateTaskSpec_MembersInjector(formsDataServiceProvider);
  }

  @Override
  public void injectMembers(AutoUpdateTaskSpec instance) {
    injectFormsDataService(instance, formsDataServiceProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.backgroundwork.AutoUpdateTaskSpec.formsDataService")
  public static void injectFormsDataService(AutoUpdateTaskSpec instance,
      FormsDataService formsDataService) {
    instance.formsDataService = formsDataService;
  }
}
