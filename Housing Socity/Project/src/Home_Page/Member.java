package Home_Page;

import java.util.*;


public class Member extends HomePage{

	public Member(String memName, String memEmail, String memSocity,int memRoomNum, long memMobNum, String memUserName,
			String memPassword) {
		super();
		this.memName = memName;
		this.memEmail = memEmail;
		this.memSocity = memSocity;
		this.memRoomNum = memRoomNum;
		this.memMobNum = memMobNum;
		this.memUserName = memUserName;
		this.memPassword = memPassword;
	}

	@Override
	public String toString() {
		return ("Member Name: " + memName + " , Member Mobile: " + memMobNum + " , Room Num: " + memRoomNum);
		
		
	}
	
	public Member() {
		super();
	}

	
	/*
	 * 
	 * --------------------------------------------> Login
 	 *
	 */
//	@Override
	public void login() {
		
		Scanner sc = new Scanner(System.in);
		HomePage HP = new HomePage();
		Member M = new Member();
		
		System.out.println("Member Login");
		System.out.println("""
				Enter your Mobile Number
				Enter your Password
				""");
		long mob = Long.parseLong(sc.nextLine());

		String psw = sc.next();

		if(userMemList != null) {
//			System.out.println("memList size in Member login "+ userMemList.size());
//			System.out.println("Member List is non Empty");
			
			for (Member a : userMemList) {
				
//				System.out.println("for each loop working in login");

//					System.out.println(a.memMobNum);
//					System.out.println(a.memPassword);
					
					if (a.memMobNum==(mob) && a.memPassword.equals(psw)) {
							
							System.out.println("Moving to Home Page");
							System.out.println("Logged In SUCCESSFUL");
							userHomePage();
						} 
					
					else if (a.memMobNum!=(mob) && a.memPassword.equals(psw)) {
							System.err.println("Entered wrong Mobile Num");
//							 M.login();
						 }
				
				}
//			System.out.println("For loop excuted");	// to check condition of if list in non empty
			System.err.println("Invalid ID Pass");
			System.out.println("No such ID Password avalable");
			System.out.println("Moving to SignUp");
			HP.SignUp();
		} else {
			System.err.println("There are no Members in Data");
		}
	}	

}
