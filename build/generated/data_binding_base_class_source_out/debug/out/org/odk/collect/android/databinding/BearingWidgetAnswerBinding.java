// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.views.WidgetAnswerText;
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeMaterialButton;

public final class BearingWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MultiClickSafeMaterialButton bearingButton;

  @NonNull
  public final WidgetAnswerText widgetAnswerText;

  private BearingWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull MultiClickSafeMaterialButton bearingButton,
      @NonNull WidgetAnswerText widgetAnswerText) {
    this.rootView = rootView;
    this.bearingButton = bearingButton;
    this.widgetAnswerText = widgetAnswerText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BearingWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BearingWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bearing_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BearingWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bearing_button;
      MultiClickSafeMaterialButton bearingButton = ViewBindings.findChildViewById(rootView, id);
      if (bearingButton == null) {
        break missingId;
      }

      id = R.id.widget_answer_text;
      WidgetAnswerText widgetAnswerText = ViewBindings.findChildViewById(rootView, id);
      if (widgetAnswerText == null) {
        break missingId;
      }

      return new BearingWidgetAnswerBinding((LinearLayout) rootView, bearingButton,
          widgetAnswerText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
