package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class S1 {
	
	static int fact1(int num) {
		if (num==1){
			return num;
		}
		return num=num*fact(num-1);
	}
	
	static int fact(int num) {
		if (num==1) {
			return num;}
		return num=num*fact(num-1);
		}
	

	static int fibo(int num) {
		if(num==1)
			return 0;
		
		else if(num==2)
			return 1;
		
		else
			return fibo(num-1)+fibo(num-2);
	}
	public static void main(String[] args) {

		HashSet s=new HashSet();
		
		s.add(1);
		s.add("A");
		s.add('B');
		
		for(Object o:s) {
			System.out.println(o);
		}
		
		
		ArrayList ls=new ArrayList(s);
		
		Iterator ijk=ls.iterator();
		System.out.println("From ArrayList");
		while(ijk.hasNext()) {
			System.out.println(ijk.next());
		}
		
		double b=10;
		String ss=Double.toString(b);
		System.out.println(ss+10);
		
		
		String s1="10";
		int s11=Integer.parseInt(s1);
		System.out.println(s11+25);
		
		int i3=25;
		Integer i33=Integer.valueOf(i3);
		System.out.println(i33);
		System.out.println(i33+10.0);
		
		Object i444=10;
		Integer i44=(Integer)i444;
		int i4=i44.intValue();
		
		for(int j=1;j<i4;j++) {
			System.out.println(fibo(j));
		}
		
		System.out.println(fact(5));
		
		System.out.println(fact1(6));
		
		int []a= {10,20,30};
		String aString = a.toString();
		System.out.println(aString);
		
		
		Object [] o1=new Object[3];
		o1[0]="A";
		o1[1]=1;
		o1[2]=10.5;
		
		for(int i=0;i<o1.length;i++) {
			System.out.println(o1[i]);
		}
		
	}

}
