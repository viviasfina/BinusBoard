package builder;

import model.Post;
import model.Theme;
import model.User;

public class postBuilder {
	private Post post;
	private static postBuilder instance=null;
	
	public static postBuilder getInstance () {
		if(instance==null) {
			instance = new postBuilder();
		}
		return instance;
	}
	
	public void reset() {
		post = new Post();
	}
	
	public void setUser(User user) {
		this.post.setAuthor(user.getUname());
	}
	
	public void setTitle(String title) {
		this.post.setTitle(title);
	}
	
	public void setContent(String content) {
		this.post.setContent(content);
	}
	
	public void setPicture(String picture) {
		this.post.setPicture(picture);
	}
	
	public void setTheme(Theme theme) {
		this.post.setTheme(theme);
	}
	
	public Post createPost() {
		return this.post;
	}
}
