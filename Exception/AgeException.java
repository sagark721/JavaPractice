/*
 * WAJP to create age exception
 * 1. Create one election class and throw the age exception if the age of voter is less than 18 years
 * 2. Create a AgeException  and handle it be giving message as "Voter is not authorized for voting" if age of vpter is less than 18
 * 
 * Create separate voter class and take one of the state as age
 */

package Exception;

public class AgeException extends Exception {
	static {
		System.out.println("Age is less than 18");
	}

}
