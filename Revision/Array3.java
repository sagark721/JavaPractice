/*
 * WAJP to store city names in String array and print all the city names which are present at odd index
 */
package Revision;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=s.nextInt();
		
		String[] s1=new String [size];
		s.nextLine();
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Enter City Name "+(i+1));
			String name=s.nextLine();
			s1[i]=name;
		}
		
		for (int i = 0; i < s1.length; i++) {
			if (i%2!=0) {
				System.out.println(s1[i]);
				
			}
		}
		

	}

}
