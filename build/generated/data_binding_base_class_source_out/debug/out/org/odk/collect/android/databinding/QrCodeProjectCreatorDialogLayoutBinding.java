// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.views.DecoratedBarcodeView;
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeMaterialButton;

public final class QrCodeProjectCreatorDialogLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout addNewProjectAppbar;

  @NonNull
  public final DecoratedBarcodeView barcodeView;

  @NonNull
  public final MultiClickSafeMaterialButton cancelButton;

  @NonNull
  public final MultiClickSafeMaterialButton configureManuallyButton;

  @NonNull
  public final MaterialTextView or;

  @NonNull
  public final ImageView shadowUp;

  @NonNull
  public final MaterialTextView title;

  @NonNull
  public final MaterialToolbar toolbar;

  private QrCodeProjectCreatorDialogLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout addNewProjectAppbar, @NonNull DecoratedBarcodeView barcodeView,
      @NonNull MultiClickSafeMaterialButton cancelButton,
      @NonNull MultiClickSafeMaterialButton configureManuallyButton, @NonNull MaterialTextView or,
      @NonNull ImageView shadowUp, @NonNull MaterialTextView title,
      @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.addNewProjectAppbar = addNewProjectAppbar;
    this.barcodeView = barcodeView;
    this.cancelButton = cancelButton;
    this.configureManuallyButton = configureManuallyButton;
    this.or = or;
    this.shadowUp = shadowUp;
    this.title = title;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static QrCodeProjectCreatorDialogLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static QrCodeProjectCreatorDialogLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.qr_code_project_creator_dialog_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static QrCodeProjectCreatorDialogLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_new_project_appbar;
      AppBarLayout addNewProjectAppbar = ViewBindings.findChildViewById(rootView, id);
      if (addNewProjectAppbar == null) {
        break missingId;
      }

      id = R.id.barcode_view;
      DecoratedBarcodeView barcodeView = ViewBindings.findChildViewById(rootView, id);
      if (barcodeView == null) {
        break missingId;
      }

      id = R.id.cancel_button;
      MultiClickSafeMaterialButton cancelButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelButton == null) {
        break missingId;
      }

      id = R.id.configure_manually_button;
      MultiClickSafeMaterialButton configureManuallyButton = ViewBindings.findChildViewById(rootView, id);
      if (configureManuallyButton == null) {
        break missingId;
      }

      id = R.id.or;
      MaterialTextView or = ViewBindings.findChildViewById(rootView, id);
      if (or == null) {
        break missingId;
      }

      id = R.id.shadow_up;
      ImageView shadowUp = ViewBindings.findChildViewById(rootView, id);
      if (shadowUp == null) {
        break missingId;
      }

      id = R.id.title;
      MaterialTextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new QrCodeProjectCreatorDialogLayoutBinding((ConstraintLayout) rootView,
          addNewProjectAppbar, barcodeView, cancelButton, configureManuallyButton, or, shadowUp,
          title, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
