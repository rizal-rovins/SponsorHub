package com.mca.hack.sponsorhub;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by gandharv on 28/10/17.
 */

public class OrganizerDBHandler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="organizer.dp";
    private static final String DATABASE_VERSION="1";
    private static final String TABLE_NAME="organizer";

    private static final String COLUMN_ID="ID";
    private static final String COLUMN_ORGNAME="ORGANIZER NAME";
    private static final String COLUMN_EVENTTPYE="EVENT TYPE";
    private static final String COLUMN_USERNAME="USERNAME";
    private static final String COLUMN_PASSWORD="PASSWORD";


    public OrganizerDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query= "CREATE TABLE "+TABLE_NAME+" "
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
