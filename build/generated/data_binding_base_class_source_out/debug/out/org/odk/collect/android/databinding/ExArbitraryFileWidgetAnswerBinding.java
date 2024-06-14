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

public final class ExArbitraryFileWidgetAnswerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialTextView exArbitraryFileAnswerText;

  @NonNull
  public final MultiClickSafeMaterialButton exArbitraryFileButton;

  private ExArbitraryFileWidgetAnswerBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialTextView exArbitraryFileAnswerText,
      @NonNull MultiClickSafeMaterialButton exArbitraryFileButton) {
    this.rootView = rootView;
    this.exArbitraryFileAnswerText = exArbitraryFileAnswerText;
    this.exArbitraryFileButton = exArbitraryFileButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExArbitraryFileWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExArbitraryFileWidgetAnswerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ex_arbitrary_file_widget_answer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExArbitraryFileWidgetAnswerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ex_arbitrary_file_answer_text;
      MaterialTextView exArbitraryFileAnswerText = ViewBindings.findChildViewById(rootView, id);
      if (exArbitraryFileAnswerText == null) {
        break missingId;
      }

      id = R.id.ex_arbitrary_file_button;
      MultiClickSafeMaterialButton exArbitraryFileButton = ViewBindings.findChildViewById(rootView, id);
      if (exArbitraryFileButton == null) {
        break missingId;
      }

      return new ExArbitraryFileWidgetAnswerBinding((LinearLayout) rootView,
          exArbitraryFileAnswerText, exArbitraryFileButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
