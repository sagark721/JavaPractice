package Part2;

public class thisAddress {

	public static void main(String[] args) {
		thisAddress t=new thisAddress();
		System.out.println("Address of t: "+t);
		t.thisAdd();
	}
	
	void thisAdd() {
		System.out.println("Address in 'this' : "+this);
	}

}
