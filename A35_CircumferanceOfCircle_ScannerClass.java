package assignments;
import java.util.Scanner;
public class A35_CircumferanceOfCircle_ScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		//CircumferanceOfCircle = 2pir
		
		double Pivalue = s1.nextDouble();
		int r = s1.nextInt();
		double CircumferanceOfCircle = 2*Pivalue*r;
		System.out.println("print CircumferanceOfCircle value is"+CircumferanceOfCircle);
	
	}
}
