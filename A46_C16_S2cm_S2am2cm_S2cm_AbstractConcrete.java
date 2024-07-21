package java_Programs;
/* S2cm_S2am2cm_S2cm - 
  Super most class with 2concretemethod 
 Super class with 2 abstact method  and 2 concrete method
 sub class with 2 concrete methos*/

class supermostclass
	{
		void add()
		{
			System.out.println("Concrete method non static- supermost class method 1 is ADD");
		}
		static void sub()
		{
			System.out.println("concrete method static - supermost class method 2 is SUB");
		}
	}
abstract class superclass extends supermostclass
	{
		void div()
		{
			System.out.println("abstract - concrete method 1 is DIV");
		}
		void mul()
		{
			System.out.println("abstract - concrete method 2 is MUL");
		}
	abstract void div1();
	abstract void mul1();
	}
public class A46_C16_S2cm_S2am2cm_S2cm_AbstractConcrete extends superclass
	{
		void add1()
			{
				System.out.println("add1 - non static concrete method");
		
			}
		static void sub1()
			{
			System.out.println("sub1 - Static concrete method");
			}
		
		void div1()
			{
			System.out.println("div1 - unimplemented - Abstract class abstract method ");
			}
		
		void mul1() 
			{
			System.out.println("mul1 - unimplemented - Abstract class abstract method ");
			}
	public static void main(String[] args) 
		{
		A46_C16_S2cm_S2am2cm_S2cm_AbstractConcrete A1=new A46_C16_S2cm_S2am2cm_S2cm_AbstractConcrete();
		//concrete class concrete method
			A1.add1();
			sub1();
		//supermost class with concrete methods
			A1.add();
			sub();
		//abstrac with concrete methods & abstract methods
			A1.div();
			A1.mul();
			A1.div1();
			A1.mul1();	
		}
}


