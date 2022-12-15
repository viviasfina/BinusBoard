package userfactory;

import model.GoldUser;
import model.User;

public class GoldUserFact extends UserFactory {

	@Override
	public User createUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return new GoldUser(uname, pass);
	}

}
