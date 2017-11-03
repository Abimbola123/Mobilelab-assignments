package com.example.abimbola.loginregisterlab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View .OnClickListener {

    Button bRegister;
    EditText etName, etAge, etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etAge = (EditText) findViewById(R.id.etAge);
        bRegister = (Button) findViewById(R.id.bregister);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent redirect = new Intent(MainActivity.this, Login.class);
        startActivity(redirect);
        /*
        switch (view.getId()) {
            Intent redirect = new Intent(MainActivity.this, Login.class);
            startActivity(redirect);
            break;
        }
        */
    }
}


