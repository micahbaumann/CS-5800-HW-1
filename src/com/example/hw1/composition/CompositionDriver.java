package com.example.hw1.composition;

import java.util.ArrayList;

public class CompositionDriver {
    public static void main(String[] args) {
        Folder php_demo1 = new Folder("php_demo1", new ArrayList<File>(), new ArrayList<Folder>());
        Folder source_files = new Folder("Source Files", new ArrayList<File>(), new ArrayList<Folder>());
        Folder app = new Folder("app", new ArrayList<File>(), new ArrayList<Folder>());

        // php_demo1
        php_demo1.addFolder(source_files);
        php_demo1.addFolder(new Folder("Include Path", new ArrayList<File>(), new ArrayList<Folder>()));
        php_demo1.addFolder(new Folder("Remote Files", new ArrayList<File>(), new ArrayList<Folder>()));

        // Source Files
        source_files.addFolder(new Folder(".phalcon", new ArrayList<File>(), new ArrayList<Folder>()));
        source_files.addFolder(app);
        source_files.addFolder(new Folder("cache", new ArrayList<File>(), new ArrayList<Folder>()));
        source_files.addFolder(new Folder("public", new ArrayList<File>(), new ArrayList<Folder>()));
        source_files.addFile(new File(".htaccess"));
        source_files.addFile(new File(".htrouter.php"));
        source_files.addFile(new File("index.html"));

        // app
        app.addFolder(new Folder("config", new ArrayList<File>(), new ArrayList<Folder>()));
        app.addFolder(new Folder("controllers", new ArrayList<File>(), new ArrayList<Folder>()));
        app.addFolder(new Folder("library", new ArrayList<File>(), new ArrayList<Folder>()));
        app.addFolder(new Folder("migrations", new ArrayList<File>(), new ArrayList<Folder>()));
        app.addFolder(new Folder("models", new ArrayList<File>(), new ArrayList<Folder>()));
        app.addFolder(new Folder("views", new ArrayList<File>(), new ArrayList<Folder>()));

        php_demo1.print();

        source_files.deleteFolder("app");
        System.out.println();
        php_demo1.print();

        source_files.deleteFolder("public");
        System.out.println();
        php_demo1.print();
    }
}
