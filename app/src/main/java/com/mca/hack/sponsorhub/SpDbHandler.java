package com.mca.hack.sponsorhub;

;
import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;


public class SpDbHandler extends SQLiteOpenHelper {
    public final static String Sp_TABLENAME = "SponsorDetails";
    public final static String Sp_ID = "id";
    public final static String Sp_NAME = "name";
    public final static String Sp_Footfall = "footfall";
    public final static String Sp_Contact = "Contact";
    public final static String Sp_Ratio = "Ratio";
    public final static String Sp_Logo = "Logo";
    public final static String Sp_Amount = "Amount";
    public final static String Sp_Username = "Username";
    public final static String Sp_Expectation = "Expectation";
    public final static String Sp_Password = "Password";

    public SpDbHandler(Context context) {
        super(context, "SponsorDetails.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "create table " + Sp_TABLENAME + " ( " +
                Sp_ID + " integer primary key autoincrement, " +
                Sp_NAME + " text, " +
                Sp_Amount + "text," +
                Sp_Expectation + "text," +
                Sp_Footfall + " text, " +
                Sp_Contact + " text, " +
                Sp_Password + "text," +
                Sp_Username + "text," +
                Sp_Logo + "BLOB NOT NULL" +
                Sp_Ratio + " text);";

        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addData(SpData spData) {
        ContentValues values = new ContentValues();
        values.put(Sp_NAME, spData.NAME);
        values.put(Sp_Amount, spData.Amount);
        values.put(Sp_Expectation, spData.Expectation);
        values.put(Sp_Footfall, spData.Footfall);
        values.put(Sp_Contact, spData.Contact);
        values.put(Sp_Username, spData.Username);
        values.put(Sp_Password, spData.Password);
        values.put(Sp_Ratio, spData.Ratio);
        values.put(Sp_Logo, spData.Logo);
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.insert(Sp_TABLENAME, null, values);
    }


}