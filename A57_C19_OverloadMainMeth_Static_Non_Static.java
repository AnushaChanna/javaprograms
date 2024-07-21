package java_Programs;

public class A57_C19_OverloadMainMeth_Static_Non_Static 
{
	public static void main()
	{
		System.out.println("print static main method with non para");
	}
	public  void main(int a)
	{
		System.out.println("print non static main method with int para as 10");
	}
	public static void main(String name)
	{
		System.out.println("print static main method with String para as name Anusha");
	}
	public static void main(String[] args) 
	{
		main();
		A57_C19_OverloadMainMeth_Static_Non_Static C1=new A57_C19_OverloadMainMeth_Static_Non_Static();
		C1.main(10);
		main("Anusha");
	}
}
