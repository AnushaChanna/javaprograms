package java_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class A109_C30_Sorting 
{
public static void main(String[] args) 
{

	ArrayList A1=new ArrayList();
	A1.add(98);
	A1.add(100);
	A1.add(0);
	A1.add(3);
	A1.add(9);
	A1.add(18);
	System.out.println("Values before sorting > "+ A1);
	Collections.sort(A1);
	System.out.println("Values after sorting > "+ A1);
	
	
	
}
}
