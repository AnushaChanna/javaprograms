package java_Programs;

public class A11_If_Else_If_ProgramWith_4_Else_If_Block 
{

	public static void main(String[] args)
	{
	 int a = 10;
	 int b = 20;
	 int c = 30;
	 int d = 5;
	 int e = 10;
	 
	 if (a==d) //false
	 	{
		System.out.println("a equals to d"); 
	 	}
	 	else if (a>b) //false
	 	{
		 System.out.println("a is greater than b");
	 	}
	 	else if (c<b) //false
	 	{
		 System.out.println("b greater than c");
	 	}
	 	else if(c<=d) //false
	 	{
		 System.out.println("C greater than d");
	 	}
	 	else if (a!=e) // false
	 	{
		 System.out.println("a not equals to e");
	 	}
	 else
	 {
		 System.out.println("C is greater than all values");
	 }
	}

}

