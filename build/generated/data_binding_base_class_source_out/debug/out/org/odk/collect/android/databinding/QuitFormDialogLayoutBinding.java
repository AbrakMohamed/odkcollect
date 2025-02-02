// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeMaterialButton;

public final class QuitFormDialogLayoutBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final MultiClickSafeMaterialButton discardChanges;

  @NonNull
  public final MultiClickSafeMaterialButton keepEditingFilled;

  @NonNull
  public final MultiClickSafeMaterialButton keepEditingOutlined;

  @NonNull
  public final MultiClickSafeMaterialButton saveChanges;

  @NonNull
  public final MaterialTextView saveExplanation;

  private QuitFormDialogLayoutBinding(@NonNull NestedScrollView rootView,
      @NonNull MultiClickSafeMaterialButton discardChanges,
      @NonNull MultiClickSafeMaterialButton keepEditingFilled,
      @NonNull MultiClickSafeMaterialButton keepEditingOutlined,
      @NonNull MultiClickSafeMaterialButton saveChanges,
      @NonNull MaterialTextView saveExplanation) {
    this.rootView = rootView;
    this.discardChanges = discardChanges;
    this.keepEditingFilled = keepEditingFilled;
    this.keepEditingOutlined = keepEditingOutlined;
    this.saveChanges = saveChanges;
    this.saveExplanation = saveExplanation;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static QuitFormDialogLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static QuitFormDialogLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.quit_form_dialog_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static QuitFormDialogLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.discard_changes;
      MultiClickSafeMaterialButton discardChanges = ViewBindings.findChildViewById(rootView, id);
      if (discardChanges == null) {
        break missingId;
      }

      id = R.id.keep_editing_filled;
      MultiClickSafeMaterialButton keepEditingFilled = ViewBindings.findChildViewById(rootView, id);
      if (keepEditingFilled == null) {
        break missingId;
      }

      id = R.id.keep_editing_outlined;
      MultiClickSafeMaterialButton keepEditingOutlined = ViewBindings.findChildViewById(rootView, id);
      if (keepEditingOutlined == null) {
        break missingId;
      }

      id = R.id.save_changes;
      MultiClickSafeMaterialButton saveChanges = ViewBindings.findChildViewById(rootView, id);
      if (saveChanges == null) {
        break missingId;
      }

      id = R.id.save_explanation;
      MaterialTextView saveExplanation = ViewBindings.findChildViewById(rootView, id);
      if (saveExplanation == null) {
        break missingId;
      }

      return new QuitFormDialogLayoutBinding((NestedScrollView) rootView, discardChanges,
          keepEditingFilled, keepEditingOutlined, saveChanges, saveExplanation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
