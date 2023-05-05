package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {

		String path="D:\\Qspiders\\Java\\Part3\\FileHandlingFiles\\f1.txt";
		
		FileInputStream fin=new FileInputStream(path);
		System.out.println(fin.available());
		System.out.println((char)fin.read());
		System.out.println(fin.available());
		System.out.println((char)fin.read());
		System.out.println(fin.available());
		System.out.println((char)fin.read());
		System.out.println(fin.available());
		System.out.println((char)fin.read());
		
		while(fin.available()>0) {
			System.out.println((char)fin.read());
		}
		
		fin.close();
	}

}
