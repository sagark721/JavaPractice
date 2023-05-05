package Revision;

public class SubClass extends SuperClass {
	int State2;
	
	void behaviour()
	{
		System.out.println("Non Static Behaviour of Subclass");
	}
	
	

	public static void main(String[] args) {
		
		behaviour2();
		SubClass s1=new SubClass();
		s1.behaviour1();

	}

}
