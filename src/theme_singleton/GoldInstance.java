package theme_singleton;

import model.Gold;

public class GoldInstance {
	private static Gold instance = null;
	
	public static Gold getInstance () {
		if(instance==null) {
			instance = new Gold();
		}
		return instance;
	}
}
