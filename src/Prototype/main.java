package Prototype;

public class main {
	public static void main(String[] args) {
		System.out.println("Creating object using prototype design");
		NetworkConnection networkConnection= new NetworkConnection();
		networkConnection.setIp("77883");
		networkConnection.loadVeryImportantData();
	     System.out.println(networkConnection);
	     
	     try {
	    	 NetworkConnection networkConnection2=(NetworkConnection) networkConnection.clone();
	    	System.out.println(networkConnection2);
	    	 
	     }
	     catch(CloneNotSupportedException cl) {
	    	 cl.printStackTrace();
	    	 
	     }
	      
	}
}
