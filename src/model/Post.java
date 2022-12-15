package model;

import DB.Dummy_DB;

public class Post {

	private String author;
	private String title;
	private String content;
	private Theme theme;
	private String picture;
	Dummy_DB db = new Dummy_DB();

	//connect db
	//crud post in db
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String name) {
		this.author = name;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public void getTheme() {
		theme.useTheme();
	}

	public String getPicture() {
		return picture;
	}

	public Dummy_DB getDb() {
		return db;
	}

	public void setDb(Dummy_DB db) {
		this.db = db;
	}

	public void setTitle(String title) {
		this.title = title;
		System.out.println(this.title);
	}

	public void setContent(String content) {
		this.content = content;
		return;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
		return;
	}

	public void setPicture(String picture) {
		this.picture = picture;
		return;
	}
	
	
}
