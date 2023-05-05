package ArrayList;

public class Employee implements Comparable {
	
	int eid;
	String name;
	double sal;
	
	Employee(){}
	
	

	public Employee(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	
	



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	public int compareTo(Object o)
	{
		Employee e=(Employee)o;
		
		if (this.eid>e.eid)
			return 1;
		else if (this.eid<e.eid)
			return -1;
		else return 0; 
		
	}




}
