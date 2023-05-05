package ArrayList;
import java.util.ArrayList;


public class L9 {

	public static void main(String[] args) {
		
		ArrayList<Object> l1=new ArrayList<>();
		
		l1.add('A');
		l1.add("Vamsi");
		l1.add(20);
		l1.add("Jaleel");
		l1.add("Sachinnnnn");
		l1.add(65);
		l1.add(10.21);
		l1.add(2);
		l1.add(2);
		
		
		System.out.println(l1);
		System.out.println(l1.size());
		
		l1.remove("Sachinnnnn");
		
		System.out.println(l1);
		System.out.println(l1.size());
		
		l1.remove(1);
		System.out.println(l1);
		System.out.println(l1.size());
		
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.size());
		
		
		Character ch=Character.valueOf('A');
		Character ch1='A';
		
		
		l1.remove('A');
		System.out.println(l1);
		System.out.println(l1.size());
		
		
		
		  
		
		

	}

}
