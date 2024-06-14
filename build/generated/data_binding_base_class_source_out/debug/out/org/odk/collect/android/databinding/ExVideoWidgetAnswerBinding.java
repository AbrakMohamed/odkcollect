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
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeMaterialButton;

public final class ExVideoWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MultiClickSafeMaterialButton captureVideoButton;

  @NonNull
  public final MultiClickSafeMaterialButton playVideoButton;

  private ExVideoWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull MultiClickSafeMaterialButton captureVideoButton,
      @NonNull MultiClickSafeMaterialButton playVideoButton) {
    this.rootView = rootView;
    this.captureVideoButton = captureVideoButton;
    this.playVideoButton = playVideoButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExVideoWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExVideoWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ex_video_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExVideoWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.capture_video_button;
      MultiClickSafeMaterialButton captureVideoButton = ViewBindings.findChildViewById(rootView, id);
      if (captureVideoButton == null) {
        break missingId;
      }

      id = R.id.play_video_button;
      MultiClickSafeMaterialButton playVideoButton = ViewBindings.findChildViewById(rootView, id);
      if (playVideoButton == null) {
        break missingId;
      }

      return new ExVideoWidgetAnswerBinding((LinearLayout) rootView, captureVideoButton,
          playVideoButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
