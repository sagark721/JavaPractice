package Part_2.Ecapsulation;

public class E2 {

	public static void main(String[] args) {
		//E1.e1=10;
		E1.e2=10;
		//E1.e3=10;
		//E1.e4=10;
		
		System.out.println(E1.getE1());
		
		E1.setE1(21);
		
		System.out.println(E1.getE1());
		
	}

}
