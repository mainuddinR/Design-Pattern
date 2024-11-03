package Singleton_L02_Part2;

public class RusticTable implements Table{
	private int id ;
	public RusticTable(int id) {
		this.id=id;
	}
	
	@Override
	public void create() {
		System.out.println("Rustic Table created with ID: "+id);
	}

}
