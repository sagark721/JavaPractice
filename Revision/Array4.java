/*
 * WAJP to find sum of all elements of the array. create double datatype array
 */


package Revision;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=s.nextInt();
		double sum=0;
		
		double[] s1=new double [size];
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Enter number "+(i+1));
			double num=s.nextDouble();
			s1[i]=num;
		}
		
		for (int i = 0; i < s1.length; i++) {
			sum=sum+s1[i];
				
			}
		
		System.out.println("Sum of elements: "+sum);
		
		}

	}


