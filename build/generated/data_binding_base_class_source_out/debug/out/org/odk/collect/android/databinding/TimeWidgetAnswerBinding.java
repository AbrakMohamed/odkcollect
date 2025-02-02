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
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeMaterialButton;

public final class TimeWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView timeAnswerText;

  @NonNull
  public final MultiClickSafeMaterialButton timeButton;

  private TimeWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView timeAnswerText, @NonNull MultiClickSafeMaterialButton timeButton) {
    this.rootView = rootView;
    this.timeAnswerText = timeAnswerText;
    this.timeButton = timeButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TimeWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TimeWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.time_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TimeWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.time_answer_text;
      MaterialTextView timeAnswerText = ViewBindings.findChildViewById(rootView, id);
      if (timeAnswerText == null) {
        break missingId;
      }

      id = R.id.time_button;
      MultiClickSafeMaterialButton timeButton = ViewBindings.findChildViewById(rootView, id);
      if (timeButton == null) {
        break missingId;
      }

      return new TimeWidgetAnswerBinding((LinearLayout) rootView, timeAnswerText, timeButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
