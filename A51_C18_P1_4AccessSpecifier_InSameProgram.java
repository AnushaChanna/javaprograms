package java_Programs;

public class A51_C18_P1_4AccessSpecifier_InSameProgram 
{
	public static void add()
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("print public static add value as " + sum);
	}
	private static void sub()
	{
		int a = 9;
		int b = 8;
		int sub = a-b;
		System.out.println("ptint private static sub value is "+ sub);
	}
	protected void mul ()
	{
		int a = 3;
		int b = 5;
		int mul = a*b;
		System.out.println("print protected non static mul value is "+ mul);
	}
	void div()
	{
		int a=8;
		int b=4;
		int div = a/b;
		System.out.println("Print default  nonstatic div value as "+ div);
	}
	/*public static void main(String[] args) 
	{
	 add();
	 sub();
	 A51_C18_P1_4AccessSpecifier_InSameProgram A1=new A51_C18_P1_4AccessSpecifier_InSameProgram();
	 A1.mul();
	 A1.div();
	}*/
	
	
	
	
	
	
}
