package String;

public class S5 {

	public static void main(String[] args) {
		String s="INDIA";
		System.out.println((s.concat(" is Great!"))==(s));
		
		StringBuilder s1=new StringBuilder("INDIA");

		System.out.println((s1.append(" is Great!"))==(s1));	
		}

}
