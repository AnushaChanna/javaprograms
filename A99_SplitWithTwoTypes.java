//WAP with split(string regex) & split(string regex, int index)
package assignments;

import java.util.Arrays;

public class A99_SplitWithTwoTypes 
{
	public static void main(String[] args)
	{	

	String value = "Hello World My Name Is Anusha";
	//split(string regex)
	String S1[]=value.split(" ");
	System.out.println("output of split(string regex) is > " + Arrays.toString(S1));
	
	//split(string regex, int index)
	String S2[]=value.split(" ", 3);
	System.out.println("output of split(string regex, int index) is > "+ Arrays.toString(S2));
	}
}
