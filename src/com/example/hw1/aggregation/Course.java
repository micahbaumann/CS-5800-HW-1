package com.example.hw1.aggregation;

public class Course {
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
