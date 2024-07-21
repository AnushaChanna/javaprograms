package java_Programs;

import java.util.Scanner;

public class A34_AreaOfRectangle_ScannerClass 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	
	//area of a rectangle = length × width
	
	int length = s1.nextInt();
	int width = s1.nextInt();
	int areaofrectangle = length*width;
	System.out.println("print area of a rectangle value as "+areaofrectangle);
}
}

