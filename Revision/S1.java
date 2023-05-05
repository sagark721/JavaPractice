//wajp to find sum of 2 ,3, 4 nums using var arg method

package Revision;

public class S1 
{
	public static int sum(int ... args )
	{
		int sum=0;
		
		for (int i=0;i<args.length;i++)
		{
			sum+=args[i];
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		System.out.println(sum(10,20,30,40));		
		
	}
	
}


