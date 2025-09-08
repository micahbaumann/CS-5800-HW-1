package com.example.hw1.inheritance;

public class CommisionEmployee extends Employee {
    private double com_rate;
    private double gross_sales;

    public CommisionEmployee(String fname, String lname, String ssnum, double com, double sales) {
        super(fname, lname, ssnum);
        this.com_rate = com;
        this.gross_sales = sales;
    }

    // Mutators
    public void setComRate(double val) {
        this.com_rate = val;
    }

    public void setGrossSales(double val) {
        this.gross_sales = val;
    }

    // Accessors
    public double getComRate() {
        return this.com_rate;
    }

    public double getGrossSales() {
        return this.gross_sales;
    }
}
