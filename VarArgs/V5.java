package VarArgs;

public class V5 {

	public static void main(String[] args) {
 add2(450,655);
	}
	public static void add2(double ...c)
	{
		double b=0;
		for(int i=0;i<c.length;i++)
		{
			b=b+c[i];
		}
		System.out.println(b);
     
}
}