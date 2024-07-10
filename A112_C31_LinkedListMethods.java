package assignments;

import java.util.LinkedList;

public class A112_C31_LinkedListMethods 
{
	public static void main(String[] args) 
	{
	LinkedList L1=new LinkedList();
	L1.add("apple");
	L1.add("ball");
	L1.add("cat");
	L1.add("dog");
	L1.add("egg");
	L1.add("fan");
	System.out.println(L1);
	//WAP in Methods of Linkedlist
	//addFirst, addLast, getFirst, getLast, removeFirst, removeLast, pollFirst and pollLast
	System.out.println("---------------------------------------------------------------");
//addFirst
	L1.addFirst("Ankle");
	System.out.println("add first > " +L1);
	System.out.println("---------------------------------------------------------------");
//addLast
	L1.addLast("forehead");
	System.out.println("add last > "+L1);
	System.out.println("---------------------------------------------------------------");
//getfirst
	L1.getFirst();
	System.out.println("get first > "+ L1);
	System.out.println("---------------------------------------------------------------");
//getlast
	L1.getLast();
	System.out.println("get last > "+L1);
	System.out.println("---------------------------------------------------------------");
//removefirst
	L1.removeFirst();
	System.out.println("remove first > "+ L1);
	System.out.println("---------------------------------------------------------------");
//removelast
	L1.removeLast();
	System.out.println("remove last >"+L1);
	System.out.println("---------------------------------------------------------------");
	
//pollfirst
	L1.pollFirst();
	System.out.println("poll first > "+ L1);
	System.out.println("---------------------------------------------------------------");
//polllast
	L1.pollLast();
	System.out.println("poll last >" +L1);
	System.out.println("---------------------------------------------------------------");
	
	System.out.println(L1);
	
	
	
	
	
	
	
	
	
	
	}
}
