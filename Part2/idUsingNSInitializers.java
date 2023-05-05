package Part2;

public class idUsingNSInitializers {
	
	int id;
	static int count =100;
	{
		id=count++;
	}

	public static void main(String[] args) {
		idUsingNSInitializers i=new idUsingNSInitializers();
		System.out.println(i.id);
		idUsingNSInitializers i2=new idUsingNSInitializers();
		System.out.println(i2.id);
		idUsingNSInitializers i3=new idUsingNSInitializers();
		System.out.println(i3.id);
	}
}
