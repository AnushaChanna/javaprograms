package assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class A110_C31_LinkedList_Iterator
{
	public static void main(String[] args) 
	{
		LinkedList A1=new LinkedList();
		A1.add("Anu");
		A1.add("Rohi");
		A1.add("ram");
		A1.add("dyno");
		A1.add("channa");
		
		System.out.println(A1);
		
		Iterator i1= A1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
