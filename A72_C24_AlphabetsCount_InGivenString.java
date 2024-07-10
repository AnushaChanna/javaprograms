package assignments;

public class A72_C24_AlphabetsCount_InGivenString
{
	static int Count_of_alphabets=0;
	public static void main(String[] args)
	{
		String A1 = "anusha_27_42";
		char C1[]=A1.toCharArray();
		for (int i=0 ; i<A1.length();i++)
		{
			boolean B1=Character.isAlphabetic(C1[i]);
			if (B1==true)
			{
				Count_of_alphabets++;
			}
		}
		System.out.println("Alphabets count in given string >" + Count_of_alphabets);
	}

}
