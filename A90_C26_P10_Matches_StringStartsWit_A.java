package assignments;

public class A90_C26_P10_Matches_StringStartsWit_A 
{
	public static void main(String[] args) 
	{
	String name ="anusha";
	String name1="Ram";
	boolean b1=name.matches("a(.*)");
	boolean b2=name1.matches("a(.*)");
	System.out.println("the given string is > "+name);
	System.out.println("the given string starts with 'a' > "+b1);
	System.out.println("the given string is > "+name1);
	System.out.println("the given string starts with 'a' > "+b2);
	}
}
