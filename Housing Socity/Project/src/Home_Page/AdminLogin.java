package Home_Page;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class AdminLogin extends HomePage {


	public AdminLogin (String adminName, String adminPass, long adminNum ) {
		super();
		this.adminName =adminName;
		this.adminNum = adminNum;
		this.adminPass= adminPass;
		
	}
	
	public String toString() {
		return ("Admin Name: " + adminName + " , Admin Mobile Number: " + adminNum );
		
		
	}
	
	public AdminLogin() {
		super();
	}
	
public void login(TreeSet<AdminLogin> adminList) {
		
		Scanner sc = new Scanner(System.in);
		HomePage HP = new HomePage();
		
		System.out.println("Admin Login");
		System.out.println("""
				Enter your UserID
				Enter your Password
				""");
		String adminID = sc.nextLine();

		String psw = sc.next();

		if(userMemList != null) {
			System.out.println("memList size in Member login "+ adminList.size());
			System.out.println("Member List is non Empty");
			
			for (Member a : userMemList) {
				
				System.out.println("for each loop working in login");

					System.out.println(a.memMobNum);
					System.out.println(a.memPassword);
					
					if (a.adminUserName==(adminID) && a.adminPass.equals(psw)) {
							
							System.out.println("Moving to Home Page");
							System.out.println("Logged In SUCCESSFUL");
							HP.adminHomePage();
						} 
					
					else {
							System.err.println("Entered wrong password");
							 HP.login();
						 }
				
				}
//			System.out.println("For loop excuted");	// to check condition of if list in non empty
		} else {
			System.err.println("There are no Members in Data");
		}
	}	


}
