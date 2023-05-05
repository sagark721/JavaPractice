package Part_2.Inheritance;

public class I6 extends I5 {
	double bal;
	String branch;
	
	I6(){}
	
	I6(double bal,String branch,int acno,String name)
	{
		super(acno,name);
		this.bal=bal;
		this.branch=branch;
	}
	
	void details()
	{
		System.out.println("bal: "+bal+" branch: "+branch+" acno: "+acno+" name: "+name);
	}

}
