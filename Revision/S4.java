package Revision;

public class S4 //Non static member in static context
{
	int a=10;
	
	public static void test()
	{
		//System.out.println(a+" from Static method of S2 directly.");
		System.out.println("NonStatic "+S2.a+" (of S4) from Static method of S4 with class name.");
		S4 ss= new S4();
		System.out.println("NonStatic "+ss.a+" from Static method of S4 with object ref variable.");
		//System.out.println("NonStatic "+this.a+" from Static method of S4 with 'this' keyword.");
		
	}
	
	
	
	
	{
		System.out.println("NonStatic "+a+" From Non static intitalizers of S4");
	}
	
	public void test1()
	{
		System.out.println("NonStatic "+a+" from Non Static method of S4 Directly.");
		//System.out.println("NonStatic "+S4.a+" from Non Static method of S2 with class name.");
		S4 ss= new S4();
		System.out.println("NonStatic "+ss.a+" from Non Static method of S4 with object ref variable.");
		System.out.println("NonStatic "+this.a+" from Non Static method of S4 with 'this' keyword.");
	}
	
	
	
	

	public static void main(String[] args) 
	{
		
		System.out.println("Main of S4 begin");
		test();
		
		S4 ss1=new S4();
		ss1.test1();
		
		System.out.println("Main of S4 End");
		
		//st init,mb,st mthd,me
		
	}

}
