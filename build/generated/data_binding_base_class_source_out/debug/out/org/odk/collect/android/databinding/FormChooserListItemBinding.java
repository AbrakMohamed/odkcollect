// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.material.ErrorsPill;

public final class FormChooserListItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ErrorsPill chip;

  @NonNull
  public final FrameLayout imageView;

  @NonNull
  public final FrameLayout mapView;

  @NonNull
  public final FrameLayout textView;

  private FormChooserListItemBinding(@NonNull RelativeLayout rootView, @NonNull ErrorsPill chip,
      @NonNull FrameLayout imageView, @NonNull FrameLayout mapView, @NonNull FrameLayout textView) {
    this.rootView = rootView;
    this.chip = chip;
    this.imageView = imageView;
    this.mapView = mapView;
    this.textView = textView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FormChooserListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FormChooserListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.form_chooser_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FormChooserListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chip;
      ErrorsPill chip = ViewBindings.findChildViewById(rootView, id);
      if (chip == null) {
        break missingId;
      }

      id = R.id.imageView;
      FrameLayout imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.map_view;
      FrameLayout mapView = ViewBindings.findChildViewById(rootView, id);
      if (mapView == null) {
        break missingId;
      }

      id = R.id.text_view;
      FrameLayout textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new FormChooserListItemBinding((RelativeLayout) rootView, chip, imageView, mapView,
          textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
