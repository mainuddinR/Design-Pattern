package AdapterL05;

public class LegacyPrinterClassAdapter extends LegacyPrinter implements ModernPrinter{
	@Override
    public void printDocument(String content) {
        print(content);
    }

}
