package assignments;

public class A14_CallingConstructorWith_WithoutParameters
{

	A14_CallingConstructorWith_WithoutParameters()
	{
		System.out.println("constructor without parameters");
	}
	A14_CallingConstructorWith_WithoutParameters(int a)
	{
		System.out.println("Constructor with parameter - int datatype");
	}
	public static void main(String[] args) 
	{
		new A14_CallingConstructorWith_WithoutParameters();
		new A14_CallingConstructorWith_WithoutParameters(129);
	}

}