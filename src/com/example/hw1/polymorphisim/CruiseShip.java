package com.example.hw1.polymorphisim;

public class CruiseShip extends Ship {
    public int max_passengers;

    public CruiseShip(String nme, String yr, int max) {
        super(nme, yr);
        this.max_passengers = max;
    }

    // Getters
    public int getMaxPassengers() {
        return this.max_passengers;
    }

    // Setters
    public void setMaxPassengers(int val) {
        this.max_passengers = val;
    }

    // Utils
    public void print() {
        System.out.println("Ship: " + this.getName() + ", Max Passengers: " + this.max_passengers);
    }
}
