package java_Programs;

public class A68_C23_PalindromeString 
{
	public static void main(String[] args)
	{
		// Proving output is a palindrome
		System.out.println("Prove that output is a palindrome");
		
		String name1 ="malayalam";
		String reverse1="";
		
		for (int i=name1.length()-1; i>=0 ; i--)
		{
			char C1=name1.charAt(i);
			reverse1 = reverse1+C1;
		}
		System.out.println("input >>"+name1);
		System.out.println("output >>"+reverse1);
		
		boolean result =name1.equals(reverse1);
		System.out.println("Boolean value >>"+result );
		if(result==true)
		{
		System.out.println("TRUE - malayalam is a palindrome");
		}
		else
		{
			System.out.println("FALSE - malayalam is not a palindrome");
		}
		
		System.out.println();
		// Proving output is not a palindrome
		System.out.println("Prove that output is not a palindrome");
		String name="anushachanna";
		String reverse="";
		
		for (int i=name.length()-1; i>=0 ; i--)
		{
			char A1=name.charAt(i);
			reverse = reverse+A1;
		}
		System.out.println("input >>"+name);
		System.out.println("ouput >>"+reverse);
		
		boolean result1= name.equals(reverse);
		System.out.println("Print boolean value >>"+result1);
		if (result1 == true)
		{
			System.out.println("TRUE >> anushachanna is a palindrome");
		}
		else 
		{
			System.out.println("FALSE >> anushachanna is not a palindrome");
		}
		
		
	}
}
