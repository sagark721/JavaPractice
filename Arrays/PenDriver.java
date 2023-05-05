package Arrays;

import java.util.Arrays;

public class PenDriver {

	public static void main(String[] args) {
		
		Pen[] p = new Pen [3];
		
		p[0]=new Pen(20,"Xello");
		p[1]=new Pen(10,"Montex");
		p[2]=new Pen(35,"Reynolds");
		
		Arrays.sort(p,new SortPenByBrand());
		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
	}

}
