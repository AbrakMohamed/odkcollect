package org.odk.collect.android.activities;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import org.odk.collect.android.R;
import org.odk.collect.android.database.DatabaseHelper;

public class CreateUserActivity extends AppCompatActivity {
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
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("username", "abrak");
            values.put("password", "password");

            long result = db.insert("users", null, values);
            db.close();
            return result != -1;
        }

        @Override
        protected void onPostExecute(Boolean success) {
            if (success) {
                Intent intent = new Intent(CreateUserActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            } else {
                // Affichez un message d'erreur ou gérez l'échec
            }
        }
    }
}
