package ArrayList;
/*
WAJP to read the states of employee from the user (empid, name, sal). Ask the user the no. of employees is planning to store and then store their data, inside your list.
*/

import java.util.Scanner;
import java.util.ArrayList;


class LL2
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the No. of Employees to add.");
		int size=s1.nextInt();

		ArrayList ls=new ArrayList();
		int empid;
		String name;
		double sal;
		

		for (int i=1;i<=size ;i++ )
		{
			System.out.println("Enter the Employee ID");
			empid = s1.nextInt();
			
			System.out.println("Enter the Employee Name");
			name= s2.nextLine();

			System.out.println("Enter the Employee Salary");
			sal=s3.nextDouble();

			ls.add(new Employee1(empid,name,sal));

		}

		System.out.println(ls);
		ls.get(0);
		//ls.get(1);
		
		
	}
}
