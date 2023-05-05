package String;

public class S4 {

	public static void main(String[] args) {
		String s="INDIA is Great!";
		String s1="Incredible India";
		
		System.out.println(s + " in Uppercase = "+s.toUpperCase());
		System.out.println(s + " in Lowercase = "+s.toLowerCase());
		System.out.println(s.compareTo(s1));
		System.out.println( s.charAt(0));
		System.out.println(s.compareToIgnoreCase(s.toLowerCase()));
		System.out.println(s.concat(s1));
		System.out.println(s.contains("INDIA"));
		
		
		//
	}

}
