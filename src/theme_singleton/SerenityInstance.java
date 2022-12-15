package theme_singleton;

import model.Serenity;

public class SerenityInstance {
	private static Serenity instance = null;
	
	public static Serenity getInstance () {
		if(instance==null) {
			instance = new Serenity();
		}
		return instance;
	}
	
}
