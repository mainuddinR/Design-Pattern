package AdapterL05;

public class NewModernPrinter implements ModernPrinter{
	@Override
    public void printDocument(String content) {
        System.out.println("Modern Printer printing: " + content);
    }
}
