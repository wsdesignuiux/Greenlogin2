package com.example.vaibhav.greenlogin2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Greenlogin2Activity extends AppCompatActivity {
    EditText user;
    EditText pass;
    TextView login;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greenlogin2);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");

        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        signup = (TextView) findViewById(R.id.signup);
        user.setTypeface(custom_font);


        pass.setTypeface(custom_font);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/LatoRegular.ttf");

        login = (TextView) findViewById(R.id.login);
        login.setTypeface(custom_font1);

        signup.setTypeface(custom_font);
    }

}
