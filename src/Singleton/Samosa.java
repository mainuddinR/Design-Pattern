package Singleton;


public class Samosa {
	
	private static Samosa samosa;
	
	private Samosa() {
		
	}
	
	//Lazy way of creating singleton object
	//thread 1 thakle thik ache but multi-thread khetre multi object create hobe
	// multi thread jonno synchronized use kora.
	// synchronized method not use because if er upore ba niche aro code thakte pare tai
	//synchronized block use korte hoibe.
	public static Samosa getSamosa()
	{
		//object of this class
		if(samosa==null) {
			synchronized (Samosa.class) {
				if(samosa==null) {
					samosa=new Samosa();
					
				}
			}
		}
		return samosa;
	}
}

/*
 * 1. constructor private
 * 
 * 2.object create with the help of method
 * 
 * 3.create field to store object is private
 * */
