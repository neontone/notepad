package com.company;

public class Alarm extends Note {
    private String time;

    @Override
    public void askInfo() {
        System.out.println("Time> ");
        time = Main.scan.next();
        super.askInfo();
    }

    public boolean contains(String str) {
        return time.contains(str) || super.contains(str);
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

