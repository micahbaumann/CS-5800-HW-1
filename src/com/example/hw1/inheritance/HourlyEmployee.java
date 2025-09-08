package com.example.hw1.inheritance;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String fname, String lname, String ssnum, double sal, double hours_worked) {
        super(fname, lname, ssnum);
        this.wage = sal;
        this.hours = hours_worked;
    }

    // Mutators
    public void setWage(double val) {
        this.wage = val;
    }

    public void setHours(double val) {
        this.hours = val;
    }

    // Accessors
    public double getWage() {
        return this.wage;
    }

    public double getHours() {
        return this.hours;
    }
}
