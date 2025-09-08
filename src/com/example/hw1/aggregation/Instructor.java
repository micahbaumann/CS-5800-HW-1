package com.example.hw1.aggregation;

public class Instructor {
    private String first_name;
    private String last_name;
    private String office;

    public Instructor(String fname, String lname, String off) {
        this.first_name = fname;
        this.last_name = lname;
        this.office = off;
    }

    // Getters
    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getOffice() {
        return this.office;
    }

    // Setters
    public void setFirstName(String val) {
        this.first_name = val;
    }

    public void setLastName(String val) {
        this.last_name = val;
    }

    public void setOffice(String val) {
        this.office = val;
    }
}
