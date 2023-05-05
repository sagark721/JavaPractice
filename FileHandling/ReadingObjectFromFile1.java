package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadingObjectFromFile1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String path="D:\\Qspiders\\Java\\Part3\\FileHandlingFiles\\f6.txt";
		FileInputStream fin = new FileInputStream(path);
		ObjectInputStream oin =new ObjectInputStream(fin);
		
		Man m2=(Man) oin.readObject();
		System.out.println(m2.name);
	}

}
