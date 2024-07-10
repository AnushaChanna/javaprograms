package assignments;
abstract class addition
{
	abstract void add();
}
public class A45_Abstract_With_Concrete extends addition
{
	void add1()
	{
		System.out.println("Print addition value");
	}
	static void substract()
	{
		System.out.println("print substraction value");
	}
	
	void add() 
	{
		System.out.println("Print unimplemented abstracted method ");		
	}
	public static void main(String[] args)
	{
		new A45_Abstract_With_Concrete().add1();
		substract();
		new A45_Abstract_With_Concrete().add();
	}
}

