package com.mca.hack.sponsorhub;

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

        final EditText cname=(EditText)findViewById(R.id.orgusername);
        final EditText email=(EditText)findViewById(R.id.orgcontact);
        final EditText password=(EditText)findViewById(R.id.orgpass);
        final EditText cpassword=(EditText)findViewById(R.id.orgrepass);
        Button c=(Button)findViewById(R.id.button);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String coname=cname.getText().toString();
                String emailid=email.getText().toString();
                String pass=password.getText().toString();
                String cpass=cpassword.getText().toString();
                if(cpass!=pass){
                    Toast.makeText(getApplicationContext(), "Reconfirm Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
