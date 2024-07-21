package java_Programs;

public class A73_C24_SpaceCount_InGivenString
{
	static int Count_of_space=0;
	public static void main(String[] args) 
	{
	  String A1="my name is anusha_27_42"	;
	  char C1[]=A1.toCharArray();
	  for (int i=0 ; i<A1.length();i++)
	  {
		  boolean B1=Character.isSpaceChar(C1[i]);
		  if(B1==true)
		  {
			Count_of_space++;  
		  }		  
	  }
	  System.out.println("sount of spaces in the given string is > "+ Count_of_space);
	}
}
