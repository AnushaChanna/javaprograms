package java_Programs;

public class A123_C39_StringBufferMethods 
{
	/*StringBuffer append, insert,replace,delete,reverse,charAt,capacity,length,
	substring(oneparameter),substring(oneparameter, two parameter)*/
	public static void main(String[] args) 
	{
		//stringbuffer
		StringBuffer s1=new StringBuffer("Anusha");
		System.out.println("Printing stingbuffer value >> "+ s1);
		//append
		StringBuffer s2=s1.append(" channa");
		System.out.println("Printing append value >> "+ s2);
		//insert
		StringBuffer s3=s1.insert(6, " Shetty");
		System.out.println("Printing insert value >> "+ s3);
		//replace
		StringBuffer s4=s1.replace(7, 13, ".");
		System.out.println("Printing replace value >> "+ s4);
		//delete
		StringBuffer s5=s1.delete(6, 8);
		System.out.println("Printing delete value >> "+ s5);
		//reverse
		StringBuffer N=new StringBuffer("Automation");
		System.out.println("Printing before reverse value >> "+ N);
		StringBuffer N1=N.reverse();
		System.out.println("Printing reverse value >> "+ N1);
//------------------------------------------------------------------------
		//charAt
		char s6=s1.charAt(7);
		System.out.println("Printing charAt value >> "+ s6);
		//capacity
		int s7=s1.capacity();
		System.out.println("Printing capacity value >> "+ s7);
		//length
		int s8=s1.length();
		System.out.println("Printing length value >> "+ s8);
		//substring(oneparameter)
		String  s9=s1.substring(7);
		System.out.println("Printing substring one para >> "+ s9);
		//substring(twoparameter)
		String  s10=s1.substring(0,6);
		System.out.println("Printing substring one para >> "+ s10);	
		}
}
