package Singleton_L02_Part2;

public class RusticSofa implements Sofa{
	private int id;
	public RusticSofa(int id)
	{
		this.id=id;
	}
	@Override
	public void create() {
		System.out.println("Rustic Sofa created with ID: "+id);
	}

}
