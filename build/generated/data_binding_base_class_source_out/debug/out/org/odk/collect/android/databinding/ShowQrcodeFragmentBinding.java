// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class ShowQrcodeFragmentBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ProgressBar circularProgressBar;

  @NonNull
  public final ImageView ivQRcode;

  @NonNull
  public final LinearLayout status;

  @NonNull
  public final TextView tvPasswordWarning;

  private ShowQrcodeFragmentBinding(@NonNull RelativeLayout rootView,
      @NonNull ProgressBar circularProgressBar, @NonNull ImageView ivQRcode,
      @NonNull LinearLayout status, @NonNull TextView tvPasswordWarning) {
    this.rootView = rootView;
    this.circularProgressBar = circularProgressBar;
    this.ivQRcode = ivQRcode;
    this.status = status;
    this.tvPasswordWarning = tvPasswordWarning;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ShowQrcodeFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ShowQrcodeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.show_qrcode_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ShowQrcodeFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.circularProgressBar;
      ProgressBar circularProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (circularProgressBar == null) {
        break missingId;
      }

      id = R.id.ivQRcode;
      ImageView ivQRcode = ViewBindings.findChildViewById(rootView, id);
      if (ivQRcode == null) {
        break missingId;
      }

      id = R.id.status;
      LinearLayout status = ViewBindings.findChildViewById(rootView, id);
      if (status == null) {
        break missingId;
      }

      id = R.id.tvPasswordWarning;
      TextView tvPasswordWarning = ViewBindings.findChildViewById(rootView, id);
      if (tvPasswordWarning == null) {
        break missingId;
      }

      return new ShowQrcodeFragmentBinding((RelativeLayout) rootView, circularProgressBar, ivQRcode,
          status, tvPasswordWarning);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
