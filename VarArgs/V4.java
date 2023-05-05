package VarArgs;

public class V4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add2('a','b');
	}
public static void add2(char ...a)
{
	int b=0;
	for (int i=0;i<a.length;i++)
	{
		b=b+a[i];
	}
	System.out.println(b);
}
}
