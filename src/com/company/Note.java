package com.company;

public class Note extends Record{
    private String note;

    @Override
    public void askInfo() {
        System.out.println("Note> ");
        note = Main.scan.next();
    }

    public boolean contains(String str) {
        return note.contains(str);
    }

    public String getNote() {return note;}


    public void setNote(String note) {this.note = note;}


    @Override
    public String toString() {
        return
                "ID " + getId() +
                " " + note;
    }
}
