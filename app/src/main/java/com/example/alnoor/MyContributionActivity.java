package com.example.alnoor;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alnoor.adapters.MyContributionAdapter;
import com.example.alnoor.data.MyContributionData;

public class MyContributionActivity extends AppCompatActivity {

    private RecyclerView rvMyContributions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contribution);

        initViews();

        MyContributionData data = new MyContributionData();
        MyContributionAdapter adapter = new MyContributionAdapter(this, data.loadMyContributionList());
        rvMyContributions.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        rvMyContributions.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initViews() {
        rvMyContributions = findViewById(R.id.rvMyContributions);
    }


    public void backMyContributions(View view) {
        onBackPressed();
    }
}