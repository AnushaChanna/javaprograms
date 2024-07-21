package java_Programs;
public class A16_CallingGlobalVariables_InMainMethod 
{
	int age = 34;
	static double salary = 67890.33;
	
	public static void main(String[] args)
	{
		System.out.println(salary);
		A16_CallingGlobalVariables_InMainMethod A1=new A16_CallingGlobalVariables_InMainMethod();
		System.out.println(A1.age);
	}	

}
