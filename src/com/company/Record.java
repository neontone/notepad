package com.company;

public abstract class Record {
    private static int counter = 0;
    private int id;

    public Record() {
        counter++;
        id = counter;
    }

    public abstract void askInfo();

    public boolean contains(String str) {
        return Integer.toString(id).contains(str);
    }

    public int getId() {return id;}

}
