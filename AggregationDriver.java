class Instructor {
    private String first_name;
    private String last_name;
    private String office;

    public Instructor(String fname, String lname, String off) {
        this.first_name = fname;
        this.last_name = lname;
        this.office = off;
    }

    // Getters
    public String getFirstName() {
        return this.first_name;
    }
    
    public String getLastName() {
        return this.last_name;
    }
    
    public String getOffice() {
        return this.office;
    }

    // Setters
    public void setFirstName(String val) {
        this.first_name = val;
    }
    
    public void setLastName(String val) {
        this.last_name = val;
    }
    
    public void setOffice(String val) {
        this.office = val;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String ttl, String auth, String pub) {
        this.title = ttl;
        this.author = auth;
        this.publisher = pub;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getOffice() {
        return this.publisher;
    }

    // Setters
    public void setTitle(String val) {
        this.title = val;
    }
    
    public void setAuthor(String val) {
        this.author = val;
    }
    
    public void setPublisher(String val) {
        this.publisher = val;
    }
}

class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;
    private Instructor instructor2;
    private Textbook textbook2;

    public Course(String nme, Instructor inst, Textbook book, Instructor inst2, Textbook book2) {
        this.name = nme;
        this.instructor = inst;
        this.textbook = book;
        this.instructor2 = inst2;
        this.textbook2 = book2;
    }

    // Getters
    public String getName() {
        return this.name;
    }
    
    public Instructor getInstructor() {
        return this.instructor;
    }
    
    public Textbook getTextbook() {
        return this.textbook;
    }
    
    public Instructor getInstructor2() {
        return this.instructor2;
    }
    
    public Textbook getTextbook2() {
        return this.textbook2;
    }

    // Setters
    public void setName(String val) {
        this.name = val;
    }
    
    public void setInstructor(Instructor val) {
        this.instructor = val;
    }
    
    public void setTextbook(Textbook val) {
        this.textbook = val;
    }
    
    public void setInstructor2(Instructor val) {
        this.instructor2 = val;
    }
    
    public void setTextbook2(Textbook val) {
        this.textbook2 = val;
    }

    // Utils
    public void print() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Instructor One Name: " + this.instructor.getFirstName() + " " + this.instructor.getLastName());
        System.out.println("Textbook One: \"" + this.textbook.getTitle() + "\" by " + this.textbook.getAuthor());
        System.out.println("Instructor Two Name: " + this.instructor2.getFirstName() + " " + this.instructor2.getLastName());
        System.out.println("Textbook Two: \"" + this.textbook2.getTitle() + "\" by " + this.textbook2.getAuthor());
    }
}

public class AggregationDriver {
    public static void main(String[] args) {
        Instructor i1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor i2 = new Instructor("Gilbert", "Young", "8-12");
        Textbook t1 = new Textbook("Clean Code", "Robert C. Martin Series", "Prentice Hall");
        Textbook t2 = new Textbook("Computer Algorithms", "Horowitz, Sahni and Rajasekaran, W. H. Freeman", "Computer Science Press");
        
        Course c = new Course("CS 5800", i1, t1, i2, t2);
        c.print();
    }
}