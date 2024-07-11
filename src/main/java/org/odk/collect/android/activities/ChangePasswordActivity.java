package org.odk.collect.android.activities;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import org.odk.collect.android.R;
import org.odk.collect.android.database.DatabaseHelper;

public class ChangePasswordActivity extends AppCompatActivity {

    private EditText currentPasswordEditText;
    private EditText newPasswordEditText;
    private EditText confirmPasswordEditText;
    private Button changePasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        currentPasswordEditText = findViewById(R.id.currentPasswordEditText);
        newPasswordEditText = findViewById(R.id.newPasswordEditText);
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
        changePasswordButton = findViewById(R.id.changePasswordButton);

        ImageButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ChangePasswordActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

        changePasswordButton.setOnClickListener(v -> {
            String currentPassword = currentPasswordEditText.getText().toString();
            String newPassword = newPasswordEditText.getText().toString();
            String confirmPassword = confirmPasswordEditText.getText().toString();

            if (validateInputs(currentPassword, newPassword, confirmPassword)) {
                new ChangePasswordTask().execute(currentPassword, newPassword);
            }
        });
    }

    private boolean validateInputs(String currentPassword, String newPassword, String confirmPassword) {
        if (TextUtils.isEmpty(currentPassword) || TextUtils.isEmpty(newPassword) || TextUtils.isEmpty(confirmPassword)) {
            Toast.makeText(this, "Tous les champs sont obligatoires", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!newPassword.equals(confirmPassword)) {
            Toast.makeText(this, "Les nouveaux mots de passe ne correspondent pas", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    private class ChangePasswordTask extends AsyncTask<String, Void, Boolean> {

        @Override
        protected Boolean doInBackground(String... params) {
            String currentPassword = params[0];
            String newPassword = params[1];

            SharedPreferences sharedPreferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
            String username = sharedPreferences.getString("username", null);

            if (username != null) {
                DatabaseHelper dbHelper = new DatabaseHelper(ChangePasswordActivity.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                Cursor cursor = db.query("users", null, "username=? AND password=?", new String[]{username, currentPassword}, null, null, null);
                if (cursor.getCount() > 0) {
                    ContentValues values = new ContentValues();
                    values.put("password", newPassword);
                    int rowsAffected = db.update("users", values, "username=?", new String[]{username});
                    cursor.close();
                    db.close();
                    return rowsAffected > 0;
                } else {
                    cursor.close();
                    db.close();
                    return false;
                }
            }
            return false;
        }

        @Override
        protected void onPostExecute(Boolean success) {
            if (success) {
                Toast.makeText(ChangePasswordActivity.this, "Mot de passe changé avec succès", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ChangePasswordActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(ChangePasswordActivity.this, "Erreur lors du changement de mot de passe", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
