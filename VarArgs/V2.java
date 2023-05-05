package VarArgs;

public class V2 
{
	
	public static void add(int a, int b)
	{
		System.out.println( a+b);
	}
	
	
	
	public static void add1(int ... a)
	{
		
		
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}
	
	

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=a+b;
		//System.out.println(c);
		
		add(10,20);
		add1(10,20,30,40,50,60,70);
		
		
		
		int[]d= {10,20,30};
		
		// to print d
		
		System.out.println("d: "+d);
		for (int i=0; i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
		// to add all elements in d
		
		
		
		int sum=0;
		for (int i=0;i<d.length;i++)
		{
			sum=sum+d[i];
		}
		System.out.println("Sum of elements in d: "+sum);
		
		
		
		
		
	}

}
