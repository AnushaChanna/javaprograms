package java_Programs;
public class A124_C40_SIB_IIB_Cons 
{
	static 
	{
		System.out.println("SIB >>  Perform addition in constructor");
	}
	A124_C40_SIB_IIB_Cons()
	{
		int a= 10;
		int b = 5;
		int sum=a+b;
		System.out.println("constructor > " +sum);
	}
	{
		System.out.println("IIB > addition with a=10 and b=5");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method");
		new A124_C40_SIB_IIB_Cons();
	}

}