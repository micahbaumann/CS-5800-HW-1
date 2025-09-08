package com.example.hw1.interfacePkg;

import java.util.ArrayList;

public class InterfaceDriver {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();
        payables.add(new Freelancer("Stephanie", "Smith", 25, 32));
        payables.add(new Freelancer("Mary", "Quinn", 19, 41));
        payables.add(new VendorInvoice("Google", "iv_11111", 1000));
        payables.add(new VendorInvoice("Amazon", "iv_22222", 2500));

        double total = 0;
        for (Payable p : payables) {
            p.print();
            total += p.calculatePayment();
        }
        System.out.println("Total Payout: $" + total);
    }
}
