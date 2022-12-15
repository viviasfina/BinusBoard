package model;

public abstract class User {

	private String Uname;
	private String pass;
	
	public User(String uname, String pass) {
		super();
		Uname = uname;
		this.pass = pass;
	}

	public abstract Post createPost(User user, String title, String content, String theme, String picture);

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
