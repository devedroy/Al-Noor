package com.example.alnoor;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alnoor.adapters.StoryAdapter;
import com.example.alnoor.data.StoryData;

public class StoriesActivity extends AppCompatActivity {

    private RecyclerView rvStories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        initViews();

        StoryData data = new StoryData();

        rvStories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        StoryAdapter adapter = new StoryAdapter(this, data.loadStories());
        rvStories.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }

    private void initViews() {
        rvStories = (RecyclerView) findViewById(R.id.rvStories);
    }

    public void backStories(View view) {
        onBackPressed();
    }
}