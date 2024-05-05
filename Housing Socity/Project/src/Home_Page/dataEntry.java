package Home_Page;

import java.util.Scanner;

public class dataEntry extends Admin_Page {
	
//	dataEntry DE = new dataEntry();
	
	public void dataEntry() {
		
		Scanner sc = new Scanner(System.in);
		
//		Payment_Method payMtd = new Payment_Method();
//		HomePage HP = new HomePage();
	
		System.out.println("""
				=============================================================================
						DATA ENTRY
				=============================================================================
				
				1.Press 1 to check Pending Maintanance
				2.Press 2 to check  Advanced Payment
				3.Press 3 for General Fund 
				4.Press 4 for Repair Fund 
				5.Press 5 to know Accounr Detail Entered.
				6.Press 6 To Go Exit Home Page
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
					System.out.println("Moving to Admin Page");
					option(); //Admin Page method
					return;
				}
				default : {
					System.err.println("Somthing went wrong");
					dataEntry();
					break;
				}
		}	//switch
		
	}

/*
 * 
 * ---------------------------------------------------------------------> Maintanance
 * 
 */
	
	public void maintanance() {
		
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		dataEntry DE = new dataEntry();
		
		System.out.println("""
				Enter your Room Number to know Pending Maintance...
				""");
		sc.nextInt();
		int mtn = rm.nextInt(500, 1500);
		
		System.out.println("Maintance to pay: " + mtn);
		System.out.println("1. Press 1 to add " + mtn);
		System.out.println("Press any number to cancel");
		
		if(sc.nextInt() == 1) {
		System.out.println("Maintanance Added Successfully");
		}  //else {
		System.out.println("""
				1. Press 1 to add another maintanance
				2. Press 2 to Go Back
				3. Press 3 to exit from Application
				""");
		
			switch (sc.nextInt()) {
				case 1: {
						//To add another Maintanance 
						maintanance();
						break;
						}
				case 2: {
						//Go Back
						DE.dataEntry();
						break;
						}
				case 3: {
						//Exit 
						System.exit(0);
						break;
						}
				default : {
					// Default
					System.out.println("Moving to Data Entry Page");
					dataEntry();
						}
			}	//switch
		//}	//else
 		return;
		
	}
	
	/*
	 * 
	 * ---------------------------------------------------------------------> Advanced Payment
	 * 
	 */
	
	public void advPayment() {
		
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		dataEntry DE = new dataEntry();
		
		System.out.println("Enter the room No to pay the ADVANCED PAYMENT");
		sc.nextInt();
		System.out.println("Enter the amount you want to pay in Advanced");
		int advPayment = sc.nextInt();
		System.out.println("Are you sure, You want to Pay " + advPayment + " as a Advanced Payment");
		System.out.println("""
				1.Press 1 to conform
				2.Press 2 to change the Amount
				3.Press 3 to cancel & "Go Back"
			
				""");
		switch (sc.nextInt()) {
			case 1: {
				//Confirming payment
				System.out.println("Amount Added SUCCESSFULLY");
				System.out.println("Moving to data Page");
				dataEntry();
				break;
			}
			case 2: {
				System.out.println("Changing Amount");
				advPayment();
				break;
			}
			case 3: {
				System.out.println("Cancelling & Going Back");
				DE.dataEntry();
				return;
			}
			default : {
				System.out.println("Something went wrong, rerouting to Data Page");
				return;
			}
			
		}
		
	}
	
	/*
	 * 
	 * ---------------------------------------------------------------------> General Funds
	 * 
	 */

	public void generalFund() {

		Scanner sc = new Scanner(System.in);
		dataEntry DE = new dataEntry();
		
		System.out.println("""
				===========================================================
							General Funds
				===========================================================
				
				""");
		
		System.out.println("Enter the amount you want to pay in General Funds");
		int genFund = sc.nextInt();
		System.out.println("Are you sure, You want to Pay " + genFund + " as a General Funds");
		System.out.println("""
				1.Press 1 to conform
				2.Press 2 to change the Amount
				3.Press 3 to cancel & "Go Back"

				""" );
		
		switch (sc.nextInt()) {
			case 1: {
				//Confirming payment
				System.out.println("Amount Added SUCCESSFULLY");
				System.out.println("Moving to data Page");
				dataEntry();
				break;
			}
			case 2: {
				System.out.println("Changing Amount");
				advPayment();
				break;
			}
			case 3: {
				System.out.println("Cancelling & Going Back");
				DE.dataEntry();
				break;
			}
			default : {
				System.out.println("Something went wrong, rerouting to Data Page");
				return;
			}
		}	//Switch
				
	}
	
	/*
	 * 
	 * ---------------------------------------------------------------------> Repair Funds
	 * 
	 */

	public void repairFund() {
		
		Scanner sc = new Scanner(System.in);
		dataEntry DE = new dataEntry();
		
//		String temp = accNum; //test case ----- can delet
		
		System.out.println("""
				===========================================================
							Repair Funds
				===========================================================
				
				""");
		
		System.out.println("Enter the amount you want to pay in Repair Funds");
		int repairFund = sc.nextInt();
		System.out.println("Are you sure, You want to Pay " + repairFund + " as a Repair Funds");
		
		System.out.println("""
				1.Press 1 to conform
				2.Press 2 to change the Amount
				3.Press 3 to cancel & "Go Back"

				""" );
		
		switch (sc.nextInt()) {
			case 1: {
				//Confirming payment
				System.out.println("Amount Added SUCCESSFULLY");
				System.out.println("Moving to data Page");
				dataEntry();
				break;
			}
			case 2: {
				System.out.println("Changing Amount");
				advPayment();
				break;
			}
			case 3: {
				System.out.println("Cancelling & Going Back");
				DE.dataEntry();
				break;
			}
			default : {
				System.out.println("Something went wrong, rerouting to Data Page");
				return;
			}
		}	//Switch
		
	}
	
	/*
	 * 
	 * ---------------------------------------------------------------------> Account Details
	 * 
	 */
	
	public  void accDetails() {
		
		Scanner sc = new Scanner(System.in);
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
				To update Account Details 
				1. Press 1 to update
				2. Press 2 to Cancel
				""");
		
		if(sc.nextInt() == 1) {
			System.out.println("Account Name");
			sc.nextLine();
			accName = sc.nextLine();
			
			System.out.println("Account Number");
			accNum = sc.nextLine();
			
			System.out.println("Account IFSC");
			accIFSC = sc.nextLine();
			
			System.out.println("Account UPI ID");
			UPI_ID = sc.nextLine();
			
			System.out.println("Account Details Updated SUCCESSFULLY");
			
			System.out.println("Moving to Date Entry Page");
			dataEntry();
			return;
			
		} else {
			dataEntry();
			return;
		}
	}

}
