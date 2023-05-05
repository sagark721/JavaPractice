package ObjectClass;

import java.util.Arrays;

public class EqualsAB {

	public static void main(String[] args) 
	{
		A a1=new A(101,"Maharashtra");
		A b1=new A(102, "Maharashtra");
		System.out.println(b1.id);
		System.out.println(a1.equals(b1));
		System.out.println(a1==b1);
		//A a2=new A();
		//B b2=(B) a2;
		//System.out.println(a2.equals(b2));
		
		A [] arr= new A[5];
		arr[0]=new A(1000,"Orange");
		arr[1]=new A(1,"Apple");
		arr[2]=new A(100,"Mango");
		arr[3]=new A(10000,"Chickoo");
		arr[4]=new A(10,"Banana");
		
		
		System.out.println("Elements of Array");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("After Sort");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("After Sort by name");
		Arrays.sort(arr,new CompareWithName());
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
