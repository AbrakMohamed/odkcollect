// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.odk.collect.android.R;
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeMaterialButton;

public final class MapButtonBinding implements ViewBinding {
  @NonNull
  private final MultiClickSafeMaterialButton rootView;

  @NonNull
  public final MultiClickSafeMaterialButton mapButton;

  private MapButtonBinding(@NonNull MultiClickSafeMaterialButton rootView,
      @NonNull MultiClickSafeMaterialButton mapButton) {
    this.rootView = rootView;
    this.mapButton = mapButton;
  }

  @Override
  @NonNull
  public MultiClickSafeMaterialButton getRoot() {
    return rootView;
  }

  @NonNull
  public static MapButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MapButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.map_button, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MapButtonBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    MultiClickSafeMaterialButton mapButton = (MultiClickSafeMaterialButton) rootView;

    return new MapButtonBinding((MultiClickSafeMaterialButton) rootView, mapButton);
  }
}
