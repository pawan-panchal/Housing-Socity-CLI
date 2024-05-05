package Home_Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class HomePage extends DriverClass {

	protected String memName;
	protected String memEmail;
	protected String memSocity;
	protected int memRoomNum;
	protected long memMobNum;
	protected String memUserName;
	protected String memPassword;
	
	String adminName;
	String adminUserName;
	long adminNum;
	String adminPass;

	public String accName;
	public String accNum;
	public String accIFSC;
	public String UPI_ID;  // Used for Account Details
	 
	static ArrayList<Member> userMemList = new ArrayList<Member> ();
	TreeSet<AdminLogin> adminList = new TreeSet<AdminLogin> ();			//Not excuted till now
	

	public void SignUp() {
		
		HomePage HP = new HomePage();
//		Member M = new Member();
		
		
		System.out.println("""
				=====================================================
						Sign In
				=====================================================
					""");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("""
				Welcome to the Member Sign In Page ...
				Please enter the below deatils properly  
				1.Name
				2.email
				3.Socity Name
				4.Room Number
				5.Mobile Number
				6.UserName
				7.Password
				
				""");

//		HP.userMemList.add(new Member(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine(), sc.nextLine()));  // Add data to array list
		userMemList.add(new Member(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine(), sc.nextLine()));  // Add data to array list
//		System.out.println("size in memInfo "+ userMemList.size());		// To check if data is add properly
		login();

	}
	
	
	
	
	/*
	 * 
	 ------------------------------------------------------------------> Login Page
	 * 
	 */
	
	public void login() {
		
		
		
		Scanner sc = new Scanner (System.in);
		Member mem = new Member();
		Admin_Page AP = new Admin_Page();
		HomePage HP = new HomePage();
		AdminLogin AL = new AdminLogin();
		
		System.out.println("size in HomePage login "+ userMemList.size()); // Here arrayList is becoming empty
		
		System.out.println("""
				==========================================================================
						WELCOME TO THE LOGIN PAGE
				==========================================================================
				
				Home Page Login
				""");
		
		
		
		System.out.println("""
				1. Press 1 for User Login 
				2. Press 2 for Admin Login
				3. Press Any other key for SignUP
				""");
		int inpt = sc.nextInt();
		
		if(inpt == 1) {
			mem.login();
		}
		else if(inpt == 2 ) {
			
			//Direct Admin Login
			
			System.out.println("""
					=====================================================
								Admin Login
					=====================================================
						""");
			
			System.out.println("Enter Admin UserName");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Enter Admin Password");
			String psw = sc.nextLine();
			
			System.out.println("=====================================================");
			System.out.println("		Login SucessFul");
			System.out.println("=====================================================");
			System.out.println("Logged in as Admin");
			System.out.println("Name: " + name);
			adminHomePage();
			
			// Login by Saved Data
//			AL.login(adminList);
			
			
		} else {
			System.out.println("""
					Moving to Sign Up Page
					Please Wait...
					
					""");
			
			HP.SignUp();
			
			
		}
		
	}
	
	/*
	 * 
	 --------------------------------------------------------------------------> Home Page
	 * 
	 */
	
	public void userHomePage() {
		
		User_Other_Page UOP = new User_Other_Page();
		
		System.out.println("""
			=====================================================
					Welcome To The Home Page
			=====================================================
				""");
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("""
				1.Payment
				2.Meeting
				3.Notice
				4.Complaint
				5.Event
				6.Parking
				7.Contact Us
				""");
		
		int a = Integer.parseInt(sc.nextLine());
		
		switch (a) {
		case 1 : {
			// Payment
			User_Payment_Page ref = new User_Payment_Page();
			ref.option();
			break;
		}
		case 2 : {
			// Meeting
			UOP.meeting();
			break;
		}
		case 3 : {
			 //Notice
			UOP.notice();
			break;
		}
		case 4 : {
			//Complaint
			UOP.complaint();
			break;
		}
		case 5 : {
			//Event
			UOP.event();
			break;
		}
		case 6 : {
			//Parking
			UOP.parking();
			break;
		}
		case 7 : {
			//Contact Us
			UOP.contactUs();
			break;
		}
		default : {
			System.err.println("Please Enter a valid Input");
			userHomePage();
		}		//
		}		//-------------> Switch
		
		
	}
	
	public void adminHomePage() {
		
		Admin_Other_Page AOP = new Admin_Other_Page();
		Admin_Page AP = new Admin_Page();
		
		System.out.println("""
			=====================================================
					Welcome To The ADMIN HOME PAGE
			=====================================================
				""");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("""
				1.Payment
				2.Meeting
				3.Notice
				4.Complaint
				5.Event
				6.Parking
				7.Contact Us
				""");
		
		int a = sc.nextInt();
		System.out.println(a);
		
		switch (a) {
		case 1 : {
			// Payment
			System.out.println("Loading Payment Payment");
			AP.option();
			
			break;
		}
		case 2 : {
			
			System.out.println("Loading Payment Maeeting");
			AOP.meeting();
			break;
		}
		case 3 : {
			 //Notice
			System.out.println("Loading Payment Notice");
			AOP.notice();
			break;
		}
		case 4 : {
			//Complaint
			System.out.println("Loading Payment Complaint");
			//
			break;
		}
		case 5 : {
			//Event
			System.out.println("Loading Payment Event");
			AOP.event();
			break;
		}
		case 6 : {
			//Parking
			System.out.println("Loading Payment Parking");
			AOP.parking();
			break;
		}
		case 7 : {
			//Contact Us
			System.out.println("Loading Payment Contact Us");
			AOP.contactUs();
			break;
		}
		default : {
			System.err.println("Please Enter a valid Input");
			userHomePage();
		}		//
		}		//-------------> Switch
		
		
	}
		
}