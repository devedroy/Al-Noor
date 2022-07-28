package com.example.alnoor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LogSignSelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_sign_selector);


        ImageView buttonBack = findViewById(R.id.back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void login(View view) {
        startActivity(new Intent(LogSignSelectorActivity.this, LoginActivity.class));
    }

    public void signUp(View view) {
        startActivity(new Intent(LogSignSelectorActivity.this, NewAccountActivity.class));

    }
}