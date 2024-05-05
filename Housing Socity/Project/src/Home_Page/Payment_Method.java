package Home_Page;

import java.util.Random;
import java.util.Scanner;

public class Payment_Method extends User_Payment_Page implements Payment_MTD {
	
	/*
	 * 
	 * ----------------------------------------------------------> Payment
	 * 
	 */
	
	@Override
	public void paymentMethod() {
		
		Scanner sc = new Scanner(System.in);
		HomePage HP = new HomePage();
		
		System.out.println("""
				===========================================================
								Payment
				===========================================================
				""");
		
		System.out.println("""
				===========================================================
						Select the Payment Method
				===========================================================
				
				1. UPI ID (Recommended)
				2. Credit/Debit Card
				3. NEFT
				4. Cash
				5. Exit
				6. HomePage
				""");
		
		
		
		
		switch (sc.nextInt()) {
		
			case 1 : {
				//UPI ID
				upiId();
				break;
			}
			case 2 : {
				//CREDIT CARD
				card();
				break;
			}
			case 3 : {
				//NETF
				neft();
				break;
			}
			case 4 : {
				//CASH
				cash();
				break;
			}
			case 5 : {
				//EXIT
				System.exit(0);
				return;	
			}
			case 6 : {
				//EXIT
				HP.userHomePage();
				return;	
			}
			default : {
				System.out.println("Sorry, Input was wrong");
				paymentMethod();
//			}
			
		}  //  Swicth
		} // else verifed
	}
	
	
	/*
	 * 
	 * -----------------------------------------> UPI Payment
	 *  
	 */
	@Override
	public void upiId()   {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		HomePage HP = new HomePage();
		
		System.out.println("""
				=================================================
						UPI PAYMENT
				=================================================
				""");
		System.out.println("Enter your UPI ID");
		sc.nextLine();
		System.out.println("""
				Are you sure, to make Payment
				1. Press 1 to CONFIRM
				2. Press 2 to CANCEL
				""");
		if(sc.nextInt() == 1 ) {
			System.out.println("Verifying Your Payment...");
			System.out.println("Please Wait...");
			
			// To Give delay of 3Sec
			System.out.println();
			try {
			Thread.sleep(10000);
			} catch (InterruptedException ref) {
				
			}
			
			System.out.println("Payment Done Successful !!!");
		
		} else {
			System.out.println("Cancelling UPI payment.");
			System.out.println("Please wait...");
		}
		
		System.out.println("""
				1. Go Back
				2. Main Menu 
				3. Advanced Payment
				4. Exit 
				""");
		
		switch (sc.nextInt()) {
		case 1 : {
//			 Go Back
			 option();
			 break;
			
		}
		case 2 : {
			// Main Menu Home Page
			System.out.println("Opening Home Page");
			HP.userHomePage();
			break;
		}
		case 3 : {
			//Advanced Payment
			System.out.println("Opening Advanced Payment");
			advPayment();
			break;
		}
		case 4 : {
			//Exit
			System.out.println("Exit" +random.nextInt(80) );
			System.exit(0);
		}
		default : {
			System.out.println("Enter a valid Input");
			System.out.println("Moving to Payment Option");
			option();
			break;
		}
		}
		
	}
	
	/*
	 * 
	 * -----------------------------------------> Credit card / Debit Card
	 *  
	 */
	@Override
		public void card() {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		User_Payment_Page PayMtd = new User_Payment_Page();
		HomePage HP = new HomePage();
		
		System.out.println("""
				=================================================
						CARD PAYMENT
				=================================================
				""");
		
		System.out.println("""
				1. Press 1 for DEBIT CARD
				2. Press 2 for CREDIT CARD
				""");
		
		int x =sc.nextInt();
		if(x == 1) {
			System.out.println("""
				==================================================
						PAYING THROUGH DEBIT CARD
				==================================================
				
			
					""");

			System.out.println("CARD NUMBER");
			sc.nextLong();
			
			System.out.println("CVV");
			sc.nextInt();
			System.out.println("MM/YY");
			sc.nextInt();
			
			System.out.println("""
					Are you sure, to make Payment
					1. Press 1 to CONFIRM
					2. Press 2 to CANCEL
					""");
			
			if( sc.nextInt()  == 1 ) {
				System.out.println("Verifying Your Payment...");
				System.out.println("Please Wait...");
				
				System.out.println();
				try {
				Thread.sleep(3000);
				} catch (InterruptedException ref) {
					
				}
				
				System.out.println("Payment Done Successful !!!");
			
			} else { 
				System.out.println("Cancelling DEBIT CARD payment.");
				System.out.println("Please wait...");
			}
			
			System.out.println("""
					1. Go Back
					2. Main Menu 
					3. Advanced Payment
					4. Exit 
					""");
			
			switch (sc.nextInt()) {
			case 1 : {
//				 Go Back
				 PayMtd.option();
				 break;
				
			}
			case 2 : {
				// Main Menu Home Page
				System.out.println("Opening Home Page");
				HP.userHomePage();
				break;
			}
			case 3 : {
				//Advanced Payment
				System.out.println("Opening Advanced Payment");
				PayMtd.advPayment();
				break;
			}
			case 4 : {
				//Exit
				System.out.println("Exit" +random.nextInt(80) );
				System.exit(0);
			}
			default : {
				System.out.println("Enter a valid Input");
				System.out.println("Moving to Payment Option");
				PayMtd.option();
				break;
			}
			}
			
		} //---------------------> if(sc.nextInt() == 1)
		else if (x == 2) {
			
			System.out.println("""
					==================================================
							PAYING THROUGH CREDIT CARD
					==================================================
					
		
						""");
				System.out.println("CARD NUMBER");
				sc.nextLong();
				System.out.println("CVV");
				sc.nextInt();
				System.out.println("MM/YY");
				sc.nextInt();
				
				System.out.println("""
						Are you sure, to make Payment
						1. Press 1 to CONFIRM
						2. Press 2 to CANCEL
						""");
				if(sc.nextInt() == 1 ) {
					System.out.println("Verifying Your Payment...");
					System.out.println("Please Wait...");
					
					System.out.println();
					try {
					Thread.sleep(3000);
					} catch (InterruptedException ref) {
						
					}
					
					System.out.println("Payment Done Successful !!!");
				
				} else { 
					System.out.println("Cancelling CREDIT CARD payment.");
					System.out.println("Please wait...");
				}
				
				System.out.println("""
						1. Go Back
						2. Main Menu 
						3. Advanced Payment
						4. Exit 
						""");
				
				switch (sc.nextInt()) {
				case 1 : {
//					 Go Back
					 PayMtd.option();
					 break;
					
				}
				case 2 : {
					// Main Menu Home Page
					System.out.println("Opening Home Page");
					HP.userHomePage();
					break;
				}
				case 3 : {
					//Advanced Payment
					System.out.println("Opening Advanced Payment");
					PayMtd.advPayment();
					break;
				}
				case 4 : {
					//Exit
					System.out.println("Exit" +random.nextInt(80) );
					System.exit(0);
				}
				default : {
					System.out.println("Enter a valid Input");
					System.out.println("Moving to Payment Option");
					PayMtd.option();
					break;
				}
				} //--------swicth
				
				
			
		} //---------------------> (sc.nextInt() == 2)
		else {
			System.out.println("""
					Something went wrong...
					Please try again...!
					""");
		}
	}

/*
 * 
 * -----------------------------------------> NEFT
 * 
 */

	@Override
	public void neft() {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		User_Payment_Page PayMtd = new User_Payment_Page();
		HomePage HP = new HomePage();
		
		System.out.println("""
				=================================================
						NEFT
				=================================================
				
				
				""");
		
		System.out.print("Enter UserName: ");
		sc.nextLine();
		System.out.println(); //to move next line
		System.out.print("Enter Password: ");
		sc.nextLine();
		System.out.println(); // to move next line
		
		System.out.println("""
				Please wait...
				Verifying your Details..
				Loggin Successful !!!
				""");
		
		
		System.out.println("""
				Are you sure, to make Payment
				1. Press 1 to CONFIRM
				2. Press 2 to CANCEL
				""");
		if(sc.nextInt() == 1 ) {
			System.out.println("Verifying Your Payment...");
			System.out.println("Please Wait...");
			
			System.out.println();
			try {
			Thread.sleep(3000);
			} catch (InterruptedException ref) {
				
			}
			
			System.out.println("Payment Done Successful !!!");
		
		} else { 
			System.out.println("Cancelling CREDIT CARD payment.");
			System.out.println("Please wait...");
		}
		
		System.out.println("""
				1. Go Back
				2. Main Menu 
				3. Advanced Payment
				4. Exit 
				""");
		
		switch (sc.nextInt()) {
			case 1 : {
				// Go Back
				 PayMtd.option();
				 break;
				
			}
			case 2 : {
				// Main Menu Home Page
				System.out.println("Opening Home Page");
				HP.userHomePage();
				break;
			}
			case 3 : {
				//Advanced Payment
				System.out.println("Opening Advanced Payment");
				PayMtd.advPayment();
				break;
			}
			case 4 : {
				//Exit
				System.out.println("Exit" +random.nextInt(80) );
				System.exit(0);
			}
			default : {
				System.out.println("Enter a valid Input");
				System.out.println("Moving to Payment Option");
				PayMtd.option();
				break;
			}
		} //--------swicth	
	
	}
	
	/*
	 * 
	 * -----------------------------------------> CASH
	 * 
	 */
	@Override
	public void cash() {
		Scanner sc = new Scanner(System.in);
		System.out.println("""
				=================================================
						CASH PAYMENT
				=================================================
				
				
				""");
		
		System.out.println("Confrom your Payment by OTP ");
		
		Random RND = new Random();
		int a = RND.nextInt(100,1000);
		System.out.println("OTP for user "  + a);
		
		while(a != sc.nextInt()) {
			System.err.println("Enter a valid digit");
			
		}
		
		System.out.println("CASH payment Successful");
		
	}

}
