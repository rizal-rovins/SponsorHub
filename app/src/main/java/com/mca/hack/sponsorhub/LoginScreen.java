package com.mca.hack.sponsorhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        char op=getIntent().getExtras().getChar("USER_TYPE");

        TextView t1=(TextView)findViewById(R.id.textView);
        if(op=='O')
            t1.setText("ORGANISER LOGIN");
        else
            t1.setText("SPONSOR LOGIN");

        final EditText un=(EditText)findViewById(R.id.username);
        final EditText pw=(EditText)findViewById(R.id.password);
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=un.getText().toString();
                String pass=un.getText().toString();

            }
        });
        Button c=(Button)findViewById(R.id.button2);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
            startActivity(i);


            }
        });
    }
}
