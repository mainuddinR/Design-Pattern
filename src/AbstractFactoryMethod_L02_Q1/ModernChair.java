package AbstractFactoryMethod_L02_Q1;

public class ModernChair implements Chair{
	
	@Override
	public void create() {
		System.out.println("Modern Chair created.");
	}

}
