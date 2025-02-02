package org.odk.collect.android.widgets.items;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.odk.collect.async.Scheduler;

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
public final class SelectOneFromMapDialogFragment_MembersInjector implements MembersInjector<SelectOneFromMapDialogFragment> {
  private final Provider<Scheduler> schedulerProvider;

  public SelectOneFromMapDialogFragment_MembersInjector(Provider<Scheduler> schedulerProvider) {
    this.schedulerProvider = schedulerProvider;
  }

  public static MembersInjector<SelectOneFromMapDialogFragment> create(
      Provider<Scheduler> schedulerProvider) {
    return new SelectOneFromMapDialogFragment_MembersInjector(schedulerProvider);
  }

  @Override
  public void injectMembers(SelectOneFromMapDialogFragment instance) {
    injectScheduler(instance, schedulerProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.widgets.items.SelectOneFromMapDialogFragment.scheduler")
  public static void injectScheduler(SelectOneFromMapDialogFragment instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }
}
