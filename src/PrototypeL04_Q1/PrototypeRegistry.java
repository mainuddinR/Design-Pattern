package PrototypeL04_Q1;


import java.util.HashMap;
import java.util.Map;


public class PrototypeRegistry {
	public Map<String, Product> registry =new HashMap<String, Product>();
	// Map<String, Product> registry1 =new HashMap<String, Product>();
	public PrototypeRegistry(){
		Cloth cloth=new Cloth("Smart watch", "watch", 5000, "Black",13 );
		Electronics elctronics= new Electronics("iPhone" ,"phone",190000, 256, "12-10-2024");
		
		registry.put("iPhone", elctronics);
		registry.put("smart watch", cloth);
	}

	public Product put(String key , Product product) {
		registry.put(key, product);
		return product;
	}
	
	public Product get(String key) {
		Product product=registry.get(key);
		return product.clone();
	}
}
