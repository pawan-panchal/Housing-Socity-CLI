package Home_Page;

import java.util.Random;
import java.util.Scanner;

public class Admin_Page extends HomePage { 
	
	
	public void option() {
		
		Scanner sc = new Scanner(System.in);
		dataEntry DE = new dataEntry();
		Admin_Other_Page AOP =new Admin_Other_Page();
		Admin_Page AP = new Admin_Page();
		HomePage HP = new HomePage();
		
		
		
		System.out.println("""
				==========================================================================
						Welcome To The Admin Page
				==========================================================================
				
				
				""");
		
		System.out.println("""
				1. Press 1 for DATA ENTRY
				2. Press 2 for MEMBER INFORMATION
				3. Press 3 to logOut
				4. Press 4 to Exit
				""");
		
		switch (sc.nextInt()) {
			case 1 : {
				System.out.println("Moving to DATA ENTRY");
				DE.dataEntry();
				break;
				
			}
			case 2 : {
				//Member Information
				System.out.println("Entry Socity Name");
				String n = sc.nextLine();
				System.out.println("Entry Member Name");
				String sty = sc.nextLine();
				//Data connection remain 
				
				
				System.out.println("Moving to main Page");
				AP.option();
				break;
						
			}
			case 3 : {
				HP.login();
				break;
			}
			case 4 : {
				System.exit(0);
				break;
			}
			default : {
				AP.option();
				break;
			}
		}//switch
	}
	
	
}
