package ArrayList;
import java.util.ArrayList;

public class L7 {

	public static void main(String[] args) {
		ArrayList <String>l1=new ArrayList<>();
		
		l1.add("Jaleel Loves");		
		l1.add("Lavanya");
		l1.add("Bhumika");
		l1.add("Suraksha");
		l1.add("Kubrakhan");
		l1.add("Puja");
		l1.add("Akila");
		l1.add("Dipika");
		
		System.out.println("l1: "+l1);
		
		
		
		ArrayList <String>l2=new ArrayList<>();
		l2.add("Jaleel Loves");
		l2.add("Kubrakhan");
		l2.add("Puja");
		
		System.out.println("l2: "+l2);
		
		
		ArrayList <String>l3=new ArrayList<>();
		l3.add("Jaleel Loves");
		l3.add("Akila");
		l3.add("Dipika");
		l3.add("Tumkuru");
		
		System.out.println("l3: "+l3);
		
		//retainAll
		
		l1.retainAll(l3);
		System.out.println("l1: "+l1);
		
		
		
		

	}

}
