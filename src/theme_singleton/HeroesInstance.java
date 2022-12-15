package theme_singleton;

import model.Heroes;

public class HeroesInstance {
	private static Heroes instance = null;

	public static Heroes getInstance () {
		if(instance==null) {
			instance = new Heroes();
		}
		return instance;
	}

}
