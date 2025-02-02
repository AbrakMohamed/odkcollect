// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.mainmenu.MainMenuButton;
import org.odk.collect.android.mainmenu.StartNewFormButton;
import org.odk.collect.androidshared.databinding.AppBarLayoutBinding;

public final class MainMenuBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayoutBinding appBarLayout;

  @NonNull
  public final TextView appName;

  @NonNull
  public final StartNewFormButton enterData;

  @NonNull
  public final MainMenuButton getForms;

  @NonNull
  public final GoogleDriveDeprecationBannerBinding googleDriveDeprecationBanner;

  @NonNull
  public final MainMenuButton manageForms;

  @NonNull
  public final FragmentContainerView mapBoxInitializationFragment;

  @NonNull
  public final MainMenuButton reviewData;

  @NonNull
  public final MainMenuButton sendData;

  @NonNull
  public final TextView versionSha;

  @NonNull
  public final MainMenuButton viewSentForms;

  private MainMenuBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayoutBinding appBarLayout, @NonNull TextView appName,
      @NonNull StartNewFormButton enterData, @NonNull MainMenuButton getForms,
      @NonNull GoogleDriveDeprecationBannerBinding googleDriveDeprecationBanner,
      @NonNull MainMenuButton manageForms,
      @NonNull FragmentContainerView mapBoxInitializationFragment,
      @NonNull MainMenuButton reviewData, @NonNull MainMenuButton sendData,
      @NonNull TextView versionSha, @NonNull MainMenuButton viewSentForms) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.appName = appName;
    this.enterData = enterData;
    this.getForms = getForms;
    this.googleDriveDeprecationBanner = googleDriveDeprecationBanner;
    this.manageForms = manageForms;
    this.mapBoxInitializationFragment = mapBoxInitializationFragment;
    this.reviewData = reviewData;
    this.sendData = sendData;
    this.versionSha = versionSha;
    this.viewSentForms = viewSentForms;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_bar_layout;
      View appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }
      AppBarLayoutBinding binding_appBarLayout = AppBarLayoutBinding.bind(appBarLayout);

      id = R.id.app_name;
      TextView appName = ViewBindings.findChildViewById(rootView, id);
      if (appName == null) {
        break missingId;
      }

      id = R.id.enter_data;
      StartNewFormButton enterData = ViewBindings.findChildViewById(rootView, id);
      if (enterData == null) {
        break missingId;
      }

      id = R.id.get_forms;
      MainMenuButton getForms = ViewBindings.findChildViewById(rootView, id);
      if (getForms == null) {
        break missingId;
      }

      id = R.id.google_drive_deprecation_banner;
      View googleDriveDeprecationBanner = ViewBindings.findChildViewById(rootView, id);
      if (googleDriveDeprecationBanner == null) {
        break missingId;
      }
      GoogleDriveDeprecationBannerBinding binding_googleDriveDeprecationBanner = GoogleDriveDeprecationBannerBinding.bind(googleDriveDeprecationBanner);

      id = R.id.manage_forms;
      MainMenuButton manageForms = ViewBindings.findChildViewById(rootView, id);
      if (manageForms == null) {
        break missingId;
      }

      id = R.id.map_box_initialization_fragment;
      FragmentContainerView mapBoxInitializationFragment = ViewBindings.findChildViewById(rootView, id);
      if (mapBoxInitializationFragment == null) {
        break missingId;
      }

      id = R.id.review_data;
      MainMenuButton reviewData = ViewBindings.findChildViewById(rootView, id);
      if (reviewData == null) {
        break missingId;
      }

      id = R.id.send_data;
      MainMenuButton sendData = ViewBindings.findChildViewById(rootView, id);
      if (sendData == null) {
        break missingId;
      }

      id = R.id.version_sha;
      TextView versionSha = ViewBindings.findChildViewById(rootView, id);
      if (versionSha == null) {
        break missingId;
      }

      id = R.id.view_sent_forms;
      MainMenuButton viewSentForms = ViewBindings.findChildViewById(rootView, id);
      if (viewSentForms == null) {
        break missingId;
      }

      return new MainMenuBinding((ConstraintLayout) rootView, binding_appBarLayout, appName,
          enterData, getForms, binding_googleDriveDeprecationBanner, manageForms,
          mapBoxInitializationFragment, reviewData, sendData, versionSha, viewSentForms);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
