package String;

public class S3 {

	public static void main(String[] args) {
		//char [] ch=new char[5];
		//ch[0]='A';
		//ch[1]='B';
		
		char[] ch= {'A','B','C','D'};
		
		//System.out.println(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		String s= new String(ch);
		
		System.out.println(s);
	}

}
