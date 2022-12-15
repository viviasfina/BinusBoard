package userfactory;

import model.User;
import model.VIPUser;

public class VIPUserFact extends UserFactory {

	@Override
	public User createUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return new VIPUser(uname, pass);
	}

}
