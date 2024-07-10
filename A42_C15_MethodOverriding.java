package assignments;
class parentclass
{
	void A41_C15_MethodOverriding()
	{
		System.out.println("method overriding of parent class");
	}
}
public class A42_C15_MethodOverriding extends parentclass
{
	void A41_C15_MethodOverriding()
	{
		System.out.println("method overriding of child class");
	}
	public static void main(String[] args) 
	{
		A42_C15_MethodOverriding M1=new A42_C15_MethodOverriding();
		M1.A41_C15_MethodOverriding();
	}
}
