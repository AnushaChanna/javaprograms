package java_Programs;

public class A19_5ArthematicOperatorsUsingGlobalVariables //Static global variables
{
	static int a = 5;
	static int b = 6;
	
	static void addition()
	{
		int sum = a+b;
		System.out.println("print addition value is " + sum);
	}
	static void substrction()
	{
		int sub = a-b;
		System.out.println("print substraction value is " + sub);	
	}
	static void multiplication()
	{
		int mul = a*b;
		System.out.println("print multiplication value is " + mul);	
	}
	static void division()
	{
		double div = a/b;
		System.out.println("print division value is " + div);	
	}
	static void modulus()
	{
		double mod = a%b;
		System.out.println("print modulus value is " + mod);	
	}
	public static void main(String[] args) 
	{
		addition();
		substrction();
		multiplication();
		division();
		modulus();
	}

}