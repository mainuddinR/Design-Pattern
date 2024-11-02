package FactoryMethodLab01;

public class Main {
	public static void main(String[] args) {
		
        DeviceFactory smartphoneFactory = new SmartphoneFactory("Galaxy S21", 5000);
        Device smartphone = smartphoneFactory.createDevice();
        smartphone.powerOn();
        System.out.println(smartphone.getDeviceInfo());
        smartphone.powerOff();

        DeviceFactory tabletFactory = new TabletFactory(10.5, 256);
        Device tablet = tabletFactory.createDevice();
        tablet.powerOn();
        System.out.println(tablet.getDeviceInfo());
        tablet.powerOff();

        DeviceFactory laptopFactory = new LaptopFactory(16, "Intel Core i7");
        Device laptop = laptopFactory.createDevice();
        laptop.powerOn();
        System.out.println(laptop.getDeviceInfo());
        laptop.powerOff();
    }
}
