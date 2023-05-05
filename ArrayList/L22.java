package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class L22 
{

	public static void main(String[] args) 
	{
		ArrayList ls=new ArrayList();
		
		ls.add(new Employee(107,"Sagar",121000.21));
		ls.add(new Employee(701,"Prashant",171000.71));
		ls.add(new Employee(321,"Somanath",300000.00));
		
		Collections.sort(ls);
		System.out.println(ls);
	}

}
