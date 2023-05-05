package Revision;

public class S2 //static member in static context
{
	static int a=10;
	
	public static void test()
	{
		System.out.println(a+" from Static method of S2 directly.");
		System.out.println(S2.a+" from Static method of S2 with class name.");
		S2 ss= new S2();
		System.out.println(ss.a+" from Static method of S2 with object ref variable.");
		//System.out.println(this.a+" from Static method of S2 with 'this' keyword.");
		
	}
	
	static
	{
		System.out.println(a+" from Static Initializer of S2.");
	}
	
	
	{
		System.out.println(a+" From Non static intitalizers of S2");
	}
	
	public void test1()
	{
		System.out.println(a+" from Non Static method of S2 Directly.");
		System.out.println(S2.a+" from Non Static method of S2 with class name.");
		S2 ss= new S2();
		System.out.println(ss.a+" from Non Static method of S2 with object ref variable.");
		System.out.println(this.a+" from Non Static method of S2 with 'this' keyword.");
	}
	
	
	
	

	public static void main(String[] args) 
	{
		
		System.out.println("Main of S2 begin");
		test();
		
		S2 ss1=new S2();
		ss1.test1();
		
		System.out.println("Main of S2 End");
		
		//st init,mb,st mthd,me
		
	}

}
