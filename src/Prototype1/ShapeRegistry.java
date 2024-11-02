package Prototype1;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
	private Map<String, Shape> registry =new HashMap<String, Shape>();
	public ShapeRegistry() {
		Cricle cricle=new Cricle("Green", 10 );
		Rectangle rectangle= new Rectangle(8 , 10, "Blue");
		
		registry.put("Big green Cricle", cricle);
		registry.put("Medium blue rectangle", rectangle);
	}
	public Shape put(String key , Shape shape) {
		registry.put(key, shape);
		return shape;
	}
	public Shape get(String key) {
		Shape shape=registry.get(key);
		return shape.clone();
	}
}
