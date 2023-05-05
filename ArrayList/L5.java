package ArrayList;
import java.util.ArrayList;

public class L5 {

	public static void main(String[] args) {
		ArrayList<String> l1=new ArrayList<>();
		
		l1.add("Ronaldo");
		l1.add("Sachin");
		l1.add("Virat");
		
		//indexOf()
		
		System.out.println(l1.indexOf("Virat"));
		System.out.println(l1.indexOf("Akhtar"));
		System.out.println(l1.indexOf("Afridi"));
		System.out.println(l1.indexOf("Ronaldo"));
		

	}

}
