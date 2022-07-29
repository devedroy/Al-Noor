package com.example.alnoor;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);
    }

    public void btnBack(View view) {
        onBackPressed();
    }

    public void changePassword(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View view1 = inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView textView = view1.findViewById(R.id.tvToast);
        textView.setText("Password change successful");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.NO_GRAVITY, 0, 250);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view1);
        toast.show();
    }
}