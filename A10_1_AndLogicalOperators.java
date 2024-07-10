package assignments;

public class A10_1_AndLogicalOperators 
{
public static void main(String[] args) 
{
	double a = 56.987;
	int b = 66;

	
	if(a!=988 && b>=65) // c1 - t , c2 - t - True 
	{
		System.out.println("1st statement is true");
	}
	if(a==56.987 && b > 100) // c1 - t , c2 - f - False
	{
		System.out.println("2nd statement is true");
	}
	if(a>188 && b != 188) // c1 -f , c2 - t - false
	{
		System.out.println("3rd statement is true");
	}
	if(a<56.986 && b < 45 ) // c1 - f, c2 - f - False
	{
		System.out.println("4th statement is true");		
	}
}
}
