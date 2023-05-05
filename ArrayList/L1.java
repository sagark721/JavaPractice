

package ArrayList;
import java.util.ArrayList;

public class L1 {

	public static void main(String[] args) {
		ArrayList <Object> l1=new ArrayList<>();
		
		System.out.println(l1); //[]
		System.out.println(l1.isEmpty()); //true
		//add
		l1.add(10);
		l1.add(10.0);
		l1.add("Dinga");
		l1.add('A');
		l1.add(true);
		l1.add(null);
		System.out.println(l1); //[]
		//size()
		System.out.println(l1.size());//6
		//isEmpty()
		System.out.println(l1.isEmpty());//false

	}

}
