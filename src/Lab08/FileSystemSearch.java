package Lab08;

public class FileSystemSearch {
    public static void main(String[] args) {
        // Create individual files
        File file1 = new File("file1.txt", "This is the content of file1.");
        File file2 = new File("file2.txt", "This file contains the keyword.");
        File file3 = new File("file3.txt", "Another file without the keyword.");

        // Create folders and add files
        Folder folder1 = new Folder("Folder1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Folder2");
        folder2.add(file3);

        // Create a root folder and add subfolders
        Folder rootFolder = new Folder("RootFolder");
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        // Perform a search operation
        rootFolder.search("keyword");
    }
}