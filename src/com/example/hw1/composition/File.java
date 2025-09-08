package com.example.hw1.composition;

public class File {
    private String name;

    public File(String file_name) {
        this.name = file_name;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String val) {
        this.name = val;
    }

    // Utils
    public void print() {
        System.out.println(name);
    }

    public void print(String indent) {
        System.out.println(indent + name);
    }
}
