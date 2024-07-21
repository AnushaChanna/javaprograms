package java_Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class A105_C29_IterationProgram 
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
		
		System.out.println("Iteration Program using iterator");
		
		Iterator i1= A1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}	
	}
}