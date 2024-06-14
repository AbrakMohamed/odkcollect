// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class ServerAuthDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText passwordEdit;

  @NonNull
  public final EditText usernameEdit;

  private ServerAuthDialogBinding(@NonNull LinearLayout rootView, @NonNull EditText passwordEdit,
      @NonNull EditText usernameEdit) {
    this.rootView = rootView;
    this.passwordEdit = passwordEdit;
    this.usernameEdit = usernameEdit;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ServerAuthDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ServerAuthDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.server_auth_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ServerAuthDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.password_edit;
      EditText passwordEdit = ViewBindings.findChildViewById(rootView, id);
      if (passwordEdit == null) {
        break missingId;
      }

      id = R.id.username_edit;
      EditText usernameEdit = ViewBindings.findChildViewById(rootView, id);
      if (usernameEdit == null) {
        break missingId;
      }

      return new ServerAuthDialogBinding((LinearLayout) rootView, passwordEdit, usernameEdit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
