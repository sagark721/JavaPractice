/*
 * WAJP to create char[] initialize with a,b,c,d and print all the elements in reverse order
 */

package Revision;

public class Array2 {

	public static void main(String[] args) {
		char[] ch= {'a','b','c','d'};
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}

	}

}
