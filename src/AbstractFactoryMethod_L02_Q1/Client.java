package AbstractFactoryMethod_L02_Q1;

public class Client {
	public static void main(String[] args) {
		FurnitureFactory modernfactory=new ModernFurnitureFactory();
		FurnitureFactory rusticfactory1=new RusticFurnitureFactory();
		FurnitureFactory victorianfactory2=new VictorianFurnitureFactory();
		
		AbstractFactory order1= new AbstractFactory(modernfactory); 
		AbstractFactory order2= new AbstractFactory(rusticfactory1);
		AbstractFactory order3=new AbstractFactory(victorianfactory2);
		
		order1.createFurnitureSet();
		System.out.println();
		order2.createFurnitureSet();
		System.out.println();
		order3.createFurnitureSet();
	}
}
