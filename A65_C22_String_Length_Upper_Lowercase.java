package assignments;

public class A65_C22_String_Length_Upper_Lowercase 
{
	public static void main(String[] args)
	{
		//Length of the string
		
		String name = "my name is Anusha Channa";
		int A1=name.length();
		System.out.println("the length of the name is "+A1);
		
		//To Uppercase the string
		
		String A2=name.toUpperCase();
		System.out.println("changing lowercase to uppercase "+A2);
		
		//To Lowercase the string 
		
		String name1 = "MY NAME IS ANUSHA CHANNA";
		String A3 =name1.toLowerCase();
		System.out.println("Changing uppercase to lowercase "+A3);		
	}
}
