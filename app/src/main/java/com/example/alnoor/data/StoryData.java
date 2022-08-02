package com.example.alnoor.data;

import com.example.alnoor.R;
import com.example.alnoor.model.Story;

import java.util.ArrayList;
import java.util.List;

public class StoryData {
    private List<Story> storyList = new ArrayList<>();

    public List<Story> loadStories() {
        storyList.add(new Story(
                1,
                "Loren ipsum dolor",
                "Loren ipsum dolor sit amet consectetur",
                "2:00 pm",
                R.drawable.outline_alarm_24));
        return storyList;
    }
}
