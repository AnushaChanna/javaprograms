package java_Programs;

public class A71_C24_NumericValues_InGivenString
{
	static int count_of_digit=0;
public static void main(String[] args) 
{
	String A1="50 CENT";
	char C1[]=A1.toCharArray();
	for (int i=0; i<A1.length(); i++)
	{
		boolean B1= Character.isDigit(C1[i]); 
		if(B1==true)
		{
			count_of_digit++;
		}
	}
	System.out.println("Numeric values present in the given string > " + count_of_digit);
}
}
