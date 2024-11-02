package AbstractFactoryMethod;

public class Client {
	public static void main(String[] args) {
		
		Employee emp1=EmployeeFactory.getEmployee(new AndroidDevelopFactory());
		
		int salary1=emp1.Salary();
		System.out.println(emp1.name()+" \nSalary: "+salary1);
		
		Employee emp2=EmployeeFactory.getEmployee(new WebDevelopFactory());
		
		int salary=emp2.Salary();
		System.out.println(emp2.name()+" \nSalary: "+salary);
		
		Employee emp3=EmployeeFactory.getEmployee(new ManagerFactory());
		
		int salary2=emp3.Salary();
		System.out.println(emp3.name()+" \nSalary: "+salary2);
		
	}
}
