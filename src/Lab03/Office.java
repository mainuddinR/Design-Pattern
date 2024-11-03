package Lab03;

public class Office {
	public static void main(String[] args) {
		Printer salesPrinter=PrinterFactory.getPrinterForDepartment(Department.SALES);
		salesPrinter.print("Sales report");
		
		Printer hpPrinter=PrinterFactory.getPrinterForDepartment(Department.HR);
		hpPrinter.print("Employee Handbook");
		
		Printer itPrinter = PrinterFactory.getPrinterForDepartment(Department.IT);
        itPrinter.print("Server Maintenance Document");
        
        Printer financePrinter = PrinterFactory.getPrinterForDepartment(Department.FINANCE);
        financePrinter.print("Financial Report");
		
        //again sales department printer use
        Printer salesPrinter2 = PrinterFactory.getPrinterForDepartment(Department.SALES);
        salesPrinter2.print("Quarterly Sales Figures");
        
        
        Printer financePrinter2 = PrinterFactory.getPrinterForDepartment(Department.FINANCE);
        financePrinter2.print("Financial Sales increasing");
        
        System.out.println("Total printers created: "+PrinterFactory.getTotalPrinters());
	}
}
