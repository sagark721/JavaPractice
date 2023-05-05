package FileHandling;

import java.io.Serializable;

public class Man implements Serializable {
	
	int age;
	transient String name;
	
	void run() {
		System.out.println("Running...");
	}

	public Man(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	Man(){}
	
	



}
