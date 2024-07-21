package java_Programs;
interface login 
{
	void UnlockMobile();
}
public class A48_C17_Class_inheriting_interface implements login
{
	static void lockmobile()
	{
		System.out.println("lock mobile with pin ");
	}

	public void UnlockMobile()
	{
		System.out.println("unlock mobile with pin");
	}
	public static void main(String[] args) 
	{
	 lockmobile();
	 new A48_C17_Class_inheriting_interface().UnlockMobile();
	}
}
