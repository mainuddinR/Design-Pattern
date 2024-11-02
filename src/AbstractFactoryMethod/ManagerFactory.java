package AbstractFactoryMethod;

public class ManagerFactory extends EmployeeAbstractFactory{
	@Override
	public Employee creatEmployee() {
		
		return new Manager();
	}
}
