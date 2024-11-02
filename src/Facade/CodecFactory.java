package Facade;

import java.io.File;

public class CodecFactory {
	public Codec extract(File file) {
		Codec c=file.getAbsoluteFile();
		return c;
	}
}
