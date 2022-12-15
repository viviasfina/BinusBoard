package adapter;

import model.Gold;
import model.Heroes;
import model.Party;
import model.Serenity;
import model.Theme;
import model.VIP;

public class ThemeAdapter {
	private String theme;
	
	public ThemeAdapter(String theme) {
		this.theme=theme;
	}
	
	public Theme convertType() {
		if (theme.equals("Serenity")) {
			return new Serenity();
		}
		else if (theme.equals("Heroes")) {
			return new Heroes();
		}
		else if (theme.equals("Party")) {
			return new Party();
		} 
		else if (theme.equals("Gold")){
			return new Gold();
		}
		else if(theme.equals("VIP")) {
			return new VIP();
		}
		return null;
	}
}
