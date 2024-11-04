package AdapterL05;

public class LegacyPrinterAdapter implements ModernPrinter{
	private LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printDocument(String content) {
        legacyPrinter.print(content); 
    }

}
