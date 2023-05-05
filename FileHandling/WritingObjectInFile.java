package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObjectInFile {

	public static void main(String[] args) throws IOException {

		String path="D:\\Qspiders\\Java\\Part3\\FileHandlingFiles\\f5.txt";
		
		FileOutputStream fout=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		
		oos.writeObject(new Man(28,"Sagar") );
		oos.close();
		fout.close();
		
	}

}
