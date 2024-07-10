package assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class A110_LinkedList_Iterator
{
	public static void main(String[] args) 
	{
		LinkedList A1=new LinkedList();
		A1.add("Automation");
		A1.add("Batch42");
		A1.add("Anusha");
		A1.add("Channa");
		A1.add(27);
		
		System.out.println(A1);
		
		System.out.println("LinkedListIterator Program WIth Forward Iteration");
		ListIterator i1=A1.listIterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("LinkedListIterator Program WIth Backward Iteration");
		
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
	}
}