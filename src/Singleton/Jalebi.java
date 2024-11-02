package Singleton;

public class Jalebi {
	
	//Eager way of creating singleton object 
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
