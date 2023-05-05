package ObjectClass;

import java.util.Comparator;

public class SortByPrice implements Comparator {
	
	public int compare(Object o1, Object o2) {
		Bike b1=(Bike) o1;
		Bike b2=(Bike) o2;
		
		if(b1.price>b2.price) {
			return 253;
		}
		else if (b1.price<b2.price) {
			return -1235;
		}
		else {
			return 0;
		}
	}

}
