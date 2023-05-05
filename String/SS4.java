/*
 * WAJP to read the string from user, Sort it, and print the chars without repeating any chars.
 */

package String;
import java.util.Scanner;

public class SS4 
{

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter String");
		String st1= sc1.nextLine();
		
		
		char [] ch= st1.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			for (int j=0;j<ch.length-1;j++)
			{
				if (ch[j]>ch[j+1])
				{
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		
		//String sortedstring=new String(ch);
		String st2="";
		for (int i=0;i<ch.length;i++)
		{
			if(!(st2.contains(""+ch[i])))
			{
				st2+=ch[i];
			}
		}
		
		System.out.println(st2);
		//System.out.println(st1);
		//System.out.println(st2);
	}

}
