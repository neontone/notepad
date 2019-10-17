package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> records = new ArrayList<>();
    static ArrayList<Record> listrecords = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Enter a command");
        for (; ; ) {
            System.out.print("> ");
            String cmd = scan.next();

            switch (cmd) {
                case "help":
                    showHelp();
                    break;
                case "exit":
                    System.out.println("Good bye!");
                    return;
                case "create":
                    createRecord();
                    break;
                case "list":
                    listRecords();
                    break;
                case "notes":
                    listNotes();
                    break;
                default:
                    System.out.println("Wrong command");
                    break;
            }
        }

    }

    private static void listNotes() {
        for (Record p : listrecords) {
            System.out.println(p);
        }
    }

    private static void showHelp () {
        System.out.println("One day here will be a great manual. Eventually");
    }


    private static void listRecords() {
        for (Record p : records) {
  //         System.out.printf("%d %s %s %s\n",
  //                  p.getId(),
  //                  p.getName(),
  //                  p.getSurname(),
  //                  p.getPhone());
            System.out.println(p);
        }
    }

    private static void createRecord() {
        System.out.print("type> ");
        String type = scan.next();
        switch (type) {
            case "person":
                createPerson();
                break;
            case "note":
                createNote();
                break;
            default:
                System.out.println("Error. Unknown record type");
        }
    }

    private static void createNote() {
        Note p = new Note();
        p.askNote();
        listrecords.add(p);
    }

    private static void createPerson() {
        Person p = new Person();
        p.askInfo();
        records.add(p);

    }

}


