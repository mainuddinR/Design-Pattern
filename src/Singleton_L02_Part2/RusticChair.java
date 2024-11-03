package Singleton_L02_Part2;

public class RusticChair implements Chair{
	private int id;
	
	public RusticChair(int id)
	{
		this.id=id;
	}
	
	@Override
	public void create() {
		System.out.println("Rustic Chair created with ID: "+id);
	}
}
