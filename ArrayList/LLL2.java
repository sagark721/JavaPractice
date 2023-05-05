package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class LLL2 {
	
	/*
	WAJP to read the states of employee from the user (empid, name, sal). Ask the user the no. of employees is planning to store and then store their data, inside your list.
	*/

	


	

		public static void main(String[] args) 
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the No. of Employees to add.");
			int size=s1.nextInt();

			ArrayList ls=new ArrayList();
			
			for (int i=0;i<=size ;i++ )
			{
				System.out.println("Enter the Employee ID");
				int empid = s1.nextInt();
				
				System.out.println("Enter the Employee Name");
				String name= s1.nextLine();

				System.out.println("Enter the Employee Salary");
				double sal=s1.nextDouble();

				ls.add(new Employee(empid,name,sal));

			}

			System.out.println(ls);
		}
	}


