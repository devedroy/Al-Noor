package com.example.alnoor;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.alnoor.ui.fragment.VolunteersFragment;

public class VolunteersActivity extends AppCompatActivity {

    LinearLayout ll_Individual, ll_Organisation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteers);

        initViews();

        ll_Individual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ll_Individual.setBackground(getDrawable(R.drawable.rect_rounded_red_stroke));
                ll_Organisation.setBackgroundResource(0);
                switchFragment(new VolunteersFragment());
            }
        });

        ll_Organisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ll_Organisation.setBackground(getDrawable(R.drawable.rect_rounded_red_stroke));
                ll_Individual.setBackgroundResource(0);
                switchFragment(new VolunteersFragment());
            }
        });
    }

    private void initViews() {
        ll_Organisation = (LinearLayout) findViewById(R.id.ll_Organisation);
        ll_Individual = (LinearLayout) findViewById(R.id.ll_Individual);
    }


    private void switchFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, fragment);
        fragmentTransaction.commit();
    }

    public void backVolunteers(View view) {
        onBackPressed();
    }
}