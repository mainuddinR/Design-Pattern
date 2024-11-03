package Singleton_L02_Part2;

public class ModernSofa implements Sofa{
	private int id;
	
	public ModernSofa(int id) {
		this.id=id;
	}
	
	@Override
	public void create() {
		System.out.println("Modern Sofa created with ID: "+id);
	}

}
