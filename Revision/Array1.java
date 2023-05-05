/*
 * WAJP to create the array object and print the elements, take input from user
 * 
 */

package Revision;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Size of array");
		int size=s.nextInt();
		
		int[] a1=new int[size];
		
		for (int i=0;i<a1.length;i++)
		{
			System.out.println("Enter the Element "+(i+1));
			int element=s.nextInt();
			a1[i]=element;
		}
		
		System.out.println("Elements in Array: ");
		
		for (int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		


	}

}
