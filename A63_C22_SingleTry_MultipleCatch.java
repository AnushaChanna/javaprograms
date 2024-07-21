package java_Programs;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class A63_C22_SingleTry_MultipleCatch 
{
	public static void main(String[] args)
	{
		int rollno[]=new int[3];
		rollno[0]=20;
		rollno[1]=30;
		rollno[2]=40;
		try
			{
			rollno[3]=40;
			}
		catch(ArrayIndexOutOfBoundsException A1)
			{
			System.out.println(" please check the limit and increase it ");
			}
		catch(NullPointerException A2)
			{
			System.out.println(" Facing NullPointerException ");
			}
		catch(InputMismatchException A3)
			{
			System.out.println(" Facing InputMismatchException ");
			}
		catch(IllegalFormatException A4)
			{
			System.out.println(" please check the limit and increase it ");
			}
	}
}
