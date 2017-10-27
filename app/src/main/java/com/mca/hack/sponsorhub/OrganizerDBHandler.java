package com.mca.hack.sponsorhub;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by gandharv on 28/10/17.
 */

public class OrganizerDBHandler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="organizer.dp";
    private static final int DATABASE_VERSION=1;
    public  final String TABLE_NAME="organizer";

    public static final String COLUMN_ID="ID";
    public static final String COLUMN_ORGNAME="ORGANIZER NAME";
    public static final String COLUMN_EVENTTPYE="EVENT TYPE";
    public static final String COLUMN_USERNAME="USERNAME";
    public static final String COLUMN_PASSWORD="PASSWORD";


    public OrganizerDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table " + TABLE_NAME +" ( " +
                COLUMN_ID + " integer primary key autoincrement, " +
                COLUMN_ORGNAME +" text, " +
                COLUMN_EVENTTPYE + "text, " +
                COLUMN_USERNAME+ "text, " +
                COLUMN_PASSWORD + "text, " +
                ");";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addData(OrganizerData od){
        ContentValues values= new ContentValues();
        values.put(COLUMN_ORGNAME, od.ORGANIZERNAME);
        values.put(COLUMN_EVENTTPYE, od.EVENTTYPE);
        values.put(COLUMN_USERNAME, od.USERNAME);
        values.put(COLUMN_PASSWORD, od.PASSWORD);

        SQLiteDatabase db= getWritableDatabase();
        db.insert(TABLE_NAME,null, values);
        db.close();

    }


}