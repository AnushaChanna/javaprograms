package java_Programs;

interface amazonlogin
{
	void loginwithemail();
	void loginwithmblnum();
}
abstract class facebooklogin
{
	abstract void loginwithgmail();
	static void loginwithmobile()
	{
		System.out.println("abstract class concrete method facebook loginwith mobile");
	}
}
public class A50_C18_Class_extends_and_Implements extends facebooklogin implements amazonlogin
{
	void unlockthemobile()
	{
		System.out.println(" nonstatic sub class concrete method unlock mobile with password");
	}
	static void lockmobile()
	{
		System.out.println(" static sub class concrete method lock mobile with password");
	}
	//unimplemented methods

	//interface - will have by default public infront of methods
	public void loginwithemail()
	{
		System.out.println("interface login amazon with email");
	}
	
	public void loginwithmblnum() 
	{
		System.out.println("interface login amazon with mbl num");
	}
	//abstract will not have public infront of methods
	void loginwithgmail()
	{
		System.out.println("abstract class non static login facebook with gmail");	
	}
	public static void main(String[] args) 
	{
		A50_C18_Class_extends_and_Implements A1 = new A50_C18_Class_extends_and_Implements();
		A1.unlockthemobile();
		lockmobile();
		//interface
		A1.loginwithemail();
		A1.loginwithmblnum();
		//abstract
		A1.loginwithgmail();
		loginwithmobile();
	}
	
}
