// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final ImageView profileIcon;

  @NonNull
  public final Button startFormButton;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TextView textViewProjectDateValue;

  @NonNull
  public final TextView textViewProjectLocationValue;

  @NonNull
  public final TextView textViewProjectName;

  @NonNull
  public final TextView textViewProjectTimeValue;

  @NonNull
  public final TextView textViewProjectTypologyValue;

  @NonNull
  public final Toolbar toolbar;

  private ActivityDetailBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView logo,
      @NonNull ImageView profileIcon, @NonNull Button startFormButton,
      @NonNull TableLayout tableLayout, @NonNull TextView textViewProjectDateValue,
      @NonNull TextView textViewProjectLocationValue, @NonNull TextView textViewProjectName,
      @NonNull TextView textViewProjectTimeValue, @NonNull TextView textViewProjectTypologyValue,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.logo = logo;
    this.profileIcon = profileIcon;
    this.startFormButton = startFormButton;
    this.tableLayout = tableLayout;
    this.textViewProjectDateValue = textViewProjectDateValue;
    this.textViewProjectLocationValue = textViewProjectLocationValue;
    this.textViewProjectName = textViewProjectName;
    this.textViewProjectTimeValue = textViewProjectTimeValue;
    this.textViewProjectTypologyValue = textViewProjectTypologyValue;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.profile_icon;
      ImageView profileIcon = ViewBindings.findChildViewById(rootView, id);
      if (profileIcon == null) {
        break missingId;
      }

      id = R.id.start_form_button;
      Button startFormButton = ViewBindings.findChildViewById(rootView, id);
      if (startFormButton == null) {
        break missingId;
      }

      id = R.id.tableLayout;
      TableLayout tableLayout = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout == null) {
        break missingId;
      }

      id = R.id.textViewProjectDateValue;
      TextView textViewProjectDateValue = ViewBindings.findChildViewById(rootView, id);
      if (textViewProjectDateValue == null) {
        break missingId;
      }

      id = R.id.textViewProjectLocationValue;
      TextView textViewProjectLocationValue = ViewBindings.findChildViewById(rootView, id);
      if (textViewProjectLocationValue == null) {
        break missingId;
      }

      id = R.id.textViewProjectName;
      TextView textViewProjectName = ViewBindings.findChildViewById(rootView, id);
      if (textViewProjectName == null) {
        break missingId;
      }

      id = R.id.textViewProjectTimeValue;
      TextView textViewProjectTimeValue = ViewBindings.findChildViewById(rootView, id);
      if (textViewProjectTimeValue == null) {
        break missingId;
      }

      id = R.id.textViewProjectTypologyValue;
      TextView textViewProjectTypologyValue = ViewBindings.findChildViewById(rootView, id);
      if (textViewProjectTypologyValue == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityDetailBinding((ConstraintLayout) rootView, logo, profileIcon,
          startFormButton, tableLayout, textViewProjectDateValue, textViewProjectLocationValue,
          textViewProjectName, textViewProjectTimeValue, textViewProjectTypologyValue, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
