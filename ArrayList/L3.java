package ArrayList;
import java.util.ArrayList;

public class L3 {

	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(50);
		
		System.out.println(a1);
		
		// to add 25 at index 2
		
		a1.add(2,25);
		System.out.println(a1);
		
		ArrayList<Object> a2=new ArrayList<>();
		
		a2.add(100);
		a2.add(200);
		a2.add(300);
		a2.add(500);
		System.out.println(a2);
		
		//to add 'a1' at index 2
		
		a2.add(2,a1);
		System.out.println(a2);
		System.out.println(a2.size());
		
		//addAll(int  index, collection)
		a2.addAll(4,a1);
		System.out.println(a2);
		System.out.println(a2.size());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
