package Facade;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		VideoConversionFacade converter =new VideoConversionFacade();
		File mp4Video = converter.convertVideo("youtubeviddeo.ogg", "mp4");
	}
}
