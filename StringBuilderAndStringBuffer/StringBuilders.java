package StringBuilderAndStringBuffer;

public class StringBuilders {

	public static void main(String[] args) throws InterruptedException {
		
		StringBuilder sb=new StringBuilder("india is great ");
		StringBuffer sbf=new StringBuffer("INDIA IS GREAT ");
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<sb.length();j++) {
				Thread.sleep(5000);
				System.out.print(sb.charAt(j));
				//System.out.println(sbf.charAt(j));
			}
		}
	
	}

}
