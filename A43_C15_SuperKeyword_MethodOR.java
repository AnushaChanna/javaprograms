package assignments;
class methodoverridingwithsuperkeyword
{
	void add()
	{
		System.out.println("Print add of value parent class");
	}
}
public class A43_C15_SuperKeyword_MethodOR extends methodoverridingwithsuperkeyword
{
	void add()
	{
		System.out.println("Print add of value child class");
		super.add();
	}
	public static void main(String[] args) 
	{
		A43_C15_SuperKeyword_MethodOR S1=new A43_C15_SuperKeyword_MethodOR();
		S1.add();
	}
}
