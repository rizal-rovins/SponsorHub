package com.mca.hack.sponsorhub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        char op=getIntent().getExtras().getChar("USER_TYPE");
        //Toast.makeText(getApplicationContext(),String.valueOf(op),Toast.LENGTH_SHORT).show();

        TextView t1=(TextView)findViewById(R.id.textView);
        if(op=='O')
            t1.setText("ORGANISER LOGIN");
        else
            t1.setText("SPONSOR LOGIN");
    }
}
