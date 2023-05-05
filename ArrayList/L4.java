package ArrayList;
import java.util.ArrayList;

public class L4 {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<>();
		
		l1.add("Benz");
		l1.add("BMW");
		l1.add("Rolls_Royes");
		
		System.out.println(l1);
		
		
		
		System.out.println(l1.contains("BMW")); //true
		
		ArrayList<String> l2=new ArrayList<>();
		l2.add("Tata");
		l2.add("Mahindra");
		l2.add("Toyota");
		
		System.out.println(l2);
		
		ArrayList<Object> l3=new ArrayList<>();
		l3.add(l1);
		l3.add(l2);
		System.out.println(l3);
		System.out.println(l3.size());//
		
		
		ArrayList<String> l4=new ArrayList<>();
		l4.addAll(l1);
		l4.addAll(l2);
		
		System.out.println(l4);
		System.out.println(l4.size());
		
		//contains(object)
		
		System.out.println(l3.contains("BMW"));//false
		System.out.println(l3.contains(l1));//true
		
		System.out.println(l4.contains("BMW")); // true
		System.out.println(l4.contains(l1));
		
		//containsAll
		
		//System.out.println(l3.containsAll("BMW"));
		System.out.println("l3 contains l1: "+l3.containsAll(l1));
		
		
		ArrayList<String> l5=new ArrayList<>();
		
		l5.addAll(l1);
		System.out.println(l5);
		
		System.out.println(l5.containsAll(l1));
		
		ArrayList<String> l6=new ArrayList<>();
		l6.addAll(l1);
		System.out.println("L6: "+l6);
		l6.remove("BMW");
		System.out.println("L6: "+l6);
		
		System.out.println(l5.containsAll(l1));//true
		System.out.println(l6.containsAll(l1));//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
