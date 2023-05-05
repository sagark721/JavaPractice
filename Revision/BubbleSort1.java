package Revision;

import java.util.Scanner;

public class BubbleSort1 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		System.out.println("Enter size of Array");
		int size=s.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the element "+(i+1));
			a[i]=s.nextInt();
		}

		System.out.println("Elements before sort");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		long beforeSort = System.currentTimeMillis();
		System.out.println("Elements after Sort");

		for (int j=0;j<a.length-1;j++) 
		{
			for (int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		long afterSort = System.currentTimeMillis();
		
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		
		long beforeSort1 = System.currentTimeMillis();
		System.out.println("Elements after Sort");

		for (int j=0;j<a.length-1;j++) 
		{
			for (int i=0;i<a.length-1-j;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		long afterSort1 = System.currentTimeMillis();
		
		
		double time=afterSort-beforeSort;
		double time1=afterSort1-beforeSort1;
		
		

		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Time required for -1: "+time);
		System.out.println("Time required for -1-j: "+time);
	}

}
