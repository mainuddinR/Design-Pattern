package Lab08;

import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystemObject {
    private String name;
    private List<FileSystemObject> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystemObject child) {
        children.add(child);
    }

    public void remove(FileSystemObject child) {
        children.remove(child);
    }

    @Override
    public void search(String keyword) {
        System.out.println("Searching for \"" + keyword + "\" in Folder: " + name);
        for (FileSystemObject child : children) {
            child.search(keyword); // Recursively search in child objects
        }
    }
}