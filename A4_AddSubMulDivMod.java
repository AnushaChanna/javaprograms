package java_Programs;

public class A4_AddSubMulDivMod
{
	public static void main(String[] args) 
	
	{	
		addition();
		substracion();
		multiplication();
		division();
		modulus();
	}

		static void addition()
			{
			int a = 6;
			int b = 8;
			int sum = a+b;
			System.out.println("addition: " + sum);
			}
		static void substracion()
			{
			int a = 6;
			int b = 8;
			int sub = b-a;
			 System.out.println("substraction: "+ sub);
			}
		static void multiplication()
			{
			int a = 6;
			int b = 8;
			int mul = a*b;
			System.out.println("multiplication: " + mul);
			
			}
		static void division()
			{ 
			int c = 10;
			double d = 12;
			double div = d/c;
			System.out.println("division: " + div);
			}
		static void modulus()
			{
			int c = 10;
			double d = 12;
			double mod = d%c;			
			System.out.println("modulus: " +mod);
			}

}


