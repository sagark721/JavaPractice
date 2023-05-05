package Revision;

public class S5 // static member in non static context 
{
	public static void test()
	{
		//System.out.println(a+" from Static method of S4 directly.");
		//System.out.println(S4.a+" from Static method of S3 with class name.");
		S4 ss= new S4();
		System.out.println("NonStatic "+ss.a+" of S3 from Static method of S3 with object ref variable.");
		//System.out.println(this.a+" from Static method of S2 with 'this' keyword.");
		
	}
	
	
	
	
	
	
	public void test1()
	{
		//System.out.println(a+" from Non Static method of S3 Directly.");
		//System.out.println(S4.a+" from Non Static method of S3 with class name.");
		S4 ss= new S4();
		System.out.println("NonStatic "+ss.a+" from Non Static method of S3 with object ref variable of S2.");
		//System.out.println("NonStatic "+this.a+" (of S2) from Non Static method of S3 with 'this' keyword.");
	}
	
	
	
	

	public static void main(String[] args) 
	{
		
		System.out.println("Main of S3 begin");
		test();
		
		S5 ss1=new S5();
		ss1.test1();
		
		System.out.println("Main of S3 End");
		
		//st init,mb,st mthd,me
		
	}


}
