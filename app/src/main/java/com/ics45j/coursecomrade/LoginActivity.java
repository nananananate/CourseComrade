package com.ics45j.coursecomrade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //Variables
    EditText textUsernameInput;
    Button buttonLogin;
    String submittedUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Action Bar Declarations
        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Variables set
        textUsernameInput = (EditText)findViewById(R.id.textUsernameLogin);
        buttonLogin = findViewById(R.id.buttonSignIn);
        submittedUsername = "";

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submittedUsername = textUsernameInput.getText().toString();
                //TODO: Make Login work!
                openMainActivity();
                /*if(submittedUsername != Some_Username_In_Firebase)
                    Toast.makeText(getApplicationContext(), "That user does not exist. Please try again", Toast.LENGTH_SHORT).show();
                else {
                    // LOGIN!
                }*/

            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);           //UPDATE
        startActivity(intent);
    }
}