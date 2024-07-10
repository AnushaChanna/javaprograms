package assignments;

public class A30_MathRandom_AOC // AOC - Area Of Circle
{
	static double pi_value= Math.PI;
	public static void main(String[] args) 
	{
		double r = Math.random();
		double AreaOfCircle = pi_value*r*r;
		System.out.println(AreaOfCircle);
		
	}
}
