package WrapperClass;

public class W2 {

	public static void main(String[] args) {
		
		//Unboxing
		
		Integer a=10;
		int b=a.intValue();
		System.out.println(b);
		
		Double c=72.21;
		double d=c.doubleValue();
		System.out.println(d);
		
		
		String s1="10";
		int e=Integer.valueOf(s1);
		System.out.println("String: "+e);
	
		
		Integer f=Integer.parseInt(s1);
		System.out.println("Type of f: "+f.TYPE);
		
		double g=Double.parseDouble(s1);
		System.out.println(g);

	}

}
