package Singleton_L02_Part2;

public class VictorianChair implements Chair{
	private int id;
	
	public VictorianChair(int id ) {
		this.id=id;
	}
	@Override
	public void create() {
		System.out.println("Victorian Chair created with ID: "+id);
	}
}
