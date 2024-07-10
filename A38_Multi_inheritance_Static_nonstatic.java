package assignments;
class parentclass1 extends parentclass2
{
	static int a =10;
	static int b = 10;
	static void add()
	{
		int sum = a+b;
		System.out.println("print Addition value >-" + sum);
	}
	void substract()
	{	
		int sub = a-b ;
		System.out.println("print substraction value >- "+ sub);
	}
}
class parentclass2
{
	static int a = 2;
	static int b = 4;
	static void multiply()
	{
		int mul = a*b;
		System.out.println("print multiply value >- " + mul);
	}
	void division()
	{
		int div = a/b;
		System.out.println("print division value >- "+ div);
	}
}
public class A38_Multi_inheritance_Static_nonstatic extends parentclass1
{ 
	static int a = 8;
	static int b =10;
	static void modulus()
	{
		int mod= a%b;
		System.out.println("print modulus value >- "+ mod);
	}
	void addition()
	{
		int add=a+b;
		System.out.println("print addition value >- " + add);
	}
	public static void main(String[] args) 
	{
		modulus();
		A38_Multi_inheritance_Static_nonstatic C1=new A38_Multi_inheritance_Static_nonstatic();
		C1.addition();
		add();
		C1.substract();
		multiply();
		C1.division();	
	}
}
