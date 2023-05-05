package Exception;


public class E1 {
	
	static void div(int a, int b) {
		/*try {
			int res=a/b;
			System.out.println(res);
		}
		catch (ArithmeticException e) {
			System.out.println("Dont enter b value is Zero");
		}*/
		
		if(b==0) {
			System.out.println("1");
			throw new ZeroDenoException();
			
		}
		else {
			int res=a/b;
		}
	}

	

}
