package java_Programs;

public class A9_NestedIfElseProgram
{
	public static void main(String[] args) 
	{
		int x = 7;
		int y = 5;
		int z = 9;
		int a = 10;
		int b = 7;
		
		if (x==b)
			{
				if (y!=a)
				{
					System.out.println("y is not equals to a");
				}
				else
				{
					System.out.println("y equals to b");
				}
				if (z>x)
				{
					System.out.println("z is greater value");
				}
				else
				{
					System.out.println("x is greater value");
				}
			}
		else
			{
				System.out.println("a is the greatest value");
			}
	}
}
