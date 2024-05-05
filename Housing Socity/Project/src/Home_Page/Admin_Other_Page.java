package Home_Page;

import java.util.Scanner;

public class Admin_Other_Page extends Admin_Page  {
	
	Scanner sc = new Scanner(System.in);
	
	HomePage HP =new HomePage();
	Admin_Page AP = new Admin_Page();

	static String meeting;
	static String notice;
	static String event;
	static String parkingpts;
	
	
	
	public Admin_Other_Page()  { }



	public void option() {
		
		Admin_Other_Page AOP = new Admin_Other_Page();
//		HomePage HP =new HomePage();
		
		System.out.println("""
				====================================================================
							SOCITY UPDATION
				===================================================================
				
				1. Press 1 for Meeting
				2. Press 2 for Notice
				3. Press 3 for Event
				4. Press 4 for Parking
				5. Press 5 to go back
				""");
			
		switch(sc.nextInt()) {
		case 1 : {
			System.out.println("Moving to meeting");
			AOP.meeting();
			break;
			
		}
		case 2 : {
			System.out.println("Moving to Notice");
			AOP.notice();
			break;
		}
		case 3 : {
			System.out.println("Moving to event");
			AOP.event();
			break;
		}
		case 4 : {
			System.out.println("Moving to Paking");
			AOP.parking();
			break;
		}
		case 5 : {
			System.out.println("Going Back !!!");
			AP.option();
			break;
		}
		default : {
			System.out.println("Something Wrong");
			AOP.option();
			break;
		}
		} //swicth
	}
	
	
	public Admin_Other_Page(String meeting) {
		super();
		this.meeting = meeting;
	}



	public void meeting() {
		
		Admin_Other_Page AOP = new Admin_Other_Page();
		
		System.out.println("""
				====================================================================
							UPDATE MEETING POINT
				===================================================================
				
				Please write below
				""");
		String store = meeting;
//		Admin_Other_Page newM = new Admin_Other_Page(sc.nextLine());
		meeting = sc.nextLine();
		
		 System.out.println("""
					1. Press 1 to Update the Meeting Point 
					2. Press 2 to cancel
					3. Press 3 to go back
					""");
		
		 switch(sc.nextInt()) {
		 
			case 1 : {
				 System.out.println("Meeting Point Updated");
//				 System.out.println("Updated : " + newM.meeting);
				 System.out.println("Updated : " + meeting);
				 AOP.option();
				 break;
			 }
			case 2 : {
				System.out.println("No changes has made to meeting");
				
				System.out.println("Moving to Home Page");
				break;
			}
			case 3 : {
				System.out.println("Moving to Home Page");
				AP.option();
				break;	 
			}
			default : {
				System.err.println("Something Went Wrong");
				System.out.println("Moving to Home Page");
				option();
				break;
			}
		 }		//switch
		
		
		
	}

	
	public void notice() {
		Admin_Other_Page AOP = new Admin_Other_Page();
		
		System.out.println("""
				====================================================================
							UPDATE NOTICE 
				===================================================================
				
				Please write below in following formate
				""");
		
		String store = notice;
		notice = sc.nextLine();
		
		System.out.println("""
				1. Press 1 to Update the notice  
				2. Press 2 to cancel
				3. Press 3 to go back
				""");
	
	 switch(sc.nextInt()) {
	 
		case 1 : {
			 System.out.println("Notice Point Updated");
			 System.out.println("Updated : " + notice);
			 AOP.option();
			 break;
		 }
		case 2 : {
			System.out.println("No changes has made to Notice");
			notice = store;
			System.out.println("Moving to Home Page");
			break;
		}
		case 3 : {
			System.out.println("Moving to Home Page");
			AP.option();
			break;	 
		}
		default : {
			System.err.println("Something Went Wrong");
			System.out.println("Moving to Home Page");
			option();
			break;
		}
	 }	//swicth	
		
		
	}


	
	public void event() {
		Admin_Other_Page AOP = new Admin_Other_Page();
		
		System.out.println("""
				====================================================================
							UPDATE EVENT 
				===================================================================
				
				Please write below in following 
				""");
		
		String store = event;
		event = sc.nextLine();
		
		System.out.println("""
				1. Press 1 to Update the event  
				2. Press 2 to cancel
				3. Press 3 to go back
				""");
	
	 switch(sc.nextInt()) {
	 
		case 1 : {
			 System.out.println("Event Point Updated");
			 System.out.println("Updated : " + event);
			 AOP.option();
			 break;
		 }
		case 2 : {
			System.out.println("No changes has made to Event");
			event = store;
			System.out.println("Moving to Home Page");
			break;
		}
		case 3 : {
			System.out.println("Moving to Home Page");
			AP.option();
			break;	 
		}
		default : {
			System.err.println("Something Went Wrong");
			System.out.println("Moving to Home Page");
			option();
			break;
		}
	 }	//swicth
		
		
	}

	
	public void parking() {

		Admin_Other_Page AOP = new Admin_Other_Page();
		System.out.println("""
				====================================================================
							UPDATE PARKING NOTICE 
				===================================================================
				
				Please write below in following 
				""");
		
		String store = parkingpts;
		parkingpts = sc.nextLine();
		
		System.out.println("""
				1. Press 1 to Update the Parking notice  
				2. Press 2 to cancel
				3. Press 3 to go back
				""");
	
	 switch(sc.nextInt()) {
	 
		case 1 : {
			 System.out.println("Parking Notice Updated");
			 System.out.println("Updated : " + parkingpts);
			 AOP.option();
			 break;
		 }
		case 2 : {
			System.out.println("No changes has made to Parking Notice");
			parkingpts = store;
			System.out.println("Moving to Home Page");
			break;
		}
		case 3 : {
			System.out.println("Moving to Home Page");
			AP.option();
			break;	 
		}
		default : {
			System.err.println("Something Went Wrong");
			System.out.println("Moving to Home Page");
			option();
			break;
		}
	 }	//swicth
		
		
		
	}

	
	public void contactUs() {
		
		Admin_Other_Page AOP = new Admin_Other_Page();
		
		System.out.println("""
				====================================================================
							UPDATE CONTACT DETAILS 
				===================================================================
				
				Please write below in following 
				""");
		
		accName= sc.nextLine();
		accNum = sc.nextLine();
		accIFSC = sc.nextLine();
		UPI_ID = sc.nextLine();
		
		System.out.println("""
				Updation Done
				""");
	
	 
			 System.out.println("Account Info Updated Succesfully");
			 System.out.println("Name : " + accName);
			 System.out.println("Number : " + accNum);
			 System.out.println("IFSC : " + accIFSC);
			 System.out.println("UPI ID : " + UPI_ID);
			 AOP.option();

		
	}
	

}
