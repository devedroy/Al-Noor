package com.example.alnoor;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alnoor.adapters.VolunteeredAdapter;
import com.example.alnoor.data.VolunteeredData;

public class VolunteeredActivity extends AppCompatActivity {

    private RecyclerView rvVolunteered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteered);

        initViews();

        VolunteeredData data = new VolunteeredData();
        VolunteeredAdapter adapter = new VolunteeredAdapter(this, data.loadVolunteeredList());
        rvVolunteered.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        rvVolunteered.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initViews() {
        rvVolunteered = findViewById(R.id.rvVolunteered);
    }

    public void backVolunteered(View view) {
        onBackPressed();
    }
}