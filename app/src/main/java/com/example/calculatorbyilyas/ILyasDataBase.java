package com.example.calculatorbyilyas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ILyasDataBase extends SQLiteOpenHelper {
    public ILyasDataBase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE User (Password TEXT PRIMARY KEY NOT NULL, Email TEXT NOT NULL);");

    }



    public boolean emailExists(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT Email FROM User WHERE Email = ?";

        Cursor cursor = db.rawQuery(query, new String[]{email});


        if (cursor != null && cursor.getCount() > 0) {
            cursor.close();
            return true;
        }


        if (cursor != null) {
            cursor.close();
        }

        return false;
    }

    public boolean PasswordExists(String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT Password FROM User WHERE Password = ?";

        Cursor cursor = db.rawQuery(query, new String[]{password});


        if (cursor != null && cursor.getCount() > 0) {
            cursor.close();
            return true;
        }


        if (cursor != null) {
            cursor.close();
        }

        return false;
    }

    public void InsererCompte(String password ,String Mail ){

            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("Password", password);
            values.put("Email", Mail);

            long newRowId = db.insertWithOnConflict("User", null, values, SQLiteDatabase.CONFLICT_REPLACE);

            if (newRowId != -1) {
                // Insertion ou mise à jour réussie
                Log.d("Database", "Utilisateur inséré ou mis à jour avec succès");
                System.out.println("1");
            } else {
                // Échec de l'insertion ou de la mise à jour
                Log.d("Database", "Échec de l'insertion ou de la mise à jour de l'utilisateur");
                System.out.println("0");
            }

            db.close();


    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
