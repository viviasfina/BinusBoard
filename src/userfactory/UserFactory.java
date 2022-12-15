package userfactory;

import model.User;

public abstract class UserFactory {
	public abstract User createUser(String uname, String pass);
}
