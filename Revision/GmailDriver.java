package Revision;

public class GmailDriver {
	
	public static Gmail getGmail()
	{
		Gmail g1=new Gmail("sagar@gmail.com","Pass@123","Bangalore");
		return g1;
	}

	public static void main(String[] args) {
		Gmail g1=new Gmail();

		System.out.println(g1.username);
		System.out.println(g1.getLocation());
		g1.setPassword("Pass@789");
		System.out.println(g1.getPassword());
		
		
	}


}
