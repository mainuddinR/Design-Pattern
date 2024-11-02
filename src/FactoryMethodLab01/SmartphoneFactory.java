package FactoryMethodLab01;

public class SmartphoneFactory extends DeviceFactory {
 private String model;
 private int batteryCapacity;

 public SmartphoneFactory(String model, int batteryCapacity) {
     this.model = model;
     this.batteryCapacity = batteryCapacity;
 }

 @Override
 public Device createDevice() {
     return new Smartphone(model, batteryCapacity);
 }
}
