package org.odk.collect.android.activities;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.odk.collect.android.R;
import org.odk.collect.android.database.DatabaseHelper;

import timber.log.Timber;

public class CreateUserActivity extends AppCompatActivity {
    private static final String TAG = "CreateUserActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        new CreateUserTask().execute();
    }

    private class CreateUserTask extends AsyncTask<Void, Void, Boolean> {
        @Override
        protected Boolean doInBackground(Void... voids) {
            DatabaseHelper dbHelper = new DatabaseHelper(CreateUserActivity.this);
            SQLiteDatabase db = null;

            try {
                db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("username", "testuser");
                values.put("password", "password");
                values.put("email", "testuser@example.com"); // Ajouter l'email
                values.put("phone_number", "638295680");

                long result = db.insert("users", null, values);
                if (result != -1) {
                    // Stocker les informations de l'utilisateur dans les préférences partagées
                    SharedPreferences sharedPreferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", "testuser");
                    editor.putString("email", "testuser@example.com");
                    editor.apply();
                }
                return result != -1;
            } catch (Exception e) {
                Timber.tag(TAG).e(e, "Erreur lors de la création de l'utilisateur");
                return false;
            } finally {
                if (db != null) {
                    db.close();
                }
            }
        }

        @Override
        protected void onPostExecute(Boolean success) {
            if (success) {
                Intent intent = new Intent(CreateUserActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(CreateUserActivity.this, "Erreur lors de la création de l'utilisateur", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
