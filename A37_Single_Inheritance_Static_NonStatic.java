package assignments;
class addsub //parentclass
{
	static void addition() 			// static method
	{
		int a = 10;
		int b = 9;
		int add=a+b;
		System.out.println("Print addition value -> " + add );
	}
	void substraction()				// Non-Static Method
	{
		int a = 90;
		int b = 100;
		int sub = a-b;
		System.out.println("Print substraction value -> " + sub);
	}
}

public class A37_Single_Inheritance_Static_NonStatic extends addsub
{
	static void multiply()				// static method
	{
		int a = 5;
		int b= 6;
		int mul =a*b;
		System.out.println("print multiply value ->" + mul);
	}
	void division()						// Non-Static Method
	{
		int a=8;
		int b=4;
		int div=a/b;
		System.out.println("print division value ->"+ div);
	}
	public static void main(String[] args) 
	{
		multiply();
		A37_Single_Inheritance_Static_NonStatic D1=new A37_Single_Inheritance_Static_NonStatic();
		D1.division();
		addition();
		D1.substraction();
	}
}
