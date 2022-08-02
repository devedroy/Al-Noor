package com.example.alnoor.model;

public class Notification {
    int logoResourceId;
    int clockResourceId;
    String time;
    String subject;
    String description;

    public Notification(int logoResourceId, String subject, String description, int clockResourceId, String time) {
        this.logoResourceId = logoResourceId;
        this.clockResourceId = clockResourceId;
        this.time = time;
        this.subject = subject;
        this.description = description;
    }

    public int getLogoResourceId() {
        return logoResourceId;
    }

    public int getClockResourceId() {
        return clockResourceId;
    }

    public String getTime() {
        return time;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }
}
