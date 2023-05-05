package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObjectToFile1 {

	public static void main(String[] args) throws IOException {

		String path="D:\\Qspiders\\Java\\Part3\\FileHandlingFiles\\f6.txt";
		
		FileOutputStream fout=new FileOutputStream(path);
		ObjectOutputStream oout= new ObjectOutputStream(fout);
		
		oout.writeObject(new Man(21,"Bappa"));
		oout.close();
		fout.close();
	}

}
