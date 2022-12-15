package model;

import java.util.Scanner;

import DB.Dummy_DB;
import adapter.ThemeAdapter;
import builder.postBuilder;

public class StandardUser extends User {

	Dummy_DB db = new Dummy_DB();
	Scanner sc = new Scanner (System.in);
	
	public StandardUser(String uname, String pass) {
		super(uname, pass);
		
		//insert data into db -> db.DB_User(uname, pass, "Standard");
	}
	

	@Override
	public Post createPost(User user, String title, String content, String theme, String picture) {
		boolean flag= true;
		postBuilder pb = postBuilder.getInstance();
		
		pb.reset();
		pb.setUser(user);
		pb.setTitle(title);
		
		while(flag==true) {
			try {
				if(content.length()<1 || content.length()>500) {
					throw new Exception("Content lenght must be between 1-500 characters!");
				}
			} catch (Exception e) {
				System.out.println(e);
				flag=false;
			}
			if (flag==false) {
				System.out.print("Please input content: ");
				content= sc.nextLine();
				flag=true;
			}
			else {
				break;
			}
		}
		pb.setContent(content);
		
		while(flag==true) {
			try {
				if(theme.equals("Gold") || theme.equals("VIP")) {
					throw new Exception("Selected theme aren't available for your subscription level");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				flag=false;
			}
			if(flag==false) {
				do {
					System.out.print("Input theme: ");
					theme= sc.nextLine();
				} while (!theme.equals("Serenity") && !theme.equals("Party") && !theme.equals("Heroes"));
				break;
			}
			else {
				break;
			}
		}
		
		if(picture.length()>0) {
			pb.setPicture(picture);
		}
	
		ThemeAdapter t= new ThemeAdapter(theme);
		Theme tema = t.convertType();
		pb.setTheme(tema);
		
		return pb.createPost();
		//return new Post(title, content, tema, picture);
	}
}
