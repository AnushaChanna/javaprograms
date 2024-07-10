package assignments;

public class A87_C26_P7_RemoveNumericValues
{
	public static void main(String[] args) 
	{
		String name = "Anusha2742";
		String name1= name.replaceAll("[0-9]", "");
		System.out.println("The given string with numeric values > "+name);
		System.out.println("The given string without numeric values > "+name1);
	}
	
}
