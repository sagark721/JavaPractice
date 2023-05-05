/*
 WAJP to count number of Uppercase alphabets, Lowercase alphabets, digits and sp. chars present inside string 
*/
package String;

import java.util.Scanner; 

public class SS3 
{

	public static void main(String[] args) 
	{
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the String.");
		String s1=sc1.nextLine();
		
		int uc=0;
		int lc=0;
		int digits=0;
		int spchar=0;
		
		for (int i=0;i<s1.length();i++)
		{
			if (s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				uc++;
			}
			else if (s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				lc++;
			}
			else if (s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				digits++;
			}
			else
			{
				spchar++;
			}
		}
		
		System.out.println("UpperCase: "+uc);
		System.out.println("LowerCase: "+lc);
		System.out.println("Digits: "+digits);
		System.out.println("Special Characters: "+spchar);
		

	}

}
