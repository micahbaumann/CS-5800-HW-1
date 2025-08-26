class Employee {
    
    private String first_name;
    private String last_name;
    private String ssn;

    public Employee(String fname, String lname, String ssnum) {
        this.first_name = fname;
        this.last_name = lname;
        this.ssn = ssnum;
    }

    // Mutators
    public void setFirstName(String val) {
        this.first_name = val;
    }

    public void setLastName(String val) {
        this.last_name = val;
    }

    public void setSSN(String val) {
        this.ssn = val;
    }

    // Accessors
    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getSSN() {
        return this.ssn;
    }
}

class SalariedEmployee extends Employee{
    private double weekly_salary;

    public SalariedEmployee(String fname, String lname, String ssnum, double sal) {
        super(fname, lname, ssnum);
        this.weekly_salary = sal;
    }

    // Mutators
    public void setWeeklySalary(double val) {
        this.weekly_salary = val;
    }

    // Accessors
    public double getWeeklySalary() {
        return this.weekly_salary;
    }
}

class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String fname, String lname, String ssnum, double sal, double hours_worked) {
        super(fname, lname, ssnum);
        this.wage = sal;
        this.hours = hours_worked;
    }

    // Mutators
    public void setWage(double val) {
        this.wage = val;
    }
    
    public void setHours(double val) {
        this.hours = val;
    }

    // Accessors
    public double getWage() {
        return this.wage;
    }

    public double getHours() {
        return this.hours;
    }
}

class CommisionEmployee extends Employee{
    private double com_rate;
    private double gross_sales;

    public CommisionEmployee(String fname, String lname, String ssnum, double com, double sales) {
        super(fname, lname, ssnum);
        this.com_rate = com;
        this.gross_sales = sales;
    }

    // Mutators
    public void setComRate(double val) {
        this.com_rate = val;
    }
    
    public void setGrossSales(double val) {
        this.gross_sales = val;
    }

    // Accessors
    public double getComRate() {
        return this.com_rate;
    }

    public double getGrossSales() {
        return this.gross_sales;
    }
}

class BaseEmployee extends Employee{
    private double base_salary;

    public BaseEmployee(String fname, String lname, String ssnum, double sal) {
        super(fname, lname, ssnum);
        this.base_salary = sal;
    }

    // Mutators
    public void setBaseSalary(double val) {
        this.base_salary = val;
    }

    // Accessors
    public double getBaseSalary() {
        return this.base_salary;
    }
}

public class InheritanceDriver {
    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommisionEmployee nicole = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee mahnaz = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);
        
        System.out.println("Done");
    }
    
}