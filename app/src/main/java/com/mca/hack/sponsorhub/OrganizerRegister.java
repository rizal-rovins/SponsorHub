package com.mca.hack.sponsorhub;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by gandharv on 28/10/17.
 */

public class OrganizerRegister extends AppCompatActivity{
    EditText name;
    EditText username;
    EditText password;
    EditText contact;
    EditText repassword;
    EditText eventtype;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer_register);
        name=(EditText) findViewById(R.id.orgname);
        username=(EditText) findViewById(R.id.orgusername);
        password=(EditText) findViewById(R.id.orgpass);
        repassword=(EditText) findViewById(R.id.orgrepass);
        contact=(EditText) findViewById(R.id.orgcontact);
        eventtype=(EditText) findViewById(R.id.orgeventtype);

        Button b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrganizerDBHandler odh=new OrganizerDBHandler(getApplicationContext(),"organizer",null,1);
                OrganizerData od=new OrganizerData(name.getText().toString(),contact.getText().toString(),eventtype.getText().toString(),username.getText().toString(),password.getText().toString());
                odh.addData(od);
            }
        });
    }
}
