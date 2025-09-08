package com.example.hw1.polymorphisim;

public class CargoShip extends Ship {
    public int cargo_cap;

    public CargoShip(String nme, String yr, int cap) {
        super(nme, yr);
        this.cargo_cap = cap;
    }

    // Getters
    public int getCargoCap() {
        return this.cargo_cap;
    }

    // Setters
    public void setCargoCap(int val) {
        this.cargo_cap = val;
    }

    // Utils
    public void print() {
        System.out.println("Ship: " + this.getName() + ", Cargo Capacity: " + this.cargo_cap);
    }
}
