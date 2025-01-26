package PrototypeL04_Q1;

public class Main {
		public static void main(String[] args) {
			PrototypeRegistry registry = new PrototypeRegistry();
			
			Product cloth= registry.get("smart watch");
			
			Product electronics=registry.get("iPhone");
			
			System.out.println(cloth.getName()+" "+cloth.getCategory()+" "+cloth.getPrice());
			
			Cloth cloth2=new Cloth("Classic","watch", 3000, "gold", 14);
			//cloth2=registry.put("Classic", cloth2);
			
			//cloth2=registry.put("Classic", cloth2);
			System.out.println("Cloth2:");
			System.out.println(cloth2.getName()+" "+cloth2.getCategory()+" "+cloth2.getPrice());
			
			cloth2.setColor("Green");
			cloth2.clone();
			cloth2=(Cloth) registry.put("Classic", cloth2);
			
			System.out.println("change color cloth2:");
			
			System.out.println(cloth2.getName()+" "+cloth2.getCategory()+" "+cloth2.getPrice()+" "+cloth2.getColor());
			
			
			
		
		}
}
