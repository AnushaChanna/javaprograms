package java_Programs;

import java.util.Vector;

public class A114_C33_VectorMethods 
{
	public static void main(String[] args)
	{
		Vector v1=new Vector();
		v1.add("Anusha");
		v1.add("Rohitha");
		v1.add("Ram");
		v1.add(10);
		System.out.println("Printing V1 values >> "+ v1);
		v1.addElement("Channa");
		v1.addElement("dyno");
		System.out.println("Printing V1 value with add elements >>"+v1);
		System.out.println("Finding out the first element >> " +v1.firstElement());
		System.out.println("Finding out the last element >> " +v1.lastElement());
		System.out.println("Finding out the Capacity >> " +v1.capacity());
		
		Vector V2=new Vector();
		V2.add("anu");
		V2.add("ch");
		V2.add(1996);
		V2.add("RollNo27");
		System.out.println("Printing V2 values >> "+V2);
		V2.removeElement(1996);
		System.out.println("Removing element of 1996 >> "+V2);
		V2.removeElementAt(1);
		System.out.println("Removing element at index of '1' which is ch >> "+V2);
		V2.removeAllElements();
		System.out.println("After removing all elements of v2 >>"+ V2);
	}


}
