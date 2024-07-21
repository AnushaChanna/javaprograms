package java_Programs;

public class A66_C23_String_Functions 
{
	public static void main(String[] args)
	{
		//charAt(index)
		String name="my name is anusha";
		char A1=name.charAt(11);
		System.out.println("Print the 10th char of name is >> "+ A1);
		
		//indexofchar
		String name1="my name is anusha";
		int A2=name1.indexOf('a');
		System.out.println("Ptint index of char is >> "+A2);
		
		//trim
		
		String name2="    my name is anusha    ";
		System.out.println("print name with spaces >>"+name2);
		String A3=name2.trim();
		System.out.println("Print the name after Trim the space >>"+A3);
		
		//subString- Single
		
		String name3= "i have joined selinium course";
		//			   0123456789	
		String A4=name3.substring(5);
		System.out.println("input value for Substring-Single >>"+name3);
		System.out.println("Print the substring value of 5 >>"+A4);
		
		//subString- Double
		
		String name4="my name is anusha channa";
		//			  012345678901234567890123
		String A5=name4.substring(3, 17);
		System.out.println("input value for Substring-Double >>"+name4);
		System.out.println("Print the subtring value with double (3 , 17)>>"+A5);		
	}
}
