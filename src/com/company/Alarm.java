package com.company;

public class Alarm extends Note {
    private String time;

    public void askTime() {
        System.out.println("Time> ");
        time = Main.scan.next();
        askNote();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return
                "ID " + getId() +
                        " " + time +
                        " " + getNote();
    }
}

