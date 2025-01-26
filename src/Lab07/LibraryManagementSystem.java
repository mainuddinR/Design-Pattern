package Lab07;

public class LibraryManagementSystem {
	public static void main(String[] args) {
        // Factory
        LibraryItem book = LibraryItemFactory.createLibraryItem("Book", "Teach yourself C", "Herbert schildt");
        LibraryItem magazine = LibraryItemFactory.createLibraryItem("Magazine", "National Geographic", "October 2024");

        System.out.println(book.getDetails());
        System.out.println(magazine.getDetails());

        // Proxy
        LibraryAccessProxy proxy = new LibraryAccessProxy("B1",book);
        LibraryAccessProxy proxy2 = new LibraryAccessProxy("M2",magazine);
        
        User regularUser = new User("Mainuddin", false);
        User regularUser2 = new User("Atikul", false);
        User regUser3=new User("Marjia", false);
        
        book.borrowItem(regUser3);
        proxy.accessItem("R1", regularUser2);
        //proxy.

        // Singleton Usage
        LibraryConfigManager config = LibraryConfigManager.getInstance();
        System.out.println("Library Hours: " + config.getSetting("LibraryHours"));
        config.updateSetting("LateFee", "10");
        System.out.println("Late Fee: " + config.getSetting("LateFee"));
    }
}
