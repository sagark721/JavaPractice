/*
 WAJP to check whether the given string is palindrome or not
 */

package String;
import java.util.Scanner;

public class SS2 
{

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the String");
		String st1=sc1.nextLine();
		
		/*
		StringBuilder sb1=new StringBuilder(st1);
		StringBuilder sb1cpy=new StringBuilder(sb1);
		StringBuilder revstr=sb1.reverse();
		*/
		
		String revst1="";
		for (int i=st1.length()-1;i>=0;i--)
		{
			revst1=revst1+st1.charAt(i);
		}
		
		if (st1.equals(revst1))
		{
			System.out.println(st1+" is a Palindrom.");
		}
		else
			System.out.println(st1+" is Not Palindrom.");
		
		
		

	}

}
