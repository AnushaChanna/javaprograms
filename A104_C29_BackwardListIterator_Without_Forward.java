package java_Programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class A104_C29_BackwardListIterator_Without_Forward 
{
	public static void main(String[] args) 
	{
		ArrayList A1=new ArrayList();
		A1.add("Anusha");
		A1.add("rohi");
		A1.add("ram");
		A1.add("dyno");
		A1.add(10);
		
		System.out.println(A1);
		
		System.out.println("Backward Iteration");
		
		ListIterator i1= A1.listIterator();
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
	}

}
