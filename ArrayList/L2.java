package ArrayList;

import java.util.ArrayList;

public class L2 {

	public static void main(String[] args) {
		ArrayList<Object> a1= new ArrayList<>();
		a1.add("Idly");
		a1.add("Dosa");
		a1.add("KesariBhat");
		System.out.println("a1: "+a1); //[1,2,3]
		System.out.println("a1 Size: "+a1.size()); //3
		
		ArrayList<Object> a2= new ArrayList<>();
		a2.add("WadaPav");
		a2.add("PaniPuri");
		a2.add("Pulav");
		System.out.println("a2: "+a2); //[4,5,6]
		System.out.println("a2 Size: "+a2.size()); //[3]
		
		
		ArrayList<Object> a3= new ArrayList<>();
		a3.add(a1);
		System.out.println(a3);//[a1]
		System.out.println("a3 Size: "+a3.size());//[1]
		a3.add(a2);
		System.out.println(a3);//[a1,a2]
		System.out.println("a3 Size: "+a3.size());//[2]
		
		ArrayList<Object> a4= new ArrayList<>();
		//addAll()
		a4.addAll(a1);
		System.out.println(a4);//[1,2,3]
		System.out.println("a4 Size: "+a4.size());//[3]
		a4.addAll(a2); 
		System.out.println(a4); //[1,2,3,4,5,6]
		System.out.println("a4 Size: "+a4.size()); //[6]
		
		
		
		
		
		
		
		
		

	}

}
