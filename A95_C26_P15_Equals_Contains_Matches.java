package assignments;

public class A95_C26_P15_Equals_Contains_Matches 
{
public static void main(String[] args) 
{
	// equals -it is used to compare the two values are exactly equals to each other or not 
	String name = "my name is anusha";
	String name2=name.toUpperCase();
	String name3 = "MY NAME IS ANUSHA";
			boolean b1=name2.equals(name3);
			
		if(b1==true)
		{
			System.out.println("Checking equals --- yes");
		}
		else
		{
			System.out.println("Checking equals --- no");
		}
		
		//contains is used to check the Whether the given string contains the mentioned data or not
		
		boolean b2=name.contains("is");
		
		if (b2==true)
		{
			System.out.println("Checking contains --- yes");
		}
		else
		{
			System.out.println("Checking contains --- no");
		}
		
		/*matches is used to check whether the implemented data like check start and end letters
		or etc is matching with the given string or not */
	
		boolean b3 = name.matches("(.*)a(.*)");
		System.out.println(b3);
}
}
