
import java.util.Scanner;
import facade.Facade;


public class Main {
	Facade fc = new Facade();
	Scanner sc = new Scanner (System.in);
	void cls() {
		for (int i = 0; i < 30; i++) {
			System.out.println("");
		}
	}
	public Main() {
		// TODO Auto-generated constructor stub
		fc.login();
;		int ch;
		do {
			cls();
			fc.showDashboard();
			System.out.println("1. Input new post");
			System.out.println("0. exit");
			System.out.print(">> ");
			ch= sc.nextInt(); sc.nextLine();
			if(ch==1) {
				fc.inputPost();
			}
		} while (ch!=0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
