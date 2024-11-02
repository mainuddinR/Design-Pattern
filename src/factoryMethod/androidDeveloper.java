package factoryMethod;

public class androidDeveloper implements Employee {
	
	
	@Override
	public int Salary() {
		System.out.println("Getting android developer salary");
		return 40000;
	}
}
