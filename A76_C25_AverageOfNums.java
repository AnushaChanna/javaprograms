package java_Programs;

public class A76_C25_AverageOfNums
{
	static double sum = 0;
	static double average = 0;
	public static void main(String[] args) 
	{
		int value[]=new int[4];
		value[0]=10;
		value[1]=11;
		value[2]=32;
		value[3]=12;
		
		for(int i=0 ; i<value.length ; i++)
		{
			sum = sum+value[i];
		}
		System.out.println("the addition of 4 values "+ sum);
		average = sum/value.length;
		System.out.println("average of 4 values " + average);
	}
	
}
