package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class L21
{

	public static void main(String[] args) 
	{
		ArrayList ls1=new ArrayList();
		
		////////////////////////Adding//////////////////////////
		//add(Object)
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		ls1.add(40);
		
		System.out.println(ls1);
		
		
		
		////////////// Access  ////////////////////////
		
		////// for Each loop  ///////
		
		for(Object a:ls1)
		{
			if((Integer)a==20)
			{
				//ls1.add(300);
				//ls1.remove((Integer)20);
				ls1.set(ls1.indexOf(a), 300);
			}
			
		}
		
		System.out.println(ls1);
		
		
}
}
