package Prototype;

public class NetworkConnection implements Cloneable {
	private String ip;
	private String importanData;
	public String getIp() {
		return ip;
	}
	public String getImportanData() {
		return importanData;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setImportanData(String importanData) {
		this.importanData = importanData;
	}
	public void loadVeryImportantData() {
		this.importanData="very very important data";
		//Thread.sleep(200000);
		try {
			Thread.sleep(10000);
			} 
		catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	@Override
	public String toString() {
		return this.ip+" : "+this.importanData;
	}
	//clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	 
}