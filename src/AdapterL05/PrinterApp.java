package AdapterL05;

public class PrinterApp {
	public static void main(String[] args) {
		
		
        ModernPrinter modernPrinter = new NewModernPrinter(); //direct
        modernPrinter.printDocument("Document for modern printer");

        
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        ModernPrinter legacyObjectAdapter = new LegacyPrinterAdapter(legacyPrinter);
        legacyObjectAdapter.printDocument("Document for legacy printer (using Object Adapter)");


        ModernPrinter legacyClassAdapter = new LegacyPrinterClassAdapter();
        legacyClassAdapter.printDocument("Document for legacy printer (using Class Adapter)");
        
	}
}
