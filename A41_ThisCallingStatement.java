package assignments;

public class A41_ThisCallingStatement 
{
	A41_ThisCallingStatement(int a)
	{
		this(10,3);
		System.out.println(a+10);							// o/p 4
	}
	A41_ThisCallingStatement(int a , int b)
	{
		this(2,2.2f);
		System.out.println(a+b-3);							// o/p 3
	}
	A41_ThisCallingStatement(int a , float b)
	{
		this("Anusha");
		System.out.println(a*b);							// o/p 2
	}
	A41_ThisCallingStatement(String name)
	{
		System.out.println("print String name Anusha"); 	// o/p 1
	}
	A41_ThisCallingStatement(int a , double b)
	{
		this(10);
		System.out.println(a+b);							// o/p 5
	}
	public static void main(String[] args) 
	{
		new A41_ThisCallingStatement(10,10.10);
		
	}
}
