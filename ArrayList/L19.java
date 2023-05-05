package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class L19 {

	public static void main(String[] args) {
		ArrayList ls1=new ArrayList();
		
		////////////////////////Adding//////////////////////////
		//add(Object)
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		ls1.add(40);
		
		System.out.println(ls1);
		
		
		
		////////////// Access  ////////////////////////
		
		////// ListIterator  ///////
		
		ListIterator i=ls1.listIterator();
		
		System.out.println("Forward");
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("Reverse");
		
		
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		
		
		
		/////////     Addition   ////////////
		System.out.println("Adding 25 after 20");
		
		while(i.hasNext())
		{
			if ((Integer)i.next()==20)
			{
				i.add(25);
			}
		}
		
		while(i.hasPrevious())
		{
			i.previous();
		}
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		
		
		

	}

}
