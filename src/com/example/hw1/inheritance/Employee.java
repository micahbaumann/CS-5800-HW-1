package com.example.hw1.inheritance;

public class Employee {
    private String first_name;
    private String last_name;
    private String ssn;

    public Employee(String fname, String lname, String ssnum) {
        this.first_name = fname;
        this.last_name = lname;
        this.ssn = ssnum;
    }

    // Mutators
    public void setFirstName(String val) {
        this.first_name = val;
    }

    public void setLastName(String val) {
        this.last_name = val;
    }

    public void setSSN(String val) {
        this.ssn = val;
    }

    // Accessors
    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getSSN() {
        return this.ssn;
    }
}
