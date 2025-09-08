package com.example.hw1.interfacePkg;

public class VendorInvoice implements Payable {
    private String name;
    private String invoice;
    private double amount_due;

    public VendorInvoice(String nme, String invce, double amount) {
        this.name = nme;
        this.invoice = invce;
        this.amount_due = Math.max(0, amount);
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getInvoice() {
        return this.invoice;
    }

    public double getAmountDue() {
        return this.amount_due;
    }

    // Setters
    public boolean setName(String val) {
        this.name = val;
        return true;
    }

    public boolean setInvoice(String val) {
        this.invoice = val;
        return true;
    }

    public boolean setAmountDue(double val) {
        if (val >= 0) {
            this.amount_due = val;
            return true;
        }
        return false;
    }

    // Utils
    public double calculatePayment() {
        return this.amount_due;
    }

    public String getPayeeName() {
        return this.name;
    }

    public void print() {
        System.out.println("Payee: " + this.getPayeeName() + ", Invoice Num: " + this.invoice + ", Payment: $" + this.calculatePayment());
    }
}
