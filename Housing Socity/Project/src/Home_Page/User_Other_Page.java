package Home_Page;

import java.util.Scanner;

public class User_Other_Page extends Admin_Other_Page{
	
	
	/*
	 * ----------------------------------------------------> Meeting
	 */
	
	public void meeting() {
		
		Admin_Other_Page AOP = new Admin_Other_Page();
		
		System.out.println("""
				====================================================================
						MEETING SUMMARY
				===================================================================
				
				
				""");
		System.out.println("Last Meeting Point: ");
		System.out.println(AOP.meeting);
		
		System.out.println("""
				1. Press 1 to go home page
				2. Press 2 to exit from application
				""");
		
		if (sc.nextInt() == 1) {
			System.out.println("Moving to HOME PAGE ");
			System.out.println("Please Wait");
			userHomePage();
		} else {
			System.out.println("Do you really want to exit");
			System.out.println("Type Y for Yes & N for No");
			if (sc.next().charAt(0) == 'Y') {
				System.out.println("Exiting form Application");
				System.out.println("Please Wait");
				System.exit(0);
				} else {
					System.out.println("Moving to Home Page, Due to wrong Input");
					userHomePage();
				}
		}
	} 
	
	/*
	 * 
	 * -------------------------------------------------------> Notice
	 * 
	 */

	
	public void notice() {
		
		System.out.println("""
				====================================================================
						SOCITY NOTICE
				===================================================================
				
				
				""");

		System.out.println("Notice : ");
		System.out.println();
		System.out.println(notice);
		
		System.out.println("""
				
				1. Press 1 for HomePage
				2. Press 2 for Exit Application
				
				""");
		
		if (sc.nextInt() == 1) {
			System.out.println("Moving to HOME PAGE ");
			System.out.println("Please Wait");
			userHomePage();
		} else {
			System.out.println("Do you really want to exit");
			System.out.println("Type Y for Yes & N for No");
			if (sc.next().charAt(0) == 'Y') {
				System.out.println("Exiting form Application");
				System.out.println("Please Wait");
				System.exit(0);
				} else {
					System.out.println("Moving to Home Page, Due to wrong Input");
					userHomePage();
				}
		}
		
		
	}
	
	/*
	 * 
	 * -------------------------------------------------------> Complaint
	 * 
	 */
	
	public String complaint( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("""
				====================================================================
						PLEASE REGISTER YOUR COMPLAINT HERE
				===================================================================
				
				
				""");
		
		System.out.println("Type your COMPLAINT here");
		String complaint = sc.nextLine();
		System.out.println("YOUR COMPLAINT: " + complaint);
		System.out.println("""
					1. Press 1 to REGISTER your Complaint
					2. Press 2 to Cancel & move to Home Page
				""");
		
		int cpl = sc.nextInt();
		
		while (cpl < 0 && cpl > 3) {
			System.out.println("Enter valid input");
			cpl = sc.nextInt();
		}
		if(cpl == 1 ) {
			System.out.println("Your Complaint has been Submited");
			// Add complaint to user complaint
			userHomePage();
	
		} else if ( cpl == 2){
			System.out.println("""
					Cancelling your Complaint Request
					Please Wait...
					complaint UNREGISTERED SUCCESSFULLY
					
					Mpving to Home Page
					""");
			
			userHomePage();
			
		}
		return complaint;
	}
	
	
	/*
	 * 
	 * ----------------------------------------------> Event
	 *  
	 * 
	 */
	
public void event() {
		
		System.out.println("""
				====================================================================
						SOCITY NOTICE
				===================================================================
				
				
				""");
		
		System.out.println("Event Notice: ");
		System.out.println(event);
		
		if (sc.nextInt() == 1) {
			System.out.println("Moving to HOME PAGE ");
			System.out.println("Please Wait");
			userHomePage();
			
		} else {
			System.out.println("Do you really want to exit");
			System.out.println("Type Y for Yes & N for No");
			if (sc.next().charAt(0) == 'Y') {
				System.out.println("Exiting form Application");
				System.out.println("Please Wait");
				System.exit(0);
				} else {
					System.out.println("Moving to Home Page, Due to wrong Input");
					userHomePage();
				}
		}
		
		
	}
	


/*
 * 
 * -----------------------------------------------------------> Parking Issuse
 * 
 */
	
public void parking( ) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("""
			====================================================================
					PLEASE REGISTER YOUR PARKING COMPLAINT HERE
			===================================================================
			
			
			""");
	
	System.out.println("Type your PARKING COMPLAINT here");
	String complaint = sc.nextLine();
	System.out.println("YOUR PARKING COMPLAINT: " + complaint);
	System.out.println("""
				1. Press 1 to REGISTER your parking Complaint
				2. Press 2 to Cancel & move to Home Page
			""");
	
	int pk = sc.nextInt();
	
	while (pk < 0 && pk > 3) {
		System.out.println("Enter valid input");
		pk = sc.nextInt();
	}
	if(pk == 1 ) {
		System.out.println("Your parking Complaint has been Submited");
		userHomePage();

	} else if ( pk == 2){
		System.out.println("""
				Cancelling your parking Complaint Request
				Please Wait...
				Parking Complaint UNREGISTERED SUCCESSFULLY
				
				Mpving to Home Page
				""");
		
		userHomePage();
		
	}
	return ;
}
	/*
	 * 
	 * ----------------------------------------------------> Contact US
	 * 
	 */
	
	public void contactUs() {
		System.out.println("""
				================================================
						Conatct Us
				================================================
				
				
				""");
		
		System.out.println("Name: " + adminName);
		System.out.println("contact Number: " + adminNum);
		
		System.out.println("""
				1. Press 1 for Home Page
				2. Press 2 for Exit from Application
				""");
		if (sc.nextInt() == 1) {
			System.out.println("Moving to HOME PAGE ");
			System.out.println("Please Wait");
			userHomePage();
			
		} else {
			System.out.println("Do you really want to exit");
			System.out.println("Type Y for Yes & N for No");
			if (sc.next().charAt(0) == 'Y') {
				System.out.println("Exiting form Application");
				System.out.println("Please Wait");
				System.exit(0);
				
				} else {
					System.out.println("Moving to Home Page, Due to wrong Input");
					userHomePage();
				}
		}
		
	}

}
