package assignments;
interface Amazonlogin_WithMobile
{
	void mobile();
}
interface Amazonlogin_withEmail 
{
	void email();
}
public class A49_C17_Interface_MultipleInheritance implements Amazonlogin_withEmail,Amazonlogin_WithMobile 
{
	public void mobile()
	{
		System.out.println("login with mobile");
	}
	public void email()
	{
		System.out.println("login with email");		
	}
	
		public static void main(String[] args)
		{
			new A49_C17_Interface_MultipleInheritance().mobile();
			new A49_C17_Interface_MultipleInheritance().email();
		}		
}
