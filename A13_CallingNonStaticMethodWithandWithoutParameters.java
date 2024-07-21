package java_Programs;
public class A13_CallingNonStaticMethodWithandWithoutParameters
{
	void addition()
	{
		int a= 10;
		int b = 22;
		int sum = a+b;
		System.out.println("print non static non parameter value " + sum);
	}
	void substraction(int a)
	{
		int sub = a-10;
		System.out.println("print non static parameter value " + sub);
	}
	public static void main(String[] args) 
	{
		A13_CallingNonStaticMethodWithandWithoutParameters value=new A13_CallingNonStaticMethodWithandWithoutParameters();
				value.addition();
				value.substraction(7);
	}
}
