package java_Programs;

import java.util.Set;
import java.util.TreeSet;

public class A108_C30_AddMeth_SetInterface
{
	public static void main(String[] args)
	{
		//Checking indexing
	Set S1=new TreeSet();
	S1.add(54);
	S1.add(12);
	S1.add(1);
	S1.add(23);
	S1.add(0);
	System.out.println("Checking Indexing > " +S1);
	//Checking duplicate 
	S1.add(54);
	S1.add(54);
	System.out.println("Checking duplicate > " +S1 );
	//Checking null
	S1.add(null);
	S1.add(null);
	System.out.println("Checking null > " +S1 );
	}
}
