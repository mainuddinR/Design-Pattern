package Lab03;

enum Department{
	SALES, HR , IT, FINANCE, MARKETING;
}

public class Printer {
	private Department department;
	
	Printer(Department department) {
		this.department=department;
		System.out.println("New Printer created for department: "+ department);
	}
	
	public void print(String document) {
		System.out.println("Printing document: "+document+" on printer for department: "+department);
		
	}
}
