package facade;

import java.util.Scanner;
import java.util.Vector;

import model.Post;
import model.User;
import userfactory.GoldUserFact;
import userfactory.StandardUserFact;
import userfactory.UserFactory;
import userfactory.VIPUserFact;

public class Facade {
	
	Scanner sc = new Scanner(System.in);
	Vector <User> userList = new Vector<>();
	Vector <Post> createdPost = new Vector<>();
	
	UserFactory userFactory=null;
	User user = null;
	Post post = null;
	
	public void showDashboard() {
		if (createdPost.isEmpty()) {
			System.out.println("there is no post yet");
			return;
		}
		for (Post post : createdPost) {
			System.out.println("Theme:");
			post.getTheme();
			System.out.println("---");
			System.out.println("Author: "+post.getAuthor());
			System.out.println("Title: "+post.getTitle());
			System.out.println("Content: " +post.getContent());
			System.out.println("Picture: " +post.getPicture());
			System.out.println("===============================");
		}
	}
	
	public void login(){
		String uname;
		String pass;
		String type;

		do {
			System.out.print("Input username: ");
			uname= sc.nextLine();
		} while (uname.length()<1);
		
		do {
			System.out.print("Input password: ");
			pass= sc.nextLine();
		} while (pass.length()<1);
		
		//set type
		do {
			System.out.print("User type: ");
			type= sc.nextLine();
		} while (!type.equals("Standard") && !type.equals("Gold") && !type.equals("VIP"));
		
		if (type.equals("Standard")) {
			userFactory = new StandardUserFact();
			user = userFactory.createUser(uname,pass);
		}
		else if(type.equals("Gold")) {
			userFactory = new GoldUserFact();
			user = userFactory.createUser(uname,pass);
		}
		else if (type.equals("VIP")) {
			userFactory = new VIPUserFact();
			user = userFactory.createUser(uname,pass);
		}
		userList.add(user);
	}
	public void inputPost() {
		String title;
		String content;
		String theme;
		String picture;
		
		do {
			System.out.print("input title: ");
			title= sc.nextLine();
			try {
				if(title.length()<1 || title.length()>100) {
					throw new Exception("Title must be between 1-100 characters");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} while (title.length()<1 || title.length()>100);
		
		System.out.print("input content: ");
		content=sc.nextLine();
		
		do {
			System.out.print("input theme type: ");
			theme=sc.nextLine();
			try {
				if(!theme.equals("Serenity") && !theme.equals("Party") && !theme.equals("Heroes") && !theme.equals("Gold") && !theme.equals("VIP")) {
					throw new Exception("Please use provided theme [Party|Serenity|Heroes|VIP|Gold]");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} while (!theme.equals("Serenity") && !theme.equals("Party") && !theme.equals("Heroes") && !theme.equals("Gold") && !theme.equals("VIP"));
		
		do {
			System.out.print("input pict: ");
			picture=sc.nextLine();
				if (picture.length()>0) {
					try {
						if(!picture.endsWith(".jpg") && !picture.endsWith(".png")) {
							throw new Exception("Invalid picture format!");
						}
					}
					catch (Exception e) {
						System.out.println(e);
					}
				}
				else {
					break;
				}
		} while (!picture.endsWith(".jpg") && !picture.endsWith(".png"));
		
		post=user.createPost(user, title, content, theme, picture);
		createdPost.add(post);
	}
	
}
