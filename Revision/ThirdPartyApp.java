package Revision;

public class ThirdPartyApp extends GmailDriver {

	public static void main(String[] args) {
		GmailDriver gd1=new GmailDriver();
		
		Gmail u1=gd1.getGmail();
		
		System.out.println(u1.username);
		//System.out.println(u1.location);
		System.out.println(u1.getLocation());
		
		

	}

}
