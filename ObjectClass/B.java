package ObjectClass;

public class B  {
	int id;
	String name;
	
	B(){}
	public B(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public boolean equals (Object obj) {
		B b1=(B)obj;
		return this.id==b1.id && this.name==b1.name;
	}

}
