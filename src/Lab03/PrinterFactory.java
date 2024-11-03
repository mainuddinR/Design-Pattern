package Lab03;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
public class PrinterFactory {
	private static final ConcurrentMap<Department, Printer> printerRegistry=new ConcurrentHashMap<>();
	
	
	public static Printer getPrinterForDepartment(Department department) {
	
		return printerRegistry.computeIfAbsent(department, dept -> new Printer(dept));//Lambda expression
	}
	
	public static int getTotalPrinters() {
		return printerRegistry.size();
	}
}
