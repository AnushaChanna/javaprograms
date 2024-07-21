package java_Programs;

public class A86_C26_P6_RemoveSmallLetters 
{
	public static void main(String[] args) {
		String name = "AnushA";
		String name1=name.replaceAll("[a-z]", "");
		System.out.println("given string value with capital and small letters >"+name);
		System.out.println("given string value after removing small letters >"+name1);
	}
}
