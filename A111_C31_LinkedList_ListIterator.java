package assignments;

import java.util.LinkedList;
import java.util.ListIterator;

public class A111_C31_LinkedList_ListIterator
{
	public static void main(String[] args) 
	{
		LinkedList A1=new LinkedList();
		A1.add("anu");
		A1.add("Angel");
		A1.add("anu's");
		A1.add("channa");
		A1.add("Automation");
		System.out.println(A1);
		
		ListIterator L1= A1.listIterator();
		while(L1.hasNext())
		{
			System.out.println(L1.next());
		}
		System.out.println("-------------------------------------------");
		
		while(L1.hasPrevious())
		{
			System.out.println(L1.previous());
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
