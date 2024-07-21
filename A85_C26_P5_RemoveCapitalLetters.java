package java_Programs;

public class A85_C26_P5_RemoveCapitalLetters
{
	public static void main(String[] args) 
	{
		String name = "AnushA";
		String name1=name.replaceAll("[A-Z]", "");
		System.out.println("given string with capital letters >" +name);
		System.out.println("given string without capital letters >" +name1);
	}
}
