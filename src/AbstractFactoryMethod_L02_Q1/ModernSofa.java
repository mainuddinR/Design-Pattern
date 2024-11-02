package AbstractFactoryMethod_L02_Q1;

public class ModernSofa implements Sofa{
	@Override
	public void create() {
		System.out.println("Modern Sofa created.");
	}
}
