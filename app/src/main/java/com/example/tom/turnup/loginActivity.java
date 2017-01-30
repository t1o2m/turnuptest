package com.example.tom.turnup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {

    Button b1;
    EditText pass,usr;
    int counter=5;

    private void showError(){
        usr.setError("Invalid username and password");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        b1 = (Button) findViewById(R.id.button);
        //Password is editText2, username is editText
        pass = (EditText) findViewById(R.id.editText2);
        usr = (EditText) findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
    @Override
            public void onClick (View v){
                if (pass.getText().toString().equals("password") && usr.toString().equals("username")) {
                } else {
                    counter--;
                    if (counter == 0) {
                        startActivity(new Intent(loginActivity.this, popup.class));
                        try {
                            wait(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        counter = 5;

                    } else {
                        showError();
                        counter--;
                    }

                }
            }
        });
    }
}

