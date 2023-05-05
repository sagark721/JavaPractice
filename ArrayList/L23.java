package ArrayList;

import java.util.ArrayList;

public class L23 {

	public static void main(String[] args) {
		ArrayList <Integer> al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		ArrayList<Integer> a2= new ArrayList<>();
		ArrayList<Integer> a3= new ArrayList<>();
		
		for(int i=0;i<al.size();i++) {
			if(!(a2.contains(al.get(i)))) {
			a2.add( al.get(i));		
			
			}
		else {
			System.out.println(a3.add(al.get(i)));
		}
		
		
		
		
	}
		System.out.println("Duplicates: ");
		System.out.println(a3);

}
}
