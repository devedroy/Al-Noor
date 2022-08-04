package com.example.alnoor.models;

public class Story {
    int storyNumber;
    String subject;
    String description;
    String time;
    int clockResourceId;

    public Story(int storyNumber, String subject, String description, String time, int clockResourceId) {
        this.storyNumber = storyNumber;
        this.subject = subject;
        this.description = description;
        this.time = time;
        this.clockResourceId = clockResourceId;
    }

    public int getStoryNumber() {
        return storyNumber;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    public int getClockResourceId() {
        return clockResourceId;
    }
}
