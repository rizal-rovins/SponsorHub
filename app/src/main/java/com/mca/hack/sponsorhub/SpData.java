package com.mca.hack.sponsorhub;


import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;

public class SpData {


    public  String NAME;
    public  String Footfall;
    public  String Contact;

    public  String Amount;
    public  String Username;
    public  String Expectation;
    public  String Password;
    public  String Ratio;
    public  byte[] Logo;

    public SpData(String name,String footfall,String contact,String amount,String username,String expectation,String password,String ratio,Bitmap logo){
        NAME=name;
        Footfall=footfall;
        Contact=contact;
        Amount=amount;
        Username=username;
        Expectation=expectation;
        Password=password;
        Ratio=ratio;
        Logo=getBytes(logo);
    }

    public static byte[] getBytes(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, stream);
        return stream.toByteArray();
    }
    public static Bitmap getImage(byte[] image) {
        return BitmapFactory.decodeByteArray(image, 0, image.length);
    }

}
