package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class L15 {

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
		
		////// Iterator (remove()) ///////
		
		Iterator i=ls1.iterator();
		
		while(i.hasNext())
		{
			if ((Integer)i.next()==30)
			{
				i.remove();
			}
		}
		
		System.out.println(ls1);
		
		
		
		
		
		
		

	}

}
