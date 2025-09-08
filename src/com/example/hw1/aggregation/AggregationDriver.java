package com.example.hw1.aggregation;

public class AggregationDriver {
    public static void run() {
        Instructor i1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor i2 = new Instructor("Gilbert", "Young", "8-12");
        Textbook t1 = new Textbook("Clean Code", "Robert C. Martin Series", "Prentice Hall");
        Textbook t2 = new Textbook("Computer Algorithms", "Horowitz, Sahni and Rajasekaran, W. H. Freeman", "Computer Science Press");

        Course c = new Course("CS 5800", i1, t1, i2, t2);
        c.print();
    }

    public static void main(String[] args) {
        run();
    }
}
