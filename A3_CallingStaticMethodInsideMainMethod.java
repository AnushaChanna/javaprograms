package assignments;

public class A3_CallingStaticMethodInsideMainMethod 
{
	public static void main(String[] args)
	{
		System.out.println("This is Main Method :" );
		assignment3();
		programname();
	}
		static void assignment3()
		{
			System.out.println("Assignment3 is"+ " This is Static Method");
		}
		static void programname()
		{
			System.out.println("programe name is" + " Calling Static Method Inside Main Method ");
		}
}
