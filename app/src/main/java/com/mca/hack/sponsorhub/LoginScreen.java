package com.mca.hack.sponsorhub;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.mca.hack.sponsorhub.SpDbHandler.Sp_Password;
import static com.mca.hack.sponsorhub.SpDbHandler.Sp_TABLENAME;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final char op=getIntent().getExtras().getChar("USER_TYPE");

        TextView t1=(TextView)findViewById(R.id.textView);
        if(op=='O')
            t1.setText("ORGANISER LOGIN");
        else
            t1.setText("SPONSOR LOGIN");

        final EditText un=(EditText)findViewById(R.id.username);
        final EditText pw=(EditText)findViewById(R.id.password);
        Button b=(Button)findViewById(R.id.button);


        final boolean[] flag = {false};
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=un.getText().toString();
                String pass=un.getText().toString();
                if(op=='O'){
                   flag[0] =Sppasschecker(user,pass);
                   if(flag[0]==true){
                       //Do your work here
                   }
                }
                else{
                    flag[0]=Orgpasschecker(user,pass);
                    if(flag[0]==true){
                        //do your stuff here
                    }
                }


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

    public boolean Sppasschecker(String user, String pass) {
        SpDbHandler s=new SpDbHandler(this);
        SQLiteDatabase database = s.getReadableDatabase();
        Cursor cursor = database.query(s.Sp_TABLENAME, null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            String password = cursor.getString(cursor.getColumnIndex(s.Sp_Password));
            String username = cursor.getString(cursor.getColumnIndex(s.Sp_Username));
            if ((user == username))
                if(password==pass)
                    return true;
        }
        return false;

    }
    public boolean Orgpasschecker(String user, String pass) {
        OrganizerDBHandler s=new OrganizerDBHandler(this,"organizer",null,1);
        SQLiteDatabase database = s.getReadableDatabase();
        Cursor cursor = database.query(Sp_TABLENAME, null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            String password = cursor.getString(cursor.getColumnIndex(s.COLUMN_PASSWORD));
            String username = cursor.getString(cursor.getColumnIndex(s.COLUMN_USERNAME));
            if ((user == username))
                if(password==pass)
                    return true;
        }
        return false;

    }
}
