package Singleton_L02_Part2;

public class Client {
	public static void main(String[] args) {
//		FurnitureFactory modernfactory=new ModernFurnitureFactory();
//		FurnitureFactory rusticfactory1=new RusticFurnitureFactory();
//		FurnitureFactory victorianfactory2=new VictorianFurnitureFactory();
//		
		
		
		FurnitureFactory modernFactory=MudernFurnitureFactory.getInstance();
		FurnitureFactory victorianFactory=VictorianFurnitureFactory.getInstance();
		FurnitureFactory rusticFactory=RusticFurnitureFactory.getInstance();
		
		AbstractFactory order1= new AbstractFactory(modernFactory); 
		AbstractFactory order3= new AbstractFactory(rusticFactory);
		AbstractFactory order2=new AbstractFactory(victorianFactory);
		
		order1.createFurnitureSet();
		System.out.println();
		order2.createFurnitureSet();
		System.out.println();
		order3.createFurnitureSet();
		 System.out.println();
		 System.out.println();
		
		//Thread create
		Runnable task1 = () -> { //Runnable is a functional interface in Java
            FurnitureFactory modernFactory1 = MudernFurnitureFactory.getInstance();
            AbstractFactory modernStore = new AbstractFactory(modernFactory1);
            modernStore.createFurnitureSet();
        };

        Runnable task2 = () -> {
            FurnitureFactory victorianFactory1 = VictorianFurnitureFactory.getInstance();
            AbstractFactory victorianStore = new AbstractFactory(victorianFactory1);
            victorianStore.createFurnitureSet();
        };
        Runnable task3=()-> {
        	FurnitureFactory rusticFactory1=RusticFurnitureFactory.getInstance();
        	AbstractFactory rusticStore=new AbstractFactory(rusticFactory1);
        	rusticStore.createFurnitureSet();
        };
        
        
        Thread thread1=new Thread(task1);
        
        Thread thread2=new Thread(task2);
        
        Thread thread3=new Thread(task3);
        
        thread1.start();
        thread2.start();
        thread3.start();
		
		
		
	}
}
