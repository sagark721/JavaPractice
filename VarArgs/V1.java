package VarArgs;

class V1
{

	
	public static void add(int ... a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		add(10,20,10,20,3,0,30,50,40,60,80,10);
		
	}
	
	
	
}