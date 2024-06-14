package org.odk.collect.android.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.odk.collect.android.database.forms.FormDatabaseMigrator;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "odk.db";
    private static final int DATABASE_VERSION = 13;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        new FormDatabaseMigrator().onCreate(db);
        createUsersTable(db);  // Ajoutez cette ligne pour créer la table des utilisateurs
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        new FormDatabaseMigrator().onUpgrade(db, oldVersion);
        // Ajoutez la gestion de l'upgrade pour la table des utilisateurs si nécessaire
    }

    private void createUsersTable(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS users (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "username TEXT NOT NULL, " +
                "password TEXT NOT NULL);");
    }
}
