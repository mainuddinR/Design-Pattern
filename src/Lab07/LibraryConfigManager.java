package Lab07;
import java.util.*;

public class LibraryConfigManager {
	private static LibraryConfigManager instance;
    private Map<String, String> settings = new HashMap<>();

    private LibraryConfigManager() {
        settings.put("LateFee", "5");
        settings.put("LibraryHours", "9 AM - 5 PM");
    }

    public static synchronized LibraryConfigManager getInstance() {
        
    	//if(instance==null) {	
        	//synchronized (instance) {
        		if (instance == null) {
        			instance = new LibraryConfigManager();
				}
			//}   
    	//}
        return instance;
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void updateSetting(String key, String value) {
        settings.put(key, value);
        System.out.println("Updated " + key + " to " + value);
    }
}
