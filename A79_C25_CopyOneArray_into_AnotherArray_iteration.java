package assignments;

import java.util.Arrays;

public class A79_C25_CopyOneArray_into_AnotherArray_iteration 
{
	public static void main(String[] args) 
	{
		int real[]=new int[5];
		real[0]=12;
		real[1]=15;
		real[2]=43;
		real[3]=22;
		real[4]=32;
		
		int real_copy[]=new int[real.length];
		for (int i=0 ; i<real.length ; i++)
		{
			real_copy[i]=real[i];
		}
		System.out.println("Print real values >"+Arrays.toString(real));
		System.out.println("print the copied values "+ Arrays.toString(real_copy));	
	}

}
