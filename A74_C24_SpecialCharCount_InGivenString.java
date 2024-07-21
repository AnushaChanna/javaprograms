package java_Programs;

public class A74_C24_SpecialCharCount_InGivenString 
{
	static int alphabets=0;
	static int numerics=0;
	static int spaces=0;
	
	public static void main(String[] args) 
	{
	String A1="my name is anusha_channa @-1996/$ep"	;
			char C1[] =A1.toCharArray();
	for(int i=0; i<A1.length();i++)
	{
		boolean b1= Character.isLetter(C1[i]);
		boolean b2= Character.isDigit(C1[i]);
		boolean b3= Character.isSpaceChar(C1[i]);
		
		if(b1==true)
		{
			alphabets++;
		}
		if(b2==true)
		{
			numerics++;
		}
		if(b3==true)
		{
			spaces++;
		}
	}
	int count_of_SpecialCharacters = A1.length()-alphabets-numerics-spaces;
	System.out.println("count_of_SpecialCharacters = "+count_of_SpecialCharacters);
	}
}
