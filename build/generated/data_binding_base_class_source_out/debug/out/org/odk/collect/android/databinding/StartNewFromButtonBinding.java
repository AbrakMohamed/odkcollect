// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class StartNewFromButtonBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView icon;

  @NonNull
  public final TextView name;

  private StartNewFromButtonBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView icon,
      @NonNull TextView name) {
    this.rootView = rootView;
    this.icon = icon;
    this.name = name;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StartNewFromButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StartNewFromButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.start_new_from_button, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StartNewFromButtonBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.icon;
      ImageView icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      return new StartNewFromButtonBinding((ConstraintLayout) rootView, icon, name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
