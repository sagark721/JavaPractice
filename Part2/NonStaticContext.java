package Part2;

public class NonStaticContext {
	int a=10;
	
	void print() {
		System.out.println(a);
	}

	public static void main(String[] args) {

		new NonStaticContext().print();
	}

}
