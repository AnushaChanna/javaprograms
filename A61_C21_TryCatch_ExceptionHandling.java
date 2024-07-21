package java_Programs;

public class A61_C21_TryCatch_ExceptionHandling 
{
	public static void main(String[] args)
	{
		try 
		{
			int a= 1/0;
			System.out.println("print a value as infinite");
		}
		catch(ArithmeticException a1)
		{
			System.out.println("execute Catch block as A value cant be defined ");
		}
	}
}
