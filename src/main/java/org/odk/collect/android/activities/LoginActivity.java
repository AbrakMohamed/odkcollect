package org.odk.collect.android.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.odk.collect.android.R;
import org.odk.collect.android.database.DatabaseHelper;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private CheckBox rememberMeCheckBox;
    private ImageView passwordToggle;
    private boolean isPasswordVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);
        rememberMeCheckBox = findViewById(R.id.rememberMe);
        passwordToggle = findViewById(R.id.password_toggle);

        // Charger les informations de l'utilisateur si "Se souvenir de moi" est coché
        SharedPreferences sharedPreferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        if (sharedPreferences.getBoolean("remember_me", false)) {
            usernameEditText.setText(sharedPreferences.getString("username", ""));
            passwordEditText.setText(sharedPreferences.getString("password", ""));
            rememberMeCheckBox.setChecked(true);
        }

        passwordToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPasswordVisible) {
                    // Masquer le mot de passe
                    passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    passwordToggle.setImageResource(R.drawable.ic_eye); // Assurez-vous d'avoir cette icône
                } else {
                    // Afficher le mot de passe
                    passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT);
                    passwordToggle.setImageResource(R.drawable.ic_eye_off); // Assurez-vous d'avoir cette icône
                }
                isPasswordVisible = !isPasswordVisible;
                passwordEditText.setSelection(passwordEditText.getText().length());
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                if (authenticateUser(username, password)) {
                    // Connexion réussie
                    // Stocker les informations de l'utilisateur dans les préférences partagées
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", username);
                    editor.putString("email", getEmailForUser(username)); // Récupérez l'email depuis la base de données

                    if (rememberMeCheckBox.isChecked()) {
                        editor.putBoolean("remember_me", true);
                        editor.putString("password", password);
                    } else {
                        editor.putBoolean("remember_me", false);
                        editor.remove("password");
                    }

                    editor.apply();

                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Connexion échouée
                    Toast.makeText(LoginActivity.this, "Nom d'utilisateur ou mot de passe incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean authenticateUser(String username, String password) {
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] projection = {
                "id",
                "username",
                "password",
        };

        String selection = "username = ? AND password = ?";
        String[] selectionArgs = { username, password };

        Cursor cursor = db.query(
                "users",   // La table à interroger
                projection,             // Les colonnes à retourner
                selection,              // Les colonnes pour la clause WHERE
                selectionArgs,          // Les valeurs pour la clause WHERE
                null,                   // Ne pas regrouper les lignes
                null,                   // Ne pas filtrer par les groupes de lignes
                null                    // L'ordre de tri
        );

        boolean authenticated = cursor.getCount() > 0;
        cursor.close();
        db.close();
        return authenticated;
    }

    private String getEmailForUser(String username) {
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] projection = { "email" };
        String selection = "username = ?";
        String[] selectionArgs = { username };

        Cursor cursor = db.query("users", projection, selection, selectionArgs, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            String email = cursor.getString(cursor.getColumnIndexOrThrow("email"));
            cursor.close();
            db.close();
            return email;
        }

        if (cursor != null) {
            cursor.close();
        }
        db.close();
        return null;
    }
}
