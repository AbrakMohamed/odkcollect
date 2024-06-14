// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.views.TrackingTouchSlider;

public final class RangeWidgetVerticalBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView currentValue;

  @NonNull
  public final TextView maxValue;

  @NonNull
  public final TextView minValue;

  @NonNull
  public final TrackingTouchSlider slider;

  private RangeWidgetVerticalBinding(@NonNull LinearLayout rootView, @NonNull TextView currentValue,
      @NonNull TextView maxValue, @NonNull TextView minValue, @NonNull TrackingTouchSlider slider) {
    this.rootView = rootView;
    this.currentValue = currentValue;
    this.maxValue = maxValue;
    this.minValue = minValue;
    this.slider = slider;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RangeWidgetVerticalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RangeWidgetVerticalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.range_widget_vertical, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RangeWidgetVerticalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.current_value;
      TextView currentValue = ViewBindings.findChildViewById(rootView, id);
      if (currentValue == null) {
        break missingId;
      }

      id = R.id.max_value;
      TextView maxValue = ViewBindings.findChildViewById(rootView, id);
      if (maxValue == null) {
        break missingId;
      }

      id = R.id.min_value;
      TextView minValue = ViewBindings.findChildViewById(rootView, id);
      if (minValue == null) {
        break missingId;
      }

      id = R.id.slider;
      TrackingTouchSlider slider = ViewBindings.findChildViewById(rootView, id);
      if (slider == null) {
        break missingId;
      }

      return new RangeWidgetVerticalBinding((LinearLayout) rootView, currentValue, maxValue,
          minValue, slider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
