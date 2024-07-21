package java_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class A70_C23_Array_InputWithScanner
{
	static Scanner S1=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int rollno[]=new int[5];
		
		for(int i=0 ; i<rollno.length ;i++)
		{
			rollno[i]=S1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}		
		
		
		
		
		
		/*int student[]=new int[5];
		student[0]=S1.nextInt();
		student[1]=S1.nextInt();
		student[2]=S1.nextInt();
		student[3]=S1.nextInt();
		student[4]=S1.nextInt();
	System.out.println(Arrays.toString(student));*/
	
}
