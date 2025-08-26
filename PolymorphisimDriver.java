class Ship {
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

class CruiseShip extends Ship {
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

class CargoShip extends Ship {
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

public class PolymorphisimDriver {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Flyer", "1980");
        ships[1] = new CruiseShip("Ocean", "2010", 200000);
        ships[2] = new CargoShip("Stuff", "1999", 30000);
        
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
