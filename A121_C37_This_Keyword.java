package java_Programs;
public class A121_C37_This_Keyword
{
	int age;
	String name;
	double salary;
	void studentdetails(int age , String name , Double salary)
	{
		this.age=age;
		this.salary=salary;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		A121_C37_This_Keyword C1=new A121_C37_This_Keyword();
		C1.studentdetails(27, "Anusha", 10919.96);
		System.out.println(C1.age);
		System.out.println(C1.name);
		System.out.println(C1.salary);
	}

}