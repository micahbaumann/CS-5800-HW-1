import java.util.ArrayList;

interface Payable {
    double calculatePayment();
    String getPayeeName();
    void print();
}

class Freelancer implements Payable {
    private String first_name;
    private String last_name;
    private double hourly_rate;
    private double hours_worked;

    public Freelancer(String fname, String lname, double rate, double hours) {
        this.first_name = fname;
        this.last_name = lname;
        this.hourly_rate = Math.max(0, rate);
        this.hours_worked = Math.max(0, hours);
    }

    // Getters
    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public double getHourlyRate() {
        return this.hourly_rate;
    }

    public double getHoursWorked() {
        return this.hours_worked;
    }

    // Setters
    public boolean setFirstName(String val) {
        this.first_name = val;
        return true;
    }

    public boolean setLastName(String val) {
        this.last_name = val;
        return true;
    }

    public boolean setHourlyRate(double val) {
        if (val >= 0) {
            this.hourly_rate = val;
            return true;
        }
        return false;
    }

    public boolean setHoursWorked(double val) {
        if (val >= 0) {
            this.hours_worked = val;
            return true;
        }
        return false;
    }

    // Utils
    public double calculatePayment() {
        if (hours_worked <= 40) {
            return this.hourly_rate * this.hours_worked;
        }
        return (this.hourly_rate * 40.0) + (this.hourly_rate * (this.hours_worked - 40.0) * 1.5);
    }

    public String getPayeeName() {
        return this.first_name + " " + this.last_name;
    }

    public void print() {
        System.out.println("Payee: " + getPayeeName() + ", Payment: $" + calculatePayment());
    }
}

class VendorInvoice implements Payable {
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
