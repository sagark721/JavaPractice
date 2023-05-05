/*
 * WAJP for Bubble sort
 */

package Revision;

import java.util.Scanner;

public class Array6 {
	
	static int[] bubbleSort(int[] a1)
	{
		for(int j=0;j<a1.length-1;j++) {
			//System.out.println("j"+j);
		for (int i = 0; i < a1.length-1; i++) {
			//System.out.println("i"+i);
			if(a1[i]>a1[i+1])
			{
				int temp=a1[i];
				a1[i]=a1[i+1];
				a1[i+1]=temp;
			}
		}
		}
		return a1;
	}
	
	
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");

		int size=s.nextInt();

		int[] a1=new int[size];

		for (int i = 0; i < a1.length; i++) {
			System.out.println("Enter the Element"+(i+1));
			a1[i]=s.nextInt();
		}

		System.out.println("Elements before sort");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		for(int j=0;j<a1.length-1;j++) {
			//System.out.println("j"+j);
		for (int i = 0; i < a1.length-1; i++) {
			//System.out.println("i"+i);
			if(a1[i]>a1[i+1])
			{
				int temp=a1[i];
				a1[i]=a1[i+1];
				a1[i+1]=temp;
			}
		}
		}

		System.out.println("Elements after sort");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		
		int[]a2= {2,5,2,3,4,1,0,21};
		System.out.println("By Method");
		System.out.println(bubbleSort(a2));




	}

}
