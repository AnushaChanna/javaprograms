package assignments;

public class A18_AreaOfTheCircle_GlobalVariable 

//identifying area of the circle using global variable in all methods

{
	static double  Pi = 3.14;
	
	static void AreaOfTheCircle()
	{
		// formulae of area of the circle is PiRsquare
		int r = 6;
		double area= Pi*r*r;
		System.out.println("area of the circle for static method " + area);
	}
	public static void main(String[] args)
	{
		int r = 11;
		double area = Pi*r*r;
		System.out.println("Area of the circle of main method " + area);
		AreaOfTheCircle();
	}

}
