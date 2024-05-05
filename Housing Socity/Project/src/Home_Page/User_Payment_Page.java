package Home_Page;
import java.util.Random;
import java.util.Scanner;

public class User_Payment_Page extends HomePage {
	

	public void option() {
		
		Scanner sc = new Scanner(System.in);
		HomePage HP = new HomePage();
		Random rm = new Random();

		System.out.println("""
				1.Press 1 for Pending Maintannce Payment
				2.Press 2 for Advanced Payment
				3.Press 3 for General Fund
				4.Press 4 for Repair Fund
				5.Press 5 to know Accounr Detail.
				6.To Go Main Menu
				""");
		
		switch(sc.nextInt()) {
		case 1 : {
			//Payment
			maintanance();
			break;
		}
		case 2 : {
			//Advanced Payment
			advPayment();
			break;
		}
		case 3 : {
			//General Funds
			generalFund();
			break;
		}
		case 4 : {
			//Repair Funds
			repairFund();
			break;
		}
		case 5 : {
			// Account Details
			accDetails();
			break;
		}
		case 6 : {
			// Main Menu
			HP.userHomePage();
			break;
		}
		default : {
			
		}
		}
		
	}

	/*
	 * 
	 *-------------------------------------------------------> Maintance
	 * 
	 */
	

	public void maintanance() {
		
		System.out.println("""
				===========================================================
							MAINTANANCE
				===========================================================
				
				""");
		
		Scanner sc = new Scanner(System.in);
		Payment_MTD payMtd = new Payment_Method();
		Payment_Method pMtd = (Payment_Method) payMtd;
		
		
		HomePage HP = new HomePage();
		Random rm = new Random();
		
		System.out.println("""
				Enter your Room Num to know Pending Maintance...
				""");
		sc.nextInt();
		int mtn = rm.nextInt(500, 1500);
		
		System.out.println("Maintance to pay: " + mtn);
		System.out.println("1. Press 1 to pay " + mtn);
		System.out.println("""
				2. Press 2 for Payment Option
				3. Press 3 for Advanced Payment Option
				4. Press 4 for Account deatils
				5. Press 5 for general Funds
				6. Press 6 for Repair Funds
				7. Press 7 to Exit from application
				8. Press 8 to go in Main Menu
				""");
		
		switch (sc.nextInt()) {
		case 1 : {
			
			//Payment Method()
			payMtd.paymentMethod();
			break;
		}
		case 2 : {
			//Payment Option
			option();
			break;
				}
		case 3 : {
			//Advanced Payment
			advPayment();
			break;
		}
		case 4 : {
			//Account Details
			accDetails();
			break;
		}
		case 5 : {
			//general Funds
			generalFund();
			break;
			
		}
		case 6 : {
			//Repair Funds
			repairFund();
			break;
		}
		case 7 : {
			//Exit Application
			System.out.println("""
					Exiting Application
					Please Wait...
					Exit Successful
					""");
			System.exit(0);
			break;
		}
		case 8 : {
			//Main Menu
			HP.userHomePage();
			break;
			
		}
		default : {
			System.err.println("Please eneter valid input");
			maintanance();
		}
		}
	}

	
	/*
	 * 
	 *-----------------------------------------------------------> Advanced Payment
	 * 
	 */

	public void advPayment() {
		
		
		System.out.println("""
				===========================================================
							ADVANCED PAYMENT
				===========================================================
				
				""");
		
		Payment_MTD payMtd = new Payment_Method();
		HomePage HP = new HomePage();
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		System.out.println("Enter the room No to pay the ADVANCED PAYMENT");
		sc.nextInt();
		System.out.println("Enter the amount you want to pay in Advanced");
		int advPayment = sc.nextInt();
		System.out.println("Are you sure, You want to Pay " + advPayment + " as a Advanced Payment");
		System.out.println("""
				1.Press 1 to conform
				2.Press 2 to change the Amount
				3.Press 3 to cancel
				4.Press 4 to "Go Back"
				5.Press 5 to go Payment Option
				6.Press 6 to Exit Payment Option
				""");
		
		
			switch(sc.nextInt()) {
			case 1 : {
				//Confirm
				payMtd.paymentMethod();
				break;
			}
			case 2: {
				//Change Amount
				advPayment();
				break;
			}
			case 3 : {
				//Cancel Payment and move to home page
				HP.userHomePage();
				break;
			}
			case 4 : {
				//Go Back
				System.out.println("Moving to Home Page");
				option();
				break;
			}
			case 5 : { 
				//Payment Option
				System.out.println("Moving to Home Page");
				option();
				break;
			}
			case 6 : {
				//exit Payment to USer Home Page
				HP.userHomePage();
				break;
			}
			default : {
				System.err.println("""
						Something went wrong...
						Please Try Again !!!
						""");
				advPayment();
			}
		}	// Switch
	} 		// advPayment()
	

	/*
	 * 
	 * -------------------------------------------------------> Bank Account
	 * 
	 */

	public void accDetails() {
		
		Scanner sc = new Scanner(System.in);
		HomePage HP = new HomePage();
		
		System.out.println("""
				===========================================================
							Account Details
				===========================================================
				""");
		System.out.println("Account Name: " + accName);
		System.out.println("Account Number: " + accNum);
		System.out.println("IFSC Code: " + accIFSC);
		System.out.println("UPI ID: " + UPI_ID);
		
		
		System.out.println("""
				1. Press 1 to go Payment Option
				2. Press 2 to go for Pending Maintance
				3. Press 3 for Advanced Payment Option
				4. Press 4 for Home Page
				5. Press 5 to Exit from Application
				""");
		switch(sc.nextInt()) {
			case 1 : {
				//Payment Option
				System.out.println("Entering Payment Option");
				option();
				break;
			}
			case 2 : {
				//Pending Maintanance
				System.out.println("Entering Maintanance");
				maintanance();
				break;
			}
			case 3 : {
				//Advanced Payment
				System.out.println("Entering Advanced Option");
				advPayment();
				break;
			}
			case 4 : {
				//Home Page
				System.out.println("Entering Home Page");
				HP.userHomePage();
				break;
			}
			case 5 : {
				//Exit Application
				System.out.println("""
						Exiting Application
						Please Wait...
						Exit Successful
						""");
				System.exit(0);
				break;
			}
		}
		
	}

	/*
	 * 
	 * -----------------------------------------------------------> General fund
	 * 
	 */
	
	public void generalFund() {
		
		System.out.println("""
				===========================================================
							General Funds
				===========================================================
				""");
		
		Scanner sc = new Scanner(System.in);
		Payment_MTD payMtd = new Payment_Method();
		HomePage HP = new HomePage();
		Random rm = new Random();
		
		System.out.println("Enter the amount you want to pay in General Funds");
		int genFund = sc.nextInt();
		System.out.println("Are you sure, You want to Pay " + genFund + " as a General Funds");
		System.out.println("""
				1.Press 1 to conform
				2.Press 2 to change the Amount
				3.Press 3 to cancel
				4.Press 4 to "Go Back"
				5.Press 5 to go Payment Option
				6.Press 6 to Exit Payment Option
				""");
		
		
			switch(sc.nextInt()) {
			case 1 : {
				//Confirm
				payMtd.paymentMethod();
				break;
			}
			case 2: {
				//Change Amount
				generalFund();
				break;
			}
			case 3 : {
				//Cancel Payment and move to home page
				HP.userHomePage();
				break;
			}
			case 4 : {
				//Go Back
				System.out.println("Moving to Home Page");
				option();
				break;
			}
			case 5 : { 
				//Payment Option
				System.out.println("Moving to Home Page");
				option();
				break;
			}
			case 6 : {
				//exit Payment to USer Home Page
				HP.userHomePage();
				break;
			}
			default : {
				System.err.println("""
						Something went wrong...
						Please Try Again !!!
						""");
				generalFund();
			}
		}	// Switch
		
		
	}
	
	/*
	 *  
	 * -----------------------------------------------------------> Repair fund
	 *  
	 */
	public void repairFund() {
		
		System.out.println("""
				===========================================================
							Repair Funds
				===========================================================
				""");
		
		Scanner sc = new Scanner(System.in);
		Payment_MTD payMtd = new Payment_Method();
		HomePage HP = new HomePage();
		Random rm = new Random();
		
		System.out.println("Enter the amount you want to pay in Repair Funds");
		int repairFund = sc.nextInt();
		System.out.println("Are you sure, You want to Pay " + repairFund + " as a Repair Funds");
		System.out.println("""
				1.Press 1 to conform
				2.Press 2 to change the Amount
				3.Press 3 to cancel
				4.Press 4 to "Go Back"
				5.Press 5 to go Payment Option
				6.Press 6 to Exit Payment Option
				""");
		
		
			switch(sc.nextInt()) {
			case 1 : {
				//Confirm
				payMtd.paymentMethod();
				break;
			}
			case 2: {
				//Change Amount
				repairFund();
				break;
			}
			case 3 : {
				//Cancel Payment and move to home page
				HP.userHomePage();
				break;
			}
			case 4 : {
				//Go Back
				System.out.println("Moving to Home Page");
				option();
				break;
			}
			case 5 : { 
				//Payment Option
				System.out.println("Moving to Home Page");
				option();
				break;
			}
			case 6 : {
				//exit Payment to USer Home Page
				HP.userHomePage();
				break;
			}
			default : {
				System.err.println("""
						Something went wrong...
						Please Try Again !!!
						""");
				repairFund();
			}
		}	// Switch
		
	}
	
	/*
	 * 
	 * ------------------------------------------------>  MEETING
	 * 
	 */
	
public static void meeting() {
		
		System.out.println("Meeting Points");
//		System.out.println(HomePage.display); // Static variable
		
	}
} 
