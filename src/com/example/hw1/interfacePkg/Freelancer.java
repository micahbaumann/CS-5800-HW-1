package com.example.hw1.interfacePkg;

public class Freelancer implements Payable {
    private String first_name;
    private String last_name;
    private double hourly_rate;
    private double hours_worked;

    public Freelancer(String fname, String lname, double rate, double hours) {
        this.first_name = fname;
        this.last_name = lname;
        this.hourly_rate = Math.max(0, rate);
        this.hours_worked = Math.max(0, hours);
    }

    // Getters
    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public double getHourlyRate() {
        return this.hourly_rate;
    }

    public double getHoursWorked() {
        return this.hours_worked;
    }

    // Setters
    public boolean setFirstName(String val) {
        this.first_name = val;
        return true;
    }

    public boolean setLastName(String val) {
        this.last_name = val;
        return true;
    }

    public boolean setHourlyRate(double val) {
        if (val >= 0) {
            this.hourly_rate = val;
            return true;
        }
        return false;
    }

    public boolean setHoursWorked(double val) {
        if (val >= 0) {
            this.hours_worked = val;
            return true;
        }
        return false;
    }

    // Utils
    public double calculatePayment() {
        if (hours_worked <= 40) {
            return this.hourly_rate * this.hours_worked;
        }
        return (this.hourly_rate * 40.0) + (this.hourly_rate * (this.hours_worked - 40.0) * 1.5);
    }

    public String getPayeeName() {
        return this.first_name + " " + this.last_name;
    }

    public void print() {
        System.out.println("Payee: " + getPayeeName() + ", Payment: $" + calculatePayment());
    }
}
