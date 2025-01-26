package Lab07;

public class LibraryAccessProxy implements LibraryAccess{
	String itemID;
	LibraryItem newItem;
	public LibraryAccessProxy(String itemID, LibraryItem newItem) {
		// TODO Auto-generated constructor stub
		this.itemID=itemID;
		this.newItem=newItem;
	}
	private RealLibraryAccess realAccess = new RealLibraryAccess(itemID,newItem);

    @Override
    public LibraryItem accessItem(String itemID, User user) {
        if (!itemID.startsWith("B") && !user.isAdmin()) {
            System.out.println("Access denied to restricted item for user: " + user.getName());
            return null;
        }
        else if(!itemID.startsWith("M")&&!user.isAdmin()){
        	System.out.println("Access denied to restricted item for user: " + user.getName());
            return null;
        }
        return realAccess.accessItem(itemID, user);
    }

}
