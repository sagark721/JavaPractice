package Map;

import java.util.HashMap;

public class M2 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		
		hm.put(1,"Pune");
		hm.put(2,"Delhi");
		hm.put(3,"Bangalore");
		hm.put(4,"Mumbai");
		
		System.out.println("Keyset: "+hm.keySet());
		System.out.println("Values: "+hm.values());
		System.out.println("EntrySet: "+hm.entrySet());
		System.out.println("Size: "+hm.size());
		System.out.println("Contains 3: "+hm.containsKey(3));
		System.out.println("Contains Pune: "+hm.containsValue("Pune"));
		System.out.println("Remove Delhi: "+ hm.remove(2));
		System.out.println("KeyValue present in map: "+hm.entrySet());
		System.out.println("Get Value at Key-1: "+hm.get(1));
		
		hm.entrySet();
		hm.values();
		hm.keySet();
		
		
	}

}
