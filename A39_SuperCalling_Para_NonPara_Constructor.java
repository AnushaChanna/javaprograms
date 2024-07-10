package assignments;
class constructor1 extends constructor2
{
	constructor1()
	{
		super("Anusha");
		System.out.println("print super class result as constructor1");
	}
}
class constructor2
{
	constructor2(String name)
	{
		System.out.println("print super class result as constructor2");
	}
}
public class A39_SuperCalling_Para_NonPara_Constructor extends constructor1
{
	A39_SuperCalling_Para_NonPara_Constructor()
	{
		System.out.println("print sub class result as A39_SuperCalling_Para_NonPara_Constructor");
	}

	public static void main(String[] args)
	{
		A39_SuperCalling_Para_NonPara_Constructor A1=new A39_SuperCalling_Para_NonPara_Constructor();
	}
}

/* o/p :
 * print super class result as constructor2
 * print super class result as constructor1
 * print sub class result as A39_SuperCalling_Para_NonPara_Constructor*/
