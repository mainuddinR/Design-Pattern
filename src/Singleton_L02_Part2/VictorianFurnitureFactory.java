package Singleton_L02_Part2;

import java.util.concurrent.atomic.AtomicInteger;

public class VictorianFurnitureFactory implements FurnitureFactory{
	private static VictorianFurnitureFactory instance;
	private AtomicInteger idGenerator=new AtomicInteger(1);
	
	private VictorianFurnitureFactory() {
		
	}
	
	public static VictorianFurnitureFactory getInstance() {
		if(instance==null) {
			synchronized (VictorianFurnitureFactory.class) {
				if(instance==null) {
					instance=new VictorianFurnitureFactory();
				}
			}
		}
		return instance;
	}
	
	@Override
	public Chair createChair() {
		return new VictorianChair(idGenerator.getAndIncrement());
	}
	@Override
	public Table createTable() {
		return new VictorianTable(idGenerator.getAndIncrement());
	}
	@Override
	public Sofa createSofa() {
		return new VictorianSofa(idGenerator.getAndIncrement());
	}
}
