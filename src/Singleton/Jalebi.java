package Singleton;

public class Jalebi {
	
	//Eager way of creating singleton object
	//good way na, agei object create kore rakhe use kori ar nai kore
	
	private static Jalebi jalebi=new Jalebi();
	private Jalebi() {
		
	}
	public static Jalebi getJalebi() {
//		if(jalebi==null) {
//			new Jalebi();
//			}
		return jalebi;
	}
	
}
