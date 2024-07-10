package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A64_C22_FinallyWithTryCatch 
{
public static void main(String[] args) 
{
	try 
	{
		Scanner S1=new Scanner(System.in);
		System.out.println("Print A value");
		int A = S1.nextInt();
		System.out.println("A value is "+ A);
	}
	catch(InputMismatchException B1)
	{
		System.out.println("Enter Valid output");
		Scanner S2=new Scanner(System.in);
		System.out.println("Print A value again");
		int A1= S2.nextInt();
		System.out.println("A value is "+ A1);
	}
	finally
	{
		System.out.println("Execution Was successful , if not please enter the A value again");
	}
}
}
