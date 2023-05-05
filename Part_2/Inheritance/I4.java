package Part_2.Inheritance;

public class I4 extends I3 {
	
	void test()
	{
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		System.out.println("From main of i4");
		I4 i4=new I4();
		System.out.println(i4.i);
	}

}
