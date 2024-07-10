package assignments;
public class A15_CombOf_Method_Constructor_Overloading 
{

	static void addition(int a)
	{
		int sum = a+10;
		System.out.println("print int value is " + sum );
	}
	static void addition(double a , double b)
	{
		double sum = a+b+89;
		System.out.println("print double value "+ sum);
	}
	static void addition(char c)
	{
		System.out.println("print char value as A");
	}
	static void addition(boolean b)
	{
		System.out.println("Print boolean output");
	}
	A15_CombOf_Method_Constructor_Overloading(int a)
	{
		System.out.println("Print CO value as int ");
	}
	A15_CombOf_Method_Constructor_Overloading(float b)
	{
		System.out.println("ptint CO value as float");
	}
	A15_CombOf_Method_Constructor_Overloading(String c)
	{
		System.out.println("print CO string value as Anusha");
	}
	A15_CombOf_Method_Constructor_Overloading(char d)
	{
		System.out.println("print CO as character ");
	}
	
	public static void main(String[] args)
	{
		addition(10);
		addition(12.2 , 1.2);
		addition('A');
		addition(true);
		new A15_CombOf_Method_Constructor_Overloading(100);
		new A15_CombOf_Method_Constructor_Overloading(98.98f);
		new A15_CombOf_Method_Constructor_Overloading("Anusha");
		new A15_CombOf_Method_Constructor_Overloading('A');
	}

}