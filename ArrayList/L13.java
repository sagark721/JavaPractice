package ArrayList;
import java.util.ArrayList;

public class L13 {

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
		
		
		
		
		///////////////////////// Remove  ////////////////////////////
		
		//remove(index)
		ls1.remove(4);
		System.out.println(ls1);
		
		//remove(object)
		ls1.remove(Integer.valueOf(40));
		System.out.println(ls1);
		
		//removeAll(Collection)
		
		System.out.println(ls3);
		ls4.removeAll(ls1);
		System.out.println(ls4);
		
		ls3.addAll(ls1);
		System.out.println(ls3);
		System.out.println(ls1);
		
		//retainAll(Collection)
		ls3.retainAll(ls1);
		System.out.println(ls3);
		
		ArrayList ls5=new ArrayList();
		
		ls5.add(10);
		ls5.add(20);
		ls5.add(10);
		ls5.add(20);
		ls5.add(30);
		ls5.add(40);
		
		ArrayList ls6=new ArrayList();
		
		ls6.add(10);
		ls6.add(20);
		
		
		
		System.out.println(ls5);
		System.out.println(ls6);
		
		ls5.retainAll(ls6);
		System.out.println(ls5);
		
		
		
		////////////// Access  ////////////////////////
		
		
		
		

	}

}
