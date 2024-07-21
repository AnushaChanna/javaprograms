//WAP with equalsIgnoreCase, endswith, isEmpty & Repeat in String Class
package java_Programs;

import java.util.Arrays;

public class A98_ProgWithStringFunctions
{
	public static void main(String[] args) 
	{
		//equalsIgnoreCase
		
		String name="my name is anusha";
		String name1="MY NAME IS ANUSHA";
		boolean b1= name.equalsIgnoreCase(name1);
		System.out.println("1) output of equals ignore case is > "+ b1);
		
		//endswith
		boolean b2=name.endsWith("sha");
		System.out.println("2) Is the given string ends with 'sha' > "+b2);
		
		//isempty
		String S1=" ";
		boolean S2 = S1.isEmpty();
		System.out.println("3-i) output of is empty is >" +S2);
		System.out.println("(3-ii) " +S1.isEmpty());
		
		//repeat
		
		String repeat=name.repeat(10);
		System.out.println("4) Repeating the given string for 10 times > " + repeat);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
