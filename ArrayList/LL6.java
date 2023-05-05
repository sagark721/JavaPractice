package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class LL6 
{
	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter m");
		int m=s1.nextInt();
		System.out.println("Enter m");
		int n=s1.nextInt();

		boolean a= false;
		int ma=0;
		ArrayList ls=new ArrayList();


		for (int i=0;i<=(m-n) ;i++,m++)
		{
			for (int j=2;j<=n ;j++ )
			{
				if (m%j!=0)
				{
					ls.add(m);
					
				}
			}
		
		}
		System.out.println(ls);
		
		
	}

}
