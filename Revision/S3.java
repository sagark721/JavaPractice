package Revision;

public class S3 // static member in non static context 
{
	public static void test()
	{
		//System.out.println(a+" from Static method of S3 directly.");
		System.out.println(S2.a+" from Static method of S3 with class name.");
		S2 ss= new S2();
		System.out.println(ss.a+" from Static method of S3 with object ref variable.");
		//System.out.println(this.a+" from Static method of S2 with 'this' keyword.");
		
	}
	
	static
	{
		System.out.println(S2.a+" from Static Initializer of S3 with class name.");
	}
	
	
	{
		System.out.println(S2.a+" From Non static intitalizers of S2 with class name");
	}
	
	public void test1()
	{
		//System.out.println(a+" from Non Static method of S3 Directly.");
		System.out.println(S2.a+" from Non Static method of S3 with class name.");
		S2 ss= new S2();
		System.out.println(ss.a+" from Non Static method of S3 with object ref variable of S2.");
		//System.out.println(this.a+" (of S2) from Non Static method of S3 with 'this' keyword.");
	}
	
	
	
	

	public static void main(String[] args) 
	{
		
		System.out.println("Main of S3 begin");
		test();
		
		S2 ss1=new S2();
		ss1.test1();
		
		System.out.println("Main of S3 End");
		
		//st init,mb,st mthd,me
		
	}


}
