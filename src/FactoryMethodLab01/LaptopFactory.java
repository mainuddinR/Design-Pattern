package FactoryMethodLab01;

public class LaptopFactory extends DeviceFactory {
 private int ram;
 private String processor;

 public LaptopFactory(int ram, String processor) {
     this.ram = ram;
     this.processor = processor;
 }

 @Override
 public Device createDevice() {
     return new Laptop(ram, processor);
 }
}

