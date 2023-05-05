package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class L17 {

	public static void main(String[] args) {
		ArrayList ls1=new ArrayList();
		
		////////////////////////Adding//////////////////////////
		//add(Object)
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		ls1.add(40);
		
		System.out.println(ls1);
		
		
		
		///////////////////    Access  ////////////////////////
		
		////// get(index) ///////
		
		System.out.println(ls1.get(3));
		
		
		ArrayList ls2=new ArrayList();
		ls2.add(new Marker("Red",10));
		ls2.add(new Marker("Black",20));
		ls2.add(new Marker("Blue",30));
		
		
		for (Object o:ls2)
		{
			Marker m1=(Marker) o;
			if(m1.price==10)
			{
				m1.price=100;
			}
		}
		
		System.out.println(ls2);
				
		
		
		
		
		
		

	}

}
