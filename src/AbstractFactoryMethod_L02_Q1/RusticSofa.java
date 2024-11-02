package AbstractFactoryMethod_L02_Q1;

public class RusticSofa implements Sofa{
	@Override
	public void create() {
		System.out.println("Rustic Sofa created.");
	}
}
