package Revision;

import java.util.Scanner;

public class EmployeeDataUsing2DArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number of Employees: ");
		int emp_num=s.nextInt();
		System.out.println("Enter the Number of Days: ");
		int days_num=s.nextInt();
		
		int[][] data=new int[emp_num][days_num];
		
		for(int i=0;i<data.length;i++)
		{
			for (int j=0;j<data[i].length;j++)
			{
				System.out.println("Enter day "+(j+1)+" Hours for Employee: "+(i+1));
				data[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<data.length;i++)
		{
			System.out.print("Employee Number "+(i+1)+": ");
			
			for(int j=0;j<data[i].length;j++) {
					System.out.print(data[i][j]+" ");
				
				
			}
			System.out.println();
		}
	}

}
