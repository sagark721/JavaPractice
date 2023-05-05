package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteCharToFile {

	public static void main(String[] args) throws IOException {

		String path="D:\\Qspiders\\Java\\Part3\\FileHandlingFiles\\f1.txt";
		
		FileOutputStream fout=new FileOutputStream(path);
		char ch='A';
		while(ch<='Z') 
		{
		fout.write(ch);
		ch++;
		}
		fout.close();
		
		String path1="D:\\Qspiders\\Java\\Part3\\FileHandlingFiles\\f2.txt";
		FileOutputStream fout1=new FileOutputStream(path1);
		int a=65;
		while(a<=90) {
		fout1.write(a);
		a++;}
		fout1.close();
	}

}
