package Lab07;

public class Book implements LibraryItem {
	private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Book Title: " + title + ", Author: " + author;
    }

    @Override
    public boolean borrowItem(User user) {
        System.out.println(user.getName() + " borrowed the book: " + title);
        return true;
    }
}
