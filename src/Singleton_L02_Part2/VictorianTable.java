package Singleton_L02_Part2;

public class VictorianTable implements Table{
	private int id;
	
	public VictorianTable(int id) {
		this.id=id;
	}
	@Override
	public void create() {
		System.out.println("Victorian Table created with ID: "+id);
	}
}
