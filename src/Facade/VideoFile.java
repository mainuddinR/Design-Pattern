package Facade;

public class VideoFile {
	private String name;
	private String codetype;
	
	public VideoFile(String name) {
		this.name=name;
		this.codetype=name.substring(name.indexOf(".")+1);
	}
	
	public String getCodetype() {
		return codetype;
	}
	
	public String getName() {
		return name;
	}
}
