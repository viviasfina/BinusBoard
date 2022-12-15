package DB;

import model.Theme;
import model.User;

public class Dummy_DB {
	
	private static Dummy_DB instance =null;	
	
	public static Dummy_DB getInstance() {
		if(instance==null) {
			instance= new Dummy_DB();
		}
		return instance;
	}
	
	public void DB_User(String uname, String pass, String type) {
		//connect DB
		//validate user's Username and password from DB
		return;
	}
	
	public void DB_post(User user, String title, String content, Theme theme, String picture) {
		//connect DB
		//CRUD
		return;
	}
	
}
