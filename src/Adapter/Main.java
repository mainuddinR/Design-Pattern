package Adapter;

public class Main {
	public static void main(String[] args) {
		
		//normal
		AppleCharger charger=new ChargerXYZ();//chargerXYZ charger create
		
		Iphone16 iphone16=new Iphone16(charger);
		
		iphone16.chargeIphone();
		
		//adapter
		
		AppleCharger charger2=new AdapterCharger(new VivoCharger());
		
		Iphone16 iphone=new Iphone16(charger2);
		
		iphone.chargeIphone();
	}
}
