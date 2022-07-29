package com.example.alnoor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etPhoneNumber, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView buttonBack = findViewById(R.id.back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        etPhoneNumber = (EditText) findViewById(R.id.etPhoneNumber);
        etPhoneNumber.setText("");

        etPassword = (EditText) findViewById(R.id.etPassword);
    }

    public void loginL(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void Register(View view) {
        startActivity(new Intent(LoginActivity.this, NewAccountActivity.class));
    }

    public void forgotPassword(View view) {
        startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
    }

    public void btnBack(View view) {
        onBackPressed();
    }
}