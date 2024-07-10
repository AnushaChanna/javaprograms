package assignments;
public class A17_UpdateGlobalVariable_Static_Nonstatic 
{
	int age = 16;
	static String name = "Rohitha";
	public static void main(String[] args) 
	{
		System.out.println("Original static global variable " + name);
		name = "Anusha";
		System.out.println("updated static global variable " + name);
		
		A17_UpdateGlobalVariable_Static_Nonstatic A1=new A17_UpdateGlobalVariable_Static_Nonstatic();
		System.out.println("original non static global variable " + A1.age);
		// A1.age = 26;
		System.out.println(A1.age = 26);
	}
}
