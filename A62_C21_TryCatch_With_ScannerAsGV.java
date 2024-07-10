package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A62_C21_TryCatch_With_ScannerAsGV 
{
	static Scanner S1=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		try
		{
		System.out.println("Type your age below");
		int age = S1.nextInt();
		System.out.println("Mentioned age is " + age);
		
		System.out.println("Type your salary below");
		double salary = S1.nextDouble();
		System.out.println("Mentioned salary is " + salary);
		
		System.out.println("Type your_weight below");
		float your_weight = S1.nextFloat();
		System.out.println("Mentioned weight is " + your_weight);
		
		System.out.println("Type are_you_student as true or false below");
		boolean are_you_student = S1.nextBoolean();
		System.out.println("Mentioned stattement as "+ are_you_student);
		}
		catch (InputMismatchException A1)
		{
			System.out.println("Please give the valid inputs");
			
			System.out.println("Type your age below");
			Scanner S2=new Scanner(System.in);
			int age = S2.nextInt();
			System.out.println("Mentioned age is " + age);
			
			System.out.println("Type your salary below");
			Scanner S3=new Scanner(System.in);
			double salary = S3.nextDouble();
			System.out.println("Mentioned salary is " + salary);
			
			System.out.println("Type your_weight below");
			Scanner S4=new Scanner(System.in);
			float your_weight = S4.nextFloat();
			System.out.println("Mentioned weight is " + your_weight);
			
			System.out.println("Type are_you_student as true or false below");
			Scanner S5=new Scanner(System.in);
			boolean are_you_student = S5.nextBoolean();
			System.out.println("Mentioned stattement as "+ are_you_student);
		}	
	}

}
