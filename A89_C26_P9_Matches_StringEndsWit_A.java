package java_Programs;

public class A89_C26_P9_Matches_StringEndsWit_A
{
	public static void main(String[] args) 
	{
	String name = "anusha";
	boolean b1= name.matches("(.*)a");
	System.out.println("given string ends with 'a' >" +b1);
	}
}
