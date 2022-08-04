package com.example.alnoor.models;

public class MyContribution {

    int index;
    String subject;
    String body;
    String date;
    String time;

    public MyContribution(int index, String subject, String body, String date, String time) {
        this.index = index;
        this.subject = subject;
        this.body = body;
        this.date = date;
        this.time = time;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
