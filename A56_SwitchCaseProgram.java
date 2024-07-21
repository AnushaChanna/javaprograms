package java_Programs;

import java.util.Scanner;

public class A56_SwitchCaseProgram 
{
public static void main(String[] args) 
{
	Scanner S1=new Scanner(System.in);
	int a = S1.nextInt();
	switch(a)
		{
			default : System.out.println("Please enter correct input");
						//break;
			case 1 : System.out.println("Launch Chrome Browser");
						//break;
			case 2 : System.out.println("Launch edge Browser");
						//break;
			case 3 : System.out.println("Launch mozilla firefox Browser");
						//break;
			case 4 : System.out.println("Launch opera Browser");
						//break;
		//default : System.out.println("Please enter correct input");
		}	
}
}
