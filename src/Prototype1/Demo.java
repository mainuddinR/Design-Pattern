package Prototype1;

public class Demo {
	public static void main(String[] args) {
		ShapeRegistry registry = new ShapeRegistry();
		Shape shapel = registry.get("Big green Cricle");
		Shape shape2 =registry.get("Medium blue rectangle");
		Shape shape3 =registry.get("Medium blue rectangle");
		
		if(shapel!=shape2 && !shapel.equals(shape2)) {
			System.out.println("Big Green Cricle != Medium Blue rectangle");
		}
		else {
			System.out.println("Big Green Cricle == Medium Blue rectangle");
		}
		
		if(shape2!=shape3) {
			System.out.println("Medium blue rectangle are two differance shape");
			if(shape2.equals(shape3)) {
				System.out.println("And they are identical" );
				
			}
			else {
				System.out.println("But ther are not identical");
			}
		}
		
	}
}
