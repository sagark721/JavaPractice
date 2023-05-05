package Part_2.Ecapsulation;

public class E1 {
	private static int e1;
	static int e2;
	private int e3;
	int e4;
	
	static void sum()
	{
		System.out.println("Hello from sum()");
	}
	
	static int getE1()
	{
		return e1;
	}
	
	static void setE1(int e1)
	{
		E1.e1=e1;
	}
	
	public static void main(String[] args)
	{
		System.out.println(e1);
	}

}
