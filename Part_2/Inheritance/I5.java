package Part_2.Inheritance;

public class I5 {
	int acno;
	String name;
	
	I5(){}

	I5(int acno, String name)
	{
		this.acno=acno;
		this.name=name;
	}
	
	void details()
	{
		System.out.println("acno: "+acno+" name: "+name);
	}
	

}
