
package Home_Page;
import java.util.Scanner;

public class DriverClass {
	
	
	static {
		
		System.out.println("""
				Welcome to the Soscity run
				""");
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HomePage HP = new HomePage();
		
		
		
		
		System.out.println("""
				Press 
				1.Login
				2.SignUp 
				3.Guest Login
				4.Exit
				""");
		
		int input = Integer.parseInt(sc.nextLine()); //
		
		switch (input) {
		case 1 : {	
			System.out.println("Loading Login Page");
			HP.login();
			break;
		}
		case 2 : {
			System.out.println("Loading SignUp Page");
			HP.SignUp();
			break;
		}
		case 3 : {
			System.out.println("Welcome to Guest profile");
			HP.userHomePage();
			break;
		}
		case 4 : {
			System.exit(0);
		}
		}
		
	}

}
