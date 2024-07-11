package org.odk.collect.android.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.odk.collect.android.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void setupToolbar() {
        // Configurer le Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Configurer le menu popup pour l'icône de profil
        ImageView profileIcon = findViewById(R.id.profile_icon);
        profileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProfileMenu(view);
            }
        });
    }

    private void showProfileMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.profile_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();

                if (itemId == R.id.view_profile) {
                    // Logique pour afficher le profil
                    Intent profileIntent = new Intent(BaseActivity.this, ProfileActivity.class);
                    startActivity(profileIntent);
                    return true;
                } else if (itemId == R.id.change_password) {
                    // Logique pour changer le mot de passe
                    Intent changePasswordIntent = new Intent(BaseActivity.this, ChangePasswordActivity.class);
                    startActivity(changePasswordIntent);
                    return true;
                } else if (itemId == R.id.logout) {
                    // Logique pour déconnexion
                    logout();
                    return true;
                } else if (itemId == R.id.saved_projects) {
                    // Logique pour redirection vers SavedProjectsActivity
                    Intent savedProjectsIntent = new Intent(BaseActivity.this, SavedProjectsActivity.class);
                    startActivity(savedProjectsIntent);
                    return true;
                } else {
                    return false;
                }
            }

            private void logout() {
                // Logique pour la déconnexion, par exemple, effacer les préférences partagées, retourner à l'écran de connexion, etc.
                Intent intent = new Intent(BaseActivity.this, LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        popupMenu.show();
    }
}
