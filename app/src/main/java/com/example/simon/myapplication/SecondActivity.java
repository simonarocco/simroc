package com.example.simon.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private EditText Password2;
    private Button Create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Username = findViewById(R.id.createUsername);
        Password = findViewById(R.id.createPassword);
        Password2 = findViewById(R.id.verify);
        Create = findViewById(R.id.createProfileButton);

        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validatePass(Password.getText().toString(), Password2.getText().toString());
            }
        });
    }

    private void validatePass(String firstPass, String valPass) {
        while(firstPass != valPass)
        {
            Toast.makeText(this, "Passwords do not match. Please try again.",
                    Toast.LENGTH_LONG).show();
        }
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);

    }


}


