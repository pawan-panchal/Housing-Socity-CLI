package Home_Page;

import java.util.*;
import java.util.Map.Entry;

public class Data_Collection extends DriverClass {
	
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
	 
	static HashMap<String,String> ad_sc_rel = new HashMap<>(); // socity admin
	static HashMap<String,String> sc_mem_rel = new HashMap<>(); // member Socity
	
	public static void main(String[] args) {
		
		Data_Collection T = new Data_Collection();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("""
				1. Press 1 add Socity Name with Admin Name
				2. Press 2 add Member Name with Socity Name
				3. Press 3 to cancel and move to Home Page OR exit
				""");
	
		int d1 = Integer.parseInt(sc.nextLine());
		while(d1<0 || d1>4 ) {
			d1 = sc.nextInt();
		}
		
		if(d1 == 1 ) {
		
			/*
			 * 
			 * ----------------------------------------------------> To add Admin
			 * 
			 */
			System.out.println("How much admin-Socity data you want to add");
			
			int temp = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < temp; i++) {
				System.out.println("""
						1. Entry Admin Name
						2. Entry Socity Name
						
						""");
				String ad_name = sc.nextLine();
				String socity = sc.nextLine();
				
				T.ad_sc_rel.put(socity, ad_name );
				
			} //For loop
			
			System.out.println("Do you also want to add Socity member ");
			System.out.println("""
					1. Press 1 to add Socity member
					2. Press 2 to go home page
					
					""");
			/*
			 * 
			 * ----------------------------------------------------> To add member
			 * 
			 */
			if(sc.nextInt() == 1) {
				System.out.println("How much admin-Socity data you want to add");
				
				int temp1 = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < temp1; i++) {
					System.out.println("""
							1. Entry Member Name
							2. Entry Socity Name
							
							""");
					String mem_name = sc.nextLine();
//					sc.nextLine();
					String socity = sc.nextLine();
					T.sc_mem_rel.put(mem_name, socity);
					
				} //For loop
			} // if(sc.nextInt() == 1)
			else {
				T.main(null);
			}

		} else if(d1 == 2 ) {
			System.out.println("How much admin-Socity data you want to add");
			
			int temp1 = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < temp1; i++) {
				System.out.println("""
						1. Entry Member Name
						2. Entry Socity Name
						
						""");
				String mem_name = sc.nextLine();
//				sc.nextLine();
				String socity = sc.nextLine();
				T.sc_mem_rel.put(mem_name, socity);
		}
			
		System.out.println(T.ad_sc_rel);
		} else if(d1 == 3 ) {
			System.out.println("Exiting Application");
			System.exit(0);
		}
	}
	
//	private void add_ad_sty() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Entry the Socity Name");
//		System.out.println("Entry the Admin Name");
//		
//		ad_sc_rel.put(sc.nextLine(), sc.nextLine());
//	}
	
//	private void add_sty_mem() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Entry the Member Name");
//		System.out.println("Entry the Socity Name");
//		
//		sc_mem_rel.put(sc.nextLine(), sc.nextLine());
//	}
	
	
	/*
	 * 
	 * -------------------------------------------------------> To show Socity
	 * 
	 */
	
	private void ad_sct_data_collect() {
		
		Scanner sc = new Scanner(System.in);
		Data_Collection T = new Data_Collection();
		ArrayList<String> sty_list = new ArrayList();
		
		System.out.println("Entry Admin Name to get Socity List"); 
		
		String ad_name = sc.nextLine();
		
		boolean ad_present = ad_sc_rel.containsValue(ad_name);
		
		if(ad_present) {
			
			for (Entry<String, String> entry : ad_sc_rel.entrySet()) {
				String key = entry.getKey();
				String val = entry.getValue();
				
				if(ad_name.equals(val)) {
					sty_list.add(key);
				} // if loop	
			} // for loop
			
			int num = 1;
			for (String sty : sty_list) {
				
				System.out.println( num+ ". " + sty);
				num++;
			}
			
			
			
			System.out.println("""
					1. Press 1 to go home
					2. Press 2 for Member list
					3. Press 3 to search another admin Socity
					 
					""");
			switch(sc.nextInt()) {
			case 1 : {
			// Go Home
				T.main(null);
				break;
				}
			case 2 : {
				// Member List
				System.out.println("Entry the Socity number");
				T.sty_mem_data_collect(sty_list.get(sc.nextInt()-1));
				break;
				}
			case 3 : {
				// Search admin
				T.ad_sct_data_collect();
				break;
				}
			}
			
			
			System.out.println("Select the Socity:");
			int num_sty = sc.nextInt();
			
			
			
			
		} else {
			System.out.print("The entered admin name " );
			System.out.print("'" + ad_name + "'");
			System.out.println(" is not avalable in Admin list");
			
			System.out.println("Entry a valid name");
			T.ad_sct_data_collect();
		}
	}
	
	/*
	 * 
	 * -------------------------------------------------------> To show Member
	 * 
	 */
	private void sty_mem_data_collect(String name) {
		
		Scanner sc = new Scanner(System.in);
		Data_Collection T = new Data_Collection();
		ArrayList<String> mem_list = new ArrayList();
		
		for(Entry<String, String> entry : T.sc_mem_rel.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			
			if(name == val) {
				mem_list.add(key);
				
			}
			int temp =1;
			for (int i = 0; i < mem_list.size(); i++) {
				System.out.println(temp + ". " + mem_list.get(i));
				temp++;
						
			}
			
			
			
		}
		
		
			
	}
	

//	private void ad_sct_data_collect() {
//		
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> collected_sty = new ArrayList<> ();
//		
//		System.out.println("Entry Admin Name");
//		String ad = sc.nextLine();
//		boolean ad_name = ad_sc_rel.containsValue(ad) ;
//		
//		
//		//If Admin is name is present it will collect the Socity information
//		if(ad_name) {
//			System.out.println("Admin present");
//			Set s =  ad_sc_rel.keySet();
//			
//			for (Object ety : s ) {
//				System.out.println("for each loop");
//				
//				if(ad_sc_rel.get(s).equalsIgnoreCase(ad)) {
//					
//				}
//				
//				
//			} //for loop
//			
//			
//			
//		} else {
//			System.out.println("");
//		}
//		
//	}
	
}
