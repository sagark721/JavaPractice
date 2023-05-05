package Revision;

public class Driver1 {

	public static void main(String[] args) {
		Super1 s1=new Super1();
		System.out.println(s1.a);//10
		s1.print();// super print()
		
		Sub1 s2= new Sub1();
		System.out.println(s2.a);//25
		s2.print();//sub print()
		
		

	}

}
