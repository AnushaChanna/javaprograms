package java_Programs;

public class A122_C38_Encapsulation
{

	private String username="Anusha@gmail.com";
	public String getusername()
	{
		return username;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
	
	private String mblnum="9876543210"; 
	
	public String getmblnum()
	{
		return mblnum;
	}
	public void setmblnum(String mblnum)
	{
		this.mblnum=mblnum;
	}
		
	public static void main(String[] args) 
	{
		A122_C38_Encapsulation A1=new A122_C38_Encapsulation();
		A1.setusername("Setmail@gmail.com");
		System.out.println(A1.getusername());
		A1.setmblnum("setmblnum> 9567890123");
		System.out.println(A1.getmblnum());
	}
}
