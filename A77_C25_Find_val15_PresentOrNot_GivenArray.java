package java_Programs;

public class A77_C25_Find_val15_PresentOrNot_GivenArray 
{
	static int find_the_value=15;
	public static void main(String[] args) 
	{
		int gv[]=new int[5];
		gv[0]=11;
		gv[1]=12;
		gv[2]=15;
		gv[3]=36;
		gv[4]=10;
		
		for(int i=0 ; i<gv.length; i++)
		{
			if(find_the_value==gv[i])
			{
				System.out.println("The value 15 is present in the given array values");
			}
		}
	}
}
