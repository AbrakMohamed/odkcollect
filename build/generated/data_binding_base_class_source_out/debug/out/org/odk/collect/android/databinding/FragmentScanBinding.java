// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeMaterialButton;

public final class FragmentScanBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final DecoratedBarcodeView barcodeView;

  @NonNull
  public final MultiClickSafeMaterialButton switchFlashlight;

  private FragmentScanBinding(@NonNull RelativeLayout rootView,
      @NonNull DecoratedBarcodeView barcodeView,
      @NonNull MultiClickSafeMaterialButton switchFlashlight) {
    this.rootView = rootView;
    this.barcodeView = barcodeView;
    this.switchFlashlight = switchFlashlight;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentScanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentScanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_scan, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentScanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barcode_view;
      DecoratedBarcodeView barcodeView = ViewBindings.findChildViewById(rootView, id);
      if (barcodeView == null) {
        break missingId;
      }

      id = R.id.switch_flashlight;
      MultiClickSafeMaterialButton switchFlashlight = ViewBindings.findChildViewById(rootView, id);
      if (switchFlashlight == null) {
        break missingId;
      }

      return new FragmentScanBinding((RelativeLayout) rootView, barcodeView, switchFlashlight);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
