package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjectFromFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String path="D:\\Qspiders\\Java\\Part3\\FileHandlingFiles\\f5.txt";
		
		FileInputStream fin=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fin);
		
		Man m1=(Man)ois.readObject();
		
		System.out.println(m1.name);
		
	}

}
