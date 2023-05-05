// WAJP which will show ""constructor chaining"" within the class

package Revision;

public class S11 {
	
	int id;
	String name;
	double sal;
	
	S11()
	{
		System.out.println("From S11()");
	}
	
	S11(int id)
	{
		this();
		this.id=id;
		System.out.println("From S11(int)");
	}
	
	S11(int id, String name)
	{
		this(id);
		this.id=id;
		this.name=name;
		System.out.println("From S11(int, String)");
	}
	
	S11(int id,String name,double sal)
	{
		this(id,name);
		this.id=id;
		this.name=name;
		this.sal=sal;
		System.out.println("From S11(int, String, double)");
	}
	
	

	public static void main(String[] args) {
		S11 s=new S11(101,"Name1",21000);
	}

}
