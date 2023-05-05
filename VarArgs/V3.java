package VarArgs;

public class V3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add1(10,20,30,50,80);
	}
public static void add1(int ...d)
{
	int sum =0;
	for (int i=0;i<d.length;i++)
	{
		sum=sum+d[i];
	}
	System.out.println(sum);
}
}
