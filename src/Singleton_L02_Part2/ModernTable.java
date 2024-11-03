package Singleton_L02_Part2;

public class ModernTable implements Table{
	private int id;
	
	public ModernTable(int id) {
		this.id=id;
	}
	
	@Override
	public void create() {
		System.out.println("Modern Table created with ID: "+id);
	}

}
