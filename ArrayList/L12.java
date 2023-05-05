package ArrayList;
import java.util.ArrayList;

public class L12 {

	public static void main(String[] args) {
		ArrayList ls1=new ArrayList();
		
		////////////////////////Adding//////////////////////////
		//add(Object)
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		ls1.add(40);
		
		System.out.println(ls1);
		
		ArrayList ls2=new ArrayList();
		
		ls2.add(100);
		ls2.add(200);
		ls2.add(300);
		ls2.add(400);
		
		System.out.println(ls2);
		
		
		ArrayList ls3=new ArrayList();
		
		//addAll(Collection)
		ls3.addAll(ls1);
		
		System.out.println(ls3);
		
		ArrayList ls4=new ArrayList();
		
		//add(Collection)
		ls4.add(ls2);
		
		System.out.println(ls4);
		
		
		
		//get(index)
		System.out.println(ls1.get(2));
		
		
		//add(index,object)
		ls1.add(4,50);
		System.out.println(ls1);
		
		//add(index,Collection)
		ls3.add(4,ls2);
		System.out.println(ls3);
		
		
		
		
		
		
		
		

	}

}
