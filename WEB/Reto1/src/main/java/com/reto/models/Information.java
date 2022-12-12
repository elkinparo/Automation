package com.reto.models;

public class Information {
    private String name;
    private String Lastname;
    private String date;

    public Information(String name, String lastname, String date) {
        this.name = name;
        Lastname = lastname;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getDate() {
        return date;
    }
}
