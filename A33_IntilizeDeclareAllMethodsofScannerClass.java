package java_Programs;
import java.util.Scanner;
public class A33_IntilizeDeclareAllMethodsofScannerClass
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("give any name here >-");
		String name = s1.next();
		System.out.println("give a value here >-");
		byte a = s1.nextByte();
		System.out.println("give b value here >-");
		short b = s1.nextShort();
		System.out.println("give c value here >-");
		int c = s1.nextInt();
		System.out.println("give d value here >-");
		long d = s1.nextLong();
		System.out.println("give e value here >-");
		float e = s1.nextFloat();
		System.out.println("give f value here >-");
		double f = s1.nextDouble();
		System.out.println("give boolean value here >-");
		boolean g = s1.nextBoolean();
		
	}
}

