package ObjectClass;

import java.util.Comparator;

public class CompareWithName implements Comparator {

	public int compare(Object o1, Object o2) {
		A a1=(A)o1;
		A a2=(A)o2;
		return a1.name.compareTo(a2.name);
	}

}
