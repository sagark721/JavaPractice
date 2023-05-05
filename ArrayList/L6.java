package ArrayList;
import java.util.ArrayList;

public class L6 {

	public static void main(String[] args) {
		ArrayList <String>l1=new ArrayList<>();		
		
		l1.add("Vamsi");
		l1.add("Loves");
		l1.add("Priya");

		System.out.println("l1: "+l1);
		
		ArrayList <String>l2=new ArrayList<>();
		
		l2.add("Vamsi");
		l2.add("Loves");
		System.out.println("l2: "+l2);
		
		
		ArrayList <String>l3=new ArrayList<>();
		
		l3.add("Vamsi");
		l3.add("Mounika");
		System.out.println("l3: "+l3);
		
		l1.removeAll(l3);
		System.out.println(l1);
		
		
		
		
		
		
		
		
		
	}

}
