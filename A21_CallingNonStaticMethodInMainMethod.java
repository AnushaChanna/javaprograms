package assignments;

public class A21_CallingNonStaticMethodInMainMethod
{
		void addition()
		{
			int a=7;
			int b=9;
			int sum=a+b;
			System.out.println("Addition value is "+sum);
		}
		void substracion()
		{
			int a=7;
			int b=9;
			int sub=a-b;
			System.out.println("substracion value is "+sub);
		}
		void multiplication()
		{
			int a=7;
			int b=9;
			int mul=a*b;
			System.out.println("multiplication value is "+mul);
		}
	public static void main(String[] args) 
	{
		A21_CallingNonStaticMethodInMainMethod Value=new A21_CallingNonStaticMethodInMainMethod();
		Value.addition();
		Value.substracion();
		Value.multiplication();
	}	
}
