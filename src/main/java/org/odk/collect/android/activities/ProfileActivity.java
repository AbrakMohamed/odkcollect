package org.odk.collect.android.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import org.odk.collect.android.R;

public class ProfileActivity extends BaseActivity {

    private ImageView profileImageView;
    private TextView usernameTextView;
    private TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        setupToolbar();

        profileImageView = findViewById(R.id.profileImageView);
        usernameTextView = findViewById(R.id.usernameTextView);
        emailTextView = findViewById(R.id.emailTextView);

        // Charger les informations du profil
        loadUserProfile();
    }

    private void loadUserProfile() {
        // Récupération des données à partir des préférences partagées
        SharedPreferences sharedPreferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        String username = sharedPreferences.getString("username", "Nom d'utilisateur");
        String email = sharedPreferences.getString("email", "testuser@example.com");
        String profileImageUri = sharedPreferences.getString("profileImageUri", null);

        // Mettre à jour les TextViews avec les informations récupérées
        usernameTextView.setText(username);
        emailTextView.setText(email);

        // Charger l'image de profil si elle est disponible
        if (profileImageUri != null) {
            // Utiliser une bibliothèque comme Picasso ou Glide pour charger l'image
            // Exemple avec Glide:
            Glide.with(this)
                    .load(profileImageUri)
                    .placeholder(R.drawable.ic_profile_placeholder) // Placeholder image
                    .into(profileImageView);
        }
    }
}
