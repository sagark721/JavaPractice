/*
WAJP to print the details of the object with the help of constructors
*/

package Revision;

public class S9 
{
	int a;
	
	S9(){
		System.out.println("From no-arg constructor");
	}
	

	public S9(int a) {
		super();
		this.a = a;
		
		System.out.println("a: "+a);
	}


	
}
