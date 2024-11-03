package Singleton_L02_Part2;

import java.util.concurrent.atomic.AtomicInteger;

public class RusticFurnitureFactory implements FurnitureFactory{
	private static RusticFurnitureFactory instance;
	private AtomicInteger idGenerator=new AtomicInteger(1);
	private RusticFurnitureFactory() {}
	
	public static RusticFurnitureFactory getInstance() {
		if(instance==null) {
			synchronized (RusticFurnitureFactory.class) {
				if(instance==null) {
					instance=new RusticFurnitureFactory();
				}
			}
		}
			
		return instance;
	}
	@Override
	public Chair createChair() {
		return new RusticChair(idGenerator.getAndIncrement());
	}
	@Override
	public Table createTable() {
		return new RusticTable(idGenerator.getAndIncrement());
	}
	@Override
	public Sofa createSofa() {
		return new RusticSofa(idGenerator.getAndIncrement());
	}
}
