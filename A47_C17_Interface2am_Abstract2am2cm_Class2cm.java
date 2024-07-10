package assignments;
interface Facebook
	{
	//interface class
	void LoginWithMobile();
	void LoginWithEmail();
	}
abstract class FlightBooking implements Facebook
	{
	//Abstractclass
	//2AM
	abstract void BookthroughWebsite();
	abstract void BookthroughApplication();
	//2CM
	static void CancelBookingViaWebsite()
		{
		System.out.println("abstract class with concrete method Canceled flight booking Via Website");
		}
	void CancelBookingViaApp()
		{
		System.out.println("abstract class with concrete method Canceled flight booking Via Website");
		}
	}
public class A47_C17_Interface2am_Abstract2am2cm_Class2cm  extends FlightBooking
{
	//2CM-class
	void CameraClick()
	{
		System.out.println("Picture Child class clicked with camera");
	}
	static void MobileClick()
	{
		System.out.println("Picture Child class clicked with Mobile");
	}
	
	//unimplemented methods

	public void LoginWithMobile()
		{
			System.out.println("Print INTERFACE with abstract method LoginWithMobile ");
		
		}
	
	public void LoginWithEmail() 
		{
			System.out.println("Print INTERFACE with abstract method LoginWithEmail");
		}
	
	void BookthroughWebsite()	
		{
			System.out.println("Print abstract class with abstract method BookthroughWebsite");
		}
	
	void BookthroughApplication() 
		{
			System.out.println("Print abstract class with abstract method BookthroughApp");
		}
	
	public static void main(String[] args) 
	{
		A47_C17_Interface2am_Abstract2am2cm_Class2cm A1=new A47_C17_Interface2am_Abstract2am2cm_Class2cm();
		A1.CameraClick();
		MobileClick();
		A1.LoginWithMobile();
		A1.LoginWithEmail(); 
		A1.BookthroughWebsite();	
		A1.BookthroughApplication(); 
		CancelBookingViaWebsite();
		A1.CancelBookingViaApp();
	}
}

