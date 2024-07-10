package assignments;

import java.util.Scanner;

public class A55_C19_SWITCHCase_2GV_ASMD
{
	static int a = 10;
	static int b = 14;
public static void main(String[] args)
		{
			Scanner S1=new Scanner(System.in);
			int c = S1.nextInt();
			switch(c)
				{
					case 1 : int sum = a+b;
							System.out.println("print addition value " + sum);
							break;
					case 2 : int sub = a-b;
							System.out.println("print substraction value " + sub);
							break;
					case 3 : int mul = a*b;
							System.out.println("print multiple value " + mul);
							break;
					case 4 : int div = a/b;
							System.out.println("print division value " + div);
							break;
					default : System.out.println("Please enter the correct value");
				}	
		}
}
