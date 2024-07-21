package java_Programs;

import java.util.Arrays;

public class A69_C23_Array_StoringNums 
{
public static void main(String[] args) {
	int rollno[]=new int[5];
	 rollno[0]=12;
	 rollno[1]=22;
	 rollno[2]=33;	 
	 rollno[3]=44;
	 rollno[4]=43;
	 //print output using array 
	 System.out.println(Arrays.toString(rollno));
	 
	 // WAP to store 5 names together
	 
		String name[]=new String[5];
		 name[0]="Anusha";
		 name[1]="Channa";
		 name[2]="Rohitha";
		 name[3]="ram";
		 name[4]="dyno";
		 
		System.out.println(Arrays.toString(name));
	 
	 // printing output using for loop
	/* for(int i=0;i<=4;i++)
	 {
		 System.out.println(rollno[i]);
	 }*/
}
}
