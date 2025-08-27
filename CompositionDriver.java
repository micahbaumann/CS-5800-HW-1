import java.util.ArrayList;

class File {
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

class Folder {
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
