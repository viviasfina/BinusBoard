package userfactory;

import model.StandardUser;
import model.User;

public class StandardUserFact extends UserFactory {

	@Override
	public User createUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return new StandardUser(uname, pass);
	}

}
