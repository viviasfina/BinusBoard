package theme_singleton;

import model.VIP;

public class VIPInstance {
	private static VIP instance = null;
	
	public static VIP getInstance () {
		if(instance==null) {
			instance = new VIP();
		}
		return instance;
	}
}
