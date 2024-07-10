package assignments;

public class A97_C26_P17_Starts_S_4lettersbtw_Ends_h
{
	public static void main(String[] args) 
	{
		String name = "sarath";
		boolean b1=name.matches("s....h");
		boolean b2=name.matches("s(.*)h");
		System.out.println("Is the implementation is matching with string >"+b1);
		System.out.println("Is the implementation is matching with string >"+b2);
	}
}
