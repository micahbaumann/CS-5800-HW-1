package com.example.hw1;

import com.example.hw1.aggregation.AggregationDriver;
import com.example.hw1.composition.CompositionDriver;
import com.example.hw1.inheritance.InheritanceDriver;
import com.example.hw1.interfacePkg.InterfaceDriver;
import com.example.hw1.polymorphisim.PolymorphisimDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Inheritance==============================");
        InheritanceDriver.run();

        System.out.println("\n===Interface================================");
        InterfaceDriver.run();

        System.out.println("\n===Polymorphisim============================");
        PolymorphisimDriver.run();

        System.out.println("\n===Aggregation==============================");
        AggregationDriver.run();

        System.out.println("\n===Composition==============================");
        CompositionDriver.run();
    }
}