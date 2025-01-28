package Lab08;

class File implements FileSystemObject {
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        System.out.println("Searching for \"" + keyword + "\" in File: " + name);
        if (content.contains(keyword)) {
            System.out.println("Keyword \"" + keyword + "\" found in file: " + name);
        } else {
            System.out.println("Keyword \"" + keyword + "\" not found in file: " + name);
        }
    }
}

