package com.mca.hack.sponsorhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sponsor_details extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsor_details);
        final Intent i=getIntent();
        final EditText Comname=(EditText)findViewById(R.id.editText4);
        final EditText footfall=(EditText)findViewById(R.id.editText5);
        final EditText Amount=(EditText)findViewById(R.id.editText11);
        final EditText Ratio=(EditText)findViewById(R.id.editText6);
        final EditText Expectations=(EditText)findViewById(R.id.editText12);
        Button c=(Button)findViewById(R.id.button4);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String comname=Comname.getText().toString();
                String ff=footfall.getText().toString();
                String amount=Amount.getText().toString();
                String ratio=Ratio.getText().toString();
                String expectations=Expectations.getText().toString();
                SpData sp=new SpData(comname,ff,i.getExtras().getString("contact"),
                        amount,i.getExtras().getString("username"),expectations,i.getExtras().getString("pass"),ratio);
                SpDbHandler s=new SpDbHandler(getApplicationContext());
                s.addData(sp);


            }
        });
    }
}
