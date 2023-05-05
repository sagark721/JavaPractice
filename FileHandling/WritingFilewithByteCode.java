package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFilewithByteCode {

	public static void main(String[] args) throws IOException {
		
		String path="D:\\Qspiders\\Java\\Part3\\FileHandlingFiles\\f4.txt";
		
		String text="India Is Great";
		
		FileOutputStream fout=new FileOutputStream(path);
		fout.write(text.getBytes());
		fout.close();
	}

}
