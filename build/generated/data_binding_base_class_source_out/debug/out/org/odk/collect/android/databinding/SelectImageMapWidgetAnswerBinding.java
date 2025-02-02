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
import org.odk.collect.android.views.CustomWebView;

public final class SelectImageMapWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CustomWebView imageMap;

  @NonNull
  public final MaterialTextView selectedElements;

  private SelectImageMapWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull CustomWebView imageMap, @NonNull MaterialTextView selectedElements) {
    this.rootView = rootView;
    this.imageMap = imageMap;
    this.selectedElements = selectedElements;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SelectImageMapWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SelectImageMapWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.select_image_map_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SelectImageMapWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_map;
      CustomWebView imageMap = ViewBindings.findChildViewById(rootView, id);
      if (imageMap == null) {
        break missingId;
      }

      id = R.id.selected_elements;
      MaterialTextView selectedElements = ViewBindings.findChildViewById(rootView, id);
      if (selectedElements == null) {
        break missingId;
      }

      return new SelectImageMapWidgetAnswerBinding((LinearLayout) rootView, imageMap,
          selectedElements);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
