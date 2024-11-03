package Singleton_L02_Part2;

public class ModernChair implements Chair{
	private int id;
	
	public ModernChair(int id) {
		this.id=id;
	}
	@Override
	public void create() {
		System.out.println("Modern Chair created with ID: "+id);
	}
}
