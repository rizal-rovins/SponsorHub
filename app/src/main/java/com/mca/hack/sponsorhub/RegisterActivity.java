package com.mca.hack.sponsorhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText cname=(EditText)findViewById(R.id.editText);
        final EditText email=(EditText)findViewById(R.id.editText9);
        final EditText password=(EditText)findViewById(R.id.editText7);
        final EditText cpassword=(EditText)findViewById(R.id.editText8);
        Button c=(Button)findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String coname=cname.getText().toString();
                String emailid=email.getText().toString();
                String pass=password.getText().toString();
                String cpass=cpassword.getText().toString();
                if(!cpass.equals(pass)){
                    Toast.makeText(getApplicationContext(), "Reconfirm Password",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent i=new Intent(getApplicationContext(),sponsor_details.class);
                    startActivity(i);
                }
            }
        });
    }
}
