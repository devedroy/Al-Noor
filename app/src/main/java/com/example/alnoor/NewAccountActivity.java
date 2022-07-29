package com.example.alnoor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewAccountActivity extends AppCompatActivity {

    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

        etName = (EditText) findViewById(R.id.etName);
        etName.setText("");
    }

    public void btnBack(View view) {
        onBackPressed();
    }

    public void login(View view) {
        startActivity(new Intent(NewAccountActivity.this, LoginActivity.class));
    }
}