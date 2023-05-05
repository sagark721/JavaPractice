/*
 * WAJP to create int Array and print all the elements of an array make use of advanced for loop in statement
 */

package Revision;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		
		int size=s.nextInt();
		
		int[] a=new int[size];
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the number "+(i+1));
			a[i]=s.nextInt();
		}
		
		for(int element:a)
		{
			System.out.println(element);
		}
		

	}

}
