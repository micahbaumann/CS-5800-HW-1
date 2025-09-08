package com.example.hw1.inheritance;

public class SalariedEmployee extends Employee {
    private double weekly_salary;

    public SalariedEmployee(String fname, String lname, String ssnum, double sal) {
        super(fname, lname, ssnum);
        this.weekly_salary = sal;
    }

    // Mutators
    public void setWeeklySalary(double val) {
        this.weekly_salary = val;
    }

    // Accessors
    public double getWeeklySalary() {
        return this.weekly_salary;
    }
}
