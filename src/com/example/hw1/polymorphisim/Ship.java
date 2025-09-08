package com.example.hw1.polymorphisim;

public class Ship {
    private String name;
    private String year;

    public Ship(String nme, String yr) {
        this.name = nme;
        this.year = yr;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getYear() {
        return this.year;
    }

    // Setters
    public void setName(String val) {
        this.name = val;
    }

    public void setYear(String val) {
        this.year = val;
    }

    // Utils
    public void print() {
        System.out.println("Ship: " + this.name + ", Built: " + this.year);
    }
}
