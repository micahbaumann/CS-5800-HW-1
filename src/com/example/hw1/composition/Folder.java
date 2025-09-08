package com.example.hw1.composition;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files = new ArrayList<File>();
    private ArrayList<Folder> folders = new ArrayList<Folder>();

    public Folder(String folder_name, ArrayList<File> file_list, ArrayList<Folder> folder_list) {
        this.name = folder_name;
        this.files = file_list;
        this.folders = folder_list;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public ArrayList<File> getFiles() {
        return this.files;
    }

    public ArrayList<Folder> getFolders() {
        return this.folders;
    }

    // Setter
    public void setName(String val) {
        this.name = val;
    }

    public void setFiles(ArrayList<File> val) {
        this.files = val;
    }

    public void setFolders(ArrayList<Folder> val) {
        this.folders = val;
    }

    // Utils
    public void print() {
        this.print("");
    }

    public void print(String indent) {
        System.out.println(indent + "Folder: " + this.name);
        for (Folder sub : this.folders) {
            sub.print(indent + "    ");
        }
        for (File f : this.files) {
            f.print(indent + "    ");
        }
    }

    public void addFile(File val) {
        this.files.add(val);
    }

    public void addFolder(Folder val) {
        this.folders.add(val);
    }

    public void deleteFolder(String name) {
        int folder_size = this.folders.size();
        for (int i = 0; i < folder_size; i++) {
            if (this.folders.get(i).getName().equals(name)) {
                this.folders.remove(i);
                break;
            }
        }
    }

    public void deleteFile(String name) {
        int file_size = this.files.size();
        for (int i = 0; i < file_size; i++) {
            if (this.files.get(i).getName().equals(name)) {
                this.files.remove(i);
                break;
            }
        }
    }
}
