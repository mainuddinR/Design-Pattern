package Lab07;

public class Magazine implements LibraryItem{
	private String title;
    private String issue;

    public Magazine(String title, String issue) {
        this.title = title;
        this.issue = issue;
    }

    @Override
    public String getDetails() {
        return "Magazine Title: " + title + ", Issue: " + issue;
    }

    @Override
    public boolean borrowItem(User user) {
        System.out.println(user.getName() + " borrowed the magazine: " + title);
        return true;
    }
}
