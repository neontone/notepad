package com.company;

public class Note extends Record{
    private String note;

    public void askNote() {
        System.out.println("Note> ");
        note = Main.scan.next();
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
