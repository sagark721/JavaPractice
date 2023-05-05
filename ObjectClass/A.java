package ObjectClass;

public class A implements Comparable{
	
	int id;
	String name;
	A(){}
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		A a1=(A)obj;
		return this.id==a1.id && this.name==a1.name;
	}
	
	public String toString() {
		return "id: "+id+ " Name: "+name;
	}
	
	public int compareTo(Object o) {
		A a1=(A) o;
		
		if (this.id>a1.id) {
			return 25;
		}
		else if(this.id<a1.id) {
			return -20;
		}
		else return 0;
	}
	
	
	

}
