package com.example.hw1.aggregation;

public class Textbook {
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
