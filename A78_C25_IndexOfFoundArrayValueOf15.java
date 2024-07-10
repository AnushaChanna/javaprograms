package assignments;

public class A78_C25_IndexOfFoundArrayValueOf15 
{
	static int find_the_value=15;
	public static void main(String[] args) 
	{
		int gvi[]=new int[5];
		gvi[0]=98;
		gvi[1]=15;
		gvi[2]=33;
		gvi[3]=22;
		gvi[4]=12;
		
		for (int i=0; i<gvi.length ; i++)
		{
			if(find_the_value==gvi[i])
			{
				System.out.println("the value 15 is present in the given array values");
				System.out.println("the index value of 15 is > "+i);
			}	
		}
	}
}
