package com.example.hw1.polymorphisim;

public class PolymorphisimDriver {
    public static void run(){
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Flyer", "1980");
        ships[1] = new CruiseShip("Ocean", "2010", 200000);
        ships[2] = new CargoShip("Stuff", "1999", 30000);

        for (Ship ship : ships) {
            ship.print();
        }
    }

    public static void main(String[] args) {
        run();
    }
}
