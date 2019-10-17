package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Person> records = new ArrayList<>();


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
                default:
                    System.out.println("Wrong command");
                    break;
            }
        }

    }

    private static void showHelp () {
        System.out.println("One day here will be a great manual. Eventually");
    }


    private static void listRecords() {
        for (Person p : records) {
            System.out.printf("%d %s %s %s\n",
                    p.getId(),
                    p.getName(),
                    p.getSurname(),
                    p.getPhone());
        }
    }

    private static void createRecord() {
        System.out.print("type> ");
        String type = scan.next();
        switch (type) {
            case "person":
                createPerson();
                break;
            default:
                System.out.println("Error. Unknown record type");
        }
    }

    private static void createPerson() {
        System.out.println("Name> ");
        String name = scan.next();
        System.out.println("Surname> ");
        String surname = scan.next();
        System.out.println("Phone> ");
        String phone = scan.next();

        Person p = new Person();
        p.setName(name);
        p.setSurname(surname);
        p.setPhone(phone);

        records.add(p);

        savePerson();
    }

    private static void savePerson() {
        File file = new File("records.txt");
        try (PrintWriter out = new PrintWriter(file)) {
            for (Person p : records) {
                out.print(p.getId());
                out.print(" ");
                out.print(p.getName());
                out.print(" ");
                out.print(p.getSurname());
                out.print(" ");
                out.print(p.getPhone());
                out.println();
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


