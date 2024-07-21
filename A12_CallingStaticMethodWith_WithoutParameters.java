package java_Programs;

public class A12_CallingStaticMethodWith_WithoutParameters 
{
	static void addition()
	{
		int a=88;
		int b=12;
		int sum=a+b;
		System.out.println("Addition value without parameter is " + sum);
		}
	static void sum(int a)
	{
		int sum=a+0;
		System.out.println("With parameter print a value is " + sum);
	}
	public static void main(String[] args) 
	{
		addition();
		sum(100);
	}
}