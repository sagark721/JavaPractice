package Revision;

public class SchoolIDDriver {

	public static void main(String[] args) {
		SchoolID id= new SchoolID();
		
		System.out.println(id.schoolid);
		System.out.println(id.lid.labid);
		id.lid.currentBook();
	}

}
