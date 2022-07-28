package com.example.alnoor;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
    }

//    userSession =new
//
//    UserSession(SplashScreen .this);
//
//    Handler handler = new Handler();
//        handler.postDelayed(new
//
//    Runnable() {
//        @Override
//        public void run () {
//            if (userSession.isUserLoggedIn()) {
//                Intent i11 = new Intent(SplashScreen.this, MainActivity.class);
//                startActivity(i11);
//                finish();
//            } else {
//                Intent i12 = new Intent(SplashScreen.this, Login_Activity.class);
//                startActivity(i12);
//                finish();
//            }
//        }
//    },3000);
}