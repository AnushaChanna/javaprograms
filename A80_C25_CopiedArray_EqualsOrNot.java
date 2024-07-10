package assignments;

import java.util.Arrays;

public class A80_C25_CopiedArray_EqualsOrNot 
{
	public static void main(String[] args)
	{
		int A[]=new int[5];
		A[0]=11;
		A[1]=21;
		A[2]=22;
		A[3]=55;
		A[4]=13;
		
		int A_copy[]=new int[5];
		for (int i=0; i<A.length; i++)
		{
			A_copy[i]=A[i];
		}
		System.out.println("Real values are "+Arrays.toString(A));
		System.out.println("Copied value are > "+ Arrays.toString(A_copy));
		boolean output=Arrays.equals(A_copy, A);
		if(output==true)
		{
			System.out.println("Copied values are euqals to Real values");
		}
		else
		{
			System.out.println("Copied values are euqals to Real values");
		}
	}
}
