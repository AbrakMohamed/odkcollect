// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.projects.ProjectIconView;

public final class ProjectListItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProjectIconView projectIcon;

  @NonNull
  public final TextView projectName;

  @NonNull
  public final TextView projectSubtext;

  private ProjectListItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ProjectIconView projectIcon, @NonNull TextView projectName,
      @NonNull TextView projectSubtext) {
    this.rootView = rootView;
    this.projectIcon = projectIcon;
    this.projectName = projectName;
    this.projectSubtext = projectSubtext;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProjectListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProjectListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.project_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProjectListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.project_icon;
      ProjectIconView projectIcon = ViewBindings.findChildViewById(rootView, id);
      if (projectIcon == null) {
        break missingId;
      }

      id = R.id.project_name;
      TextView projectName = ViewBindings.findChildViewById(rootView, id);
      if (projectName == null) {
        break missingId;
      }

      id = R.id.project_subtext;
      TextView projectSubtext = ViewBindings.findChildViewById(rootView, id);
      if (projectSubtext == null) {
        break missingId;
      }

      return new ProjectListItemBinding((ConstraintLayout) rootView, projectIcon, projectName,
          projectSubtext);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
