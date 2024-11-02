package Facade;
import java.io.File;
public class AudioMixer {
	public File fix(VideoFile result) {
		System.out.println("AudioMixer: Fixing audio...");
		return new File("tmp");
	}
}
