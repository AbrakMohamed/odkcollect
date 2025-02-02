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
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class ActivityProjectDetailsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout container;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final ImageView profileIcon;

  @NonNull
  public final TextView projectName;

  @NonNull
  public final Toolbar toolbar;

  private ActivityProjectDetailsBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout container, @NonNull ImageView logo, @NonNull ImageView profileIcon,
      @NonNull TextView projectName, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.container = container;
    this.logo = logo;
    this.profileIcon = profileIcon;
    this.projectName = projectName;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProjectDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProjectDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_project_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProjectDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container;
      LinearLayout container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

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

      id = R.id.project_name;
      TextView projectName = ViewBindings.findChildViewById(rootView, id);
      if (projectName == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityProjectDetailsBinding((LinearLayout) rootView, container, logo,
          profileIcon, projectName, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
