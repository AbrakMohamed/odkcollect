// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class FormMapActivityBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final FragmentContainerView selectionMap;

  private FormMapActivityBinding(@NonNull View rootView,
      @NonNull FragmentContainerView selectionMap) {
    this.rootView = rootView;
    this.selectionMap = selectionMap;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static FormMapActivityBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.form_map_activity, parent);
    return bind(parent);
  }

  @NonNull
  public static FormMapActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.selection_map;
      FragmentContainerView selectionMap = ViewBindings.findChildViewById(rootView, id);
      if (selectionMap == null) {
        break missingId;
      }

      return new FormMapActivityBinding(rootView, selectionMap);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
