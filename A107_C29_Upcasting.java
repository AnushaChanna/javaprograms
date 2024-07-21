package java_Programs;

class Parent_Upcast
{
	void add()
	{
		System.out.println("Parent_Upcast add Method1");
	}
	void sub()
	{
		System.out.println("Parent_Upcast sub Method2");
	}
}
public class A107_C29_Upcasting extends Parent_Upcast
{
	static void mul()
	{
		System.out.println("Child Upcasting static method multiplication");
	}
	void div()
	{
		System.out.println("Child Upcasting non-static method division");
	}
public static void main(String[] args) 
{
	System.out.println("Child class outputs");
	mul();
	A107_C29_Upcasting A1=new A107_C29_Upcasting();
	A1.div();
	System.out.println(" ");
	System.out.println("parent class outputs");
	Parent_Upcast P1=new A107_C29_Upcasting();
	P1.add();
	P1.sub();
}
}
