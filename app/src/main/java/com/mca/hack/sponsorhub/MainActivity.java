package com.mca.hack.sponsorhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button organiser,sponsor;
        organiser=(Button)findViewById(R.id.button_organiser);
        sponsor=(Button)findViewById(R.id.button_sponsor);

        sponsor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),LoginScreen.class);
                i.putExtra("USER_TYPE",'S');
                startActivity(i);
            }
        });


        organiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),LoginScreen.class);
                i.putExtra("USER_TYPE",'O');
                startActivity(i);
            }
        });

    }


}
