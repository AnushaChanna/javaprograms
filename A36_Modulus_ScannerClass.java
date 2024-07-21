package java_Programs;

import java.util.Scanner;

public class A36_Modulus_ScannerClass 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	
	int a = s1.nextInt();
	int b = s1.nextInt();
	int modulus = a%b;
	System.out.println("print modulus value >-" + modulus);	
}
}
