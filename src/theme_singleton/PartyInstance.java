package theme_singleton;

import model.Party;

public class PartyInstance {
	private static Party instance = null;
	
	public static Party getInstance () {
		if(instance==null) {
			instance = new Party();
		}
		return instance;
	}
}
