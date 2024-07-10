package assignments;

import java.util.Arrays;

public class A75_C24_AnagramProg 
{
	public static void main(String[] args) 
	{
		String A1="act";
		String A2="cat";
		if (A1.length()!=A2.length())
		{
			System.out.println("Length is not matching its not a anagaram");
		}
		else
		{
			System.out.println(" length is matching need to verify clearly");
			
			char C1[]=A1.toCharArray();
			char C2[]=A2.toCharArray();
			Arrays.sort(C1);
			Arrays.sort(C2);
			System.out.println(Arrays.toString(C1));
			System.out.println(Arrays.toString(C2));
		
			boolean output = Arrays.equals(C1, C2);
			if (output == true)
			{
				System.out.println("Given string is a Anagram");
			}
			else
			{
				System.out.println("Given string is a Anagram");
			}
		}
	}
}
