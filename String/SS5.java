/*
 * WAJP to verify the passward entered is valid or invalid
 * Conditions:
 * +++1. No of chars must be greater or equal to 10
 * 2. Atleast one Uppercase alphabet should be present
 * 3. Atleast one Lowercase alphabet should be present
 * 4. Atleast one Digit should be present
 * 5. Atleast one Sp. Char should be present
 * 6. Should not start with space.
 * 7. Should not end with Space
 * +++8. Should not exceeds 32 chars.
 */

package String;

import java.util.Scanner;

public class SS5 
{

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Password.");
		String password=sc1.nextLine();
		
		int uc=0;
		int lc=0;
		int digit=0;
		int spchar=0;
		
		char [] ch=password.toCharArray();
		
		for (int i=0;i<password.length();i++)
		{
			if (ch[i]>='A' && ch[i]<='Z')
			{
				uc++;
			}
			else if (ch[i]>='a' && ch[i]<='z')
			{
				lc++;
			}
			else if (ch[i]>='0' && ch[i]<='9')
			{
				digit++;
			}
			else
				spchar++;
		}
		
		
		if (password.length()>=10 && password.length()<=32 && !(password.startsWith(" ")) && !(password.endsWith(" ")) 
				&& uc>0 && lc>0 && digit>0 && spchar>0)
		{
		 System.out.println("Valid Password.");
			
		}
		else
			System.out.println("Invalid Password.");
		
	}

}
