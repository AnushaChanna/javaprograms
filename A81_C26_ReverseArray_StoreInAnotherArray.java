package java_Programs;

import java.util.Arrays;

public class A81_C26_ReverseArray_StoreInAnotherArray
{	
	static int A1=0;
	public static void main(String[] args)
	{
		int value[]= {11,22,33,44,55};
		
		int reverse[]=new int[value.length];
				for (int i=value.length-1 ; i>=0 ; i--)
				{
					reverse[i]=value[A1];
					A1++;
				}
				System.out.println("the given array values > " + Arrays.toString(value));
				System.out.println("the given array values > " + Arrays.toString(reverse));
	}
}
