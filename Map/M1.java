package Map;
import java.util.HashMap;

public class M1 {

	public static void main(String[] args) {
		HashMap<Integer,String> m1=new HashMap<>();
		
		m1.put(1, "Idly");
		m1.put(12, "Dosa");
		m1.put(3, "Bonda");
		m1.put(null, "momos");
		m1.put(null, null);
		m1.put(5, null);
		
		System.out.println(m1.get(null));
		System.out.println(m1.get(5));
		
		//System.out.println(m1);
		
	}

}
