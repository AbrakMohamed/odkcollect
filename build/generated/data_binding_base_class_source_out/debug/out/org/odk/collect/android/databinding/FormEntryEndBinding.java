// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeMaterialButton;

public final class FormEntryEndBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final LinearLayout buttonsContainer;

  @NonNull
  public final TextView description;

  @NonNull
  public final MultiClickSafeMaterialButton finalize;

  @NonNull
  public final MaterialCardView formEditsWarning;

  @NonNull
  public final MaterialTextView formEditsWarningMessage;

  @NonNull
  public final MaterialTextView formEditsWarningTitle;

  @NonNull
  public final ImageView instanceNameInfoIcon;

  @NonNull
  public final MultiClickSafeMaterialButton saveAsDraft;

  @NonNull
  public final NestedScrollView scrollView;

  private FormEntryEndBinding(@NonNull NestedScrollView rootView,
      @NonNull LinearLayout buttonsContainer, @NonNull TextView description,
      @NonNull MultiClickSafeMaterialButton finalize, @NonNull MaterialCardView formEditsWarning,
      @NonNull MaterialTextView formEditsWarningMessage,
      @NonNull MaterialTextView formEditsWarningTitle, @NonNull ImageView instanceNameInfoIcon,
      @NonNull MultiClickSafeMaterialButton saveAsDraft, @NonNull NestedScrollView scrollView) {
    this.rootView = rootView;
    this.buttonsContainer = buttonsContainer;
    this.description = description;
    this.finalize = finalize;
    this.formEditsWarning = formEditsWarning;
    this.formEditsWarningMessage = formEditsWarningMessage;
    this.formEditsWarningTitle = formEditsWarningTitle;
    this.instanceNameInfoIcon = instanceNameInfoIcon;
    this.saveAsDraft = saveAsDraft;
    this.scrollView = scrollView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FormEntryEndBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FormEntryEndBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.form_entry_end, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FormEntryEndBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttons_container;
      LinearLayout buttonsContainer = ViewBindings.findChildViewById(rootView, id);
      if (buttonsContainer == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.finalize;
      MultiClickSafeMaterialButton finalize = ViewBindings.findChildViewById(rootView, id);
      if (finalize == null) {
        break missingId;
      }

      id = R.id.form_edits_warning;
      MaterialCardView formEditsWarning = ViewBindings.findChildViewById(rootView, id);
      if (formEditsWarning == null) {
        break missingId;
      }

      id = R.id.form_edits_warning_message;
      MaterialTextView formEditsWarningMessage = ViewBindings.findChildViewById(rootView, id);
      if (formEditsWarningMessage == null) {
        break missingId;
      }

      id = R.id.form_edits_warning_title;
      MaterialTextView formEditsWarningTitle = ViewBindings.findChildViewById(rootView, id);
      if (formEditsWarningTitle == null) {
        break missingId;
      }

      id = R.id.instance_name_info_icon;
      ImageView instanceNameInfoIcon = ViewBindings.findChildViewById(rootView, id);
      if (instanceNameInfoIcon == null) {
        break missingId;
      }

      id = R.id.save_as_draft;
      MultiClickSafeMaterialButton saveAsDraft = ViewBindings.findChildViewById(rootView, id);
      if (saveAsDraft == null) {
        break missingId;
      }

      NestedScrollView scrollView = (NestedScrollView) rootView;

      return new FormEntryEndBinding((NestedScrollView) rootView, buttonsContainer, description,
          finalize, formEditsWarning, formEditsWarningMessage, formEditsWarningTitle,
          instanceNameInfoIcon, saveAsDraft, scrollView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
