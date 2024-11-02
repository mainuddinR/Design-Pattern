package factoryMethod;

public class webDeveloper implements Employee {
	@Override
	public int Salary() {
		System.out.println("Getting web developer salary");
		return 36000;
	}
}
