package Revision;

public class AccessDriver {

	public static void main(String[] args) {
		
		
		Admin a1=new Admin();
		
		a1.Privilage();
		
		
		
		Manager m1=new Manager();
		
		m1.Privilage();
		Admin a2=new Manager();
		a2.Privilage();
		
		
		
		
		
		
		
		
		Worker w1=new Worker();
		w1.Privilage();
		Admin a3=new Worker();
		a3.Privilage();
		
	}

}




//System.out.println("Manager Object is Created using Manager's REf. Variable");







/*

PlantHead p1=new PlantHead();
p1.Privilage();
System.out.println("Creating Object of PlantHead using Admin's Ref. variable");
Admin a2=new Manager();
a2.Privilage();

*/
