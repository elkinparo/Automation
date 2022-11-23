package com.reto.models;

public class PrimaryModel
{
    private final String LOGIN;
    private final String PASWORD;

    public PrimaryModel(String LOGIN, String PASWORD) {
        this.LOGIN = LOGIN;
        this.PASWORD = PASWORD;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public String getPASWORD() {
        return PASWORD;
    }
}
