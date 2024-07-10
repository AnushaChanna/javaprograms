package assignments;

public class A8_IfElseIfProgram
{

	public static void main(String[] args) 
	{
		int n1 = 87;
		int n2 = 98;
		int n3 = 65;
		int n4 = 87;
		
		if (n3>n1) // false
			{
			 	System.out.println("n1 is greater value");
			}
			else if(n1!=n4) // false
			{
				System.out.println("n1 is equal to n4");
			}
			else if(n2<n1) //false
			{
				System.out.println("n2 is lower value");
			}
		else
		{
		System.out.println("n2 is the greatest value");
		}
		
	}
}
