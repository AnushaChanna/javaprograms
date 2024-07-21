package java_Programs;

import java.util.Scanner;

public class A32_Static_NonStatic_5operators_NextMethods
{
	static Scanner s1=new Scanner(System.in);
	
	static void add()
	{
		int a = s1.nextInt();
		int b = s1.nextInt();
		int sum = a+b;
		System.out.println("add value is " +sum);
	}
	static void sub()
	{
		int  a = s1.nextInt();
		int  b = s1.nextInt();
		int sub = a-b; // doubt why it has asked me to change byte to int
		System.out.println("sub value is " +sub);
	}
	static void mul()
	{
		int  a = s1.nextInt();
		int  b = s1.nextInt();
		int  mul = (a*b); // doubt why we have write (short)
		System.out.println("mul value is " +mul);
	}
	static void div()
	{
		int  a = s1.nextInt();
		int  b = s1.nextInt();
		int  div = a/b;
		System.out.println("div value is " +div);
	}
	void modulus()
	{
		double a = s1.nextFloat();
		double b = s1.nextFloat();
		double modulus = a%b;
		System.out.println("modulus value is " +modulus);
	}
	
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
		A32_Static_NonStatic_5operators_NextMethods M1=new A32_Static_NonStatic_5operators_NextMethods();
				M1.modulus();
	}
}
