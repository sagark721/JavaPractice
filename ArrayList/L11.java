package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class L11 {

	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList<>();
		l1.add(10);
		l1.add(39);
		l1.add(143);
		l1.add(420);
		
		//System.out.println(l1);
		
		Iterator i = l1.iterator();
		
		Object o=39;
		l1.remove(o);
		
		System.out.println(l1);
		
		
		/*
		while(i.hasNext()) 
		{
			int a=((Integer)i.next()).intValue();
			if(a==39)
			{
				
				i.remove();
			}
		}
		
		System.out.println(l1);*/
		
	
		
		

	}
}








/*
 * while(i.hasNext())
		{
			Integer a=(Integer)i.next();
			
			if (a==39)
			{
				i.remove();
			}
			//System.out.println(i.next());
		}
 * */
 