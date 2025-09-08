package com.example.hw1.inheritance;

public class BaseEmployee extends Employee {
    private double base_salary;

    public BaseEmployee(String fname, String lname, String ssnum, double sal) {
        super(fname, lname, ssnum);
        this.base_salary = sal;
    }

    // Mutators
    public void setBaseSalary(double val) {
        this.base_salary = val;
    }

    // Accessors
    public double getBaseSalary() {
        return this.base_salary;
    }
}
