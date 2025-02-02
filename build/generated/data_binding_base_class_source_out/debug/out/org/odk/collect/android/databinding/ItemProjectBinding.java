// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class ItemProjectBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView textViewDate;

  @NonNull
  public final TextView textViewLocation;

  @NonNull
  public final TextView textViewName;

  private ItemProjectBinding(@NonNull CardView rootView, @NonNull TextView textViewDate,
      @NonNull TextView textViewLocation, @NonNull TextView textViewName) {
    this.rootView = rootView;
    this.textViewDate = textViewDate;
    this.textViewLocation = textViewLocation;
    this.textViewName = textViewName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemProjectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_project, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemProjectBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textViewDate;
      TextView textViewDate = ViewBindings.findChildViewById(rootView, id);
      if (textViewDate == null) {
        break missingId;
      }

      id = R.id.textViewLocation;
      TextView textViewLocation = ViewBindings.findChildViewById(rootView, id);
      if (textViewLocation == null) {
        break missingId;
      }

      id = R.id.textViewName;
      TextView textViewName = ViewBindings.findChildViewById(rootView, id);
      if (textViewName == null) {
        break missingId;
      }

      return new ItemProjectBinding((CardView) rootView, textViewDate, textViewLocation,
          textViewName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
