package AbstractFactoryMethod;

public class AndroidDevelopFactory extends EmployeeAbstractFactory{
	@Override
	public Employee creatEmployee() {
		
		return new AndroidDeveloper();
	}
}
