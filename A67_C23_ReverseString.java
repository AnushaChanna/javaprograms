package java_Programs;

public class A67_C23_ReverseString
{
	public static void main(String[] args) 
	{
		String name = "anusha";
		String reverse="";
		
		for (int i=name.length()-1; i>=0 ; i--)
		{
			char A1=name.charAt(i);
			reverse = reverse+A1;
		//System.out.println("Reversing string value of anusha as >>"+reverse);
		}
		System.out.println("Reversing string value of anusha as >>"+reverse);
	}
}
