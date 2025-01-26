package Lab07;

public class LibraryItemFactory {
	public static LibraryItem createLibraryItem(String type, String title, String extraDetail) {
        if ("Book".equalsIgnoreCase(type)) {
            return new Book(title, extraDetail);
        } else if ("Magazine".equalsIgnoreCase(type)) {
            return new Magazine(title, extraDetail);
        }
        throw new IllegalArgumentException("Invalid Library Item Type");
    }
}
