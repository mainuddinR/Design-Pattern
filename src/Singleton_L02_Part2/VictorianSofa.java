package Singleton_L02_Part2;


public class VictorianSofa implements Sofa{
	private int id;
	public VictorianSofa(int id) {
		this.id=id;
	}
	
	@Override
	public void create() {
		System.out.println("Victorian Sofa created with ID: "+id);
	}
}
