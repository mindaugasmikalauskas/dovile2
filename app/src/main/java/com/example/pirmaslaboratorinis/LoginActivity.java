package com.example.pirmaslaboratorinis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity { //klases pradzia




    @Override
    protected void onCreate(Bundle savedInstanceState) { //funkcijos pradzia
        super.onCreate(savedInstanceState); //tuscio lango sukurimas
        setContentView(R.layout.activity_login); //kodas susiejamas su vaizdu ir tusciam langui suteikiamas vaizdas


        EditText username = findViewById(R.id.username); //susiejamas elelmentas vaizde su kintamuoju kode
        EditText email = findViewById(R.id.email); //tipai ir kintamojo pavadinimai
        EditText password = findViewById(R.id.password);
        Button register = findViewById(R.id.register);

        //cia bus aprasomas kodas, kuris bus susijes su mygtuko paspaudimu:

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //pradzia onclick, kodas, kuris bus vykdomas ant paspausto mygtuko
                String usernameStr = username.getText().toString();
                String emailStr = email.getText().toString();
                String passwordStr = password.getText().toString();

                if (Validation.isUsernameValid(usernameStr) && Validation.isEmailValid(emailStr)
                        && Validation.isPasswordValid(passwordStr)) {
                    Intent goToSearchActivity = new Intent(LoginActivity.this, SearchActivity.class);//is kur einam i kur
                    startActivity(goToSearchActivity);
                } else {
                    username.setError(getResources().getString(R.string.login_invalid_credentials));
                    username.requestFocus();


                    //Toast.makeText(LoginActivity.this, username.getText().toString() + "\n" + email.getText().toString()
                    // + "\n" + password.getText().toString(), Toast.LENGTH_SHORT).show();

                    //  Toast.makeText(LoginActivity.this, "vardas: " +
                    //    usernameStr + "\n" + "email: " + emailStr + "\n" + "slaptazodis: " +
                    //         passwordStr, Toast.LENGTH_LONG).show();


                }
            }
        }); //mygtuko paspaudimo funkcijos pabaiga



    } //funkcijos pabaiga

   // private boolean isValid(String credentials) {
       // final String CREDENTIALS_PATTERN = "^[a-zA-Z0-9]{3,20}$";

    //    Pattern pattern = Pattern.compile(CREDENTIALS_PATTERN); //pattern tai biblioteka
       // Matcher matcher = pattern.matcher(credentials);
      //  return matcher.matches();








} //klases pabaiga