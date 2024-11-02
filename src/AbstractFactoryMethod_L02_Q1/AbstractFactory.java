package AbstractFactoryMethod_L02_Q1;

public class AbstractFactory {
	private Chair chair;
	private Table table;
	private Sofa sofa;
	public AbstractFactory(FurnitureFactory factory) {
		chair=factory.createChair();
		table=factory.createTable();
		sofa=factory.createSofa();
	}
	public void createFurnitureSet() {
		chair.create();
		table.create();
		sofa.create();
	}
	
	public void ChairCreate() {
		chair.create();
	}
	public void TableCreate() {
		table.create();
	}
	public void SofaCreate() {
		sofa.create();
	}
	
}
