package ArrayList;

public class LLL1 
{
	static int a=10;
	static int b=0;
	
	public static void test1() throws ArithmeticException
	{
		int div=a/b;
		
		System.out.println("Div: "+div);
		
		test3();
	}
	
	public static void test2() throws ArithmeticException
	{
		test1();
		
		System.out.println("From test2 ()");
		
	}
	

	public static void main(String[] args) throws ArithmeticException
	{
		test2();

	}
	
	public static void test3() throws ArithmeticException
	{
		
		System.out.println("From test3 ()");
		
	}
	
	

}
