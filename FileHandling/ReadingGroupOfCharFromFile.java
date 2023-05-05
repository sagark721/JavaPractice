package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingGroupOfCharFromFile {

	public static void main(String[] args) throws IOException {

		String path="D:\\Qspiders\\Java\\Part3\\FileHandlingFiles\\f4.txt";
		
		FileInputStream fin=new FileInputStream(path);
		
		while(fin.available()!=0) {
			System.out.println((char)fin.read());
		}
	}

}
