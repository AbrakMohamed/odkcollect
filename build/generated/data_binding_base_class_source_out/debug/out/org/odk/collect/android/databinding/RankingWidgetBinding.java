// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.androidshared.ui.multiclicksafe.MultiClickSafeMaterialButton;

public final class RankingWidgetBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialTextView answer;

  @NonNull
  public final MultiClickSafeMaterialButton rankItemsButton;

  private RankingWidgetBinding(@NonNull ConstraintLayout rootView, @NonNull MaterialTextView answer,
      @NonNull MultiClickSafeMaterialButton rankItemsButton) {
    this.rootView = rootView;
    this.answer = answer;
    this.rankItemsButton = rankItemsButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RankingWidgetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RankingWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ranking_widget, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RankingWidgetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.answer;
      MaterialTextView answer = ViewBindings.findChildViewById(rootView, id);
      if (answer == null) {
        break missingId;
      }

      id = R.id.rank_items_button;
      MultiClickSafeMaterialButton rankItemsButton = ViewBindings.findChildViewById(rootView, id);
      if (rankItemsButton == null) {
        break missingId;
      }

      return new RankingWidgetBinding((ConstraintLayout) rootView, answer, rankItemsButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
