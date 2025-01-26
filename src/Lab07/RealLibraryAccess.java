package Lab07;
import java.util.Map;
import java.util.HashMap;
public class RealLibraryAccess implements LibraryAccess{
	private Map<String, LibraryItem> libraryItems = new HashMap<>();
	String itemID;
	LibraryItem newItem;

    public RealLibraryAccess(String itemID, LibraryItem newItem) {
    	
        libraryItems.put("B1", new Book("Effective Java", "Joshua Bloch"));
        libraryItems.put("M1", new Magazine("July Biplob", "Septembar 2024"));
        libraryItems.put(itemID,newItem);
    }

    @Override
    public LibraryItem accessItem(String itemID, User user) {
        LibraryItem item = libraryItems.get(itemID);
        if (item != null) {
            System.out.println("Access granted to " + user.getName());
            return item;
        }
        throw new IllegalArgumentException("Item not found: " + itemID);
    }
}
