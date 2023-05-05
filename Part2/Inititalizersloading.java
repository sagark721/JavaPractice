package Part2;

public class Inititalizersloading {
	
	static {
		System.out.println(Inititalizersloading.a);}
	
	static int a=10;
	static {
		System.out.println(a);}
	
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
	}

}
