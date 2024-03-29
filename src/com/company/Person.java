package com.company;

public class Person extends Record{
   private String name;
   private String surname;
   private String phone;
   private String email;


    @Override
    public void askInfo() {
        System.out.println("Name> ");
        name = Main.scan.next();
        System.out.println("Surname> ");
        surname = Main.scan.next();
        System.out.println("Phone> ");
        phone = Main.scan.next();
        System.out.println("Email>");
        email = Main.scan.next();
    }

    @Override
    public boolean contains(String str) {
        return name.contains(str) || surname.contains(str) || phone.contains(str) || email.contains(str);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "ID " + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
